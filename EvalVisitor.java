// import org.antlr.v4.runtime.misc.NotNull;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EvalVisitor extends LabeledExprBaseVisitor<Value> {

    // used to compare floating point numbers
    public static final double SMALL_VALUE = 0.00000000001;

    // store variables (there's only one global scope!)
    private Map<String, Value> memory = new HashMap<String, Value>();

    @Override
    public Value visitIDlistaAtom(LabeledExprParser.IDlistaAtomContext ctx) {
        return this.visit(ctx.id_lista());
    }

    @Override
    public Value visitId_lista(LabeledExprParser.Id_listaContext ctx) {
        int position = Integer.parseInt(ctx.IntegerLiteral().getText());
        String id = ctx.ID().getText();
        Value value = null;
        if (memory.containsKey(id)) {
            value = ((Value[]) memory.get(id).value)[position];
        }
        return value;
    }

    @Override
    public Value visitListaType(LabeledExprParser.ListaTypeContext ctx) {
        String id = ctx.ID().getText();
        int tamanho = Integer.parseInt(ctx.IntegerLiteral().getText());
        Value[] array = new Value[tamanho];
        memory.put(id, new Value(array));

        return new Value(array);
    }

    @Override
    public Value visitConstType(LabeledExprParser.ConstTypeContext ctx) {
        String id = ctx.ID().getText();
        Value value = this.visit(ctx.expr());
        if (!memory.containsKey(id)) {
            memory.put(id, value);
            return value;
        }
        System.out.println("Deu ruim");
        return value;

    }

    // assignment/id overrides
    @Override
    public Value visitAssignment(LabeledExprParser.AssignmentContext ctx) {
        Value value = this.visit(ctx.expr());
        if (ctx.ID() != null) {
            String id = ctx.ID().getText();
            memory.put(id, value);
            return value;
        }
        int position = Integer.parseInt(ctx.id_lista().IntegerLiteral().getText());
        String id = ctx.id_lista().ID().getText();
        Value valueMemory = this.visit(ctx.id_lista());

        ((Value[]) memory.get(id).value)[position] = value;

        return value;
    }

    @Override
    public Value visitIdAtom(LabeledExprParser.IdAtomContext ctx) {
        String id = ctx.getText();
        Value value = memory.get(id);
        if (value == null) {
            throw new RuntimeException("no such variable: " + id);
        }
        return value;
    }

    // atom overrides
    @Override
    public Value visitStringAtom(LabeledExprParser.StringAtomContext ctx) {
        String str = ctx.getText();
        // strip quotes
        str = str.substring(1, str.length() - 1).replace("\"\"", "\"");
        return new Value(str);
    }

    @Override
    public Value visitNumberAtom(LabeledExprParser.NumberAtomContext ctx) {
        return new Value(Double.valueOf(ctx.getText()));
    }

    @Override
    public Value visitBooleanAtom(LabeledExprParser.BooleanAtomContext ctx) {
        return new Value(Boolean.valueOf(ctx.getText()));
    }

    @Override
    public Value visitNullAtom(LabeledExprParser.NullAtomContext ctx) {
        return new Value(null);
    }

    // expr overrides
    @Override
    public Value visitParExpr(LabeledExprParser.ParExprContext ctx) {
        return this.visit(ctx.expr());
    }

    // @Override
    // public Value visitPowExpr(LabeledExprParser.PowExprContext ctx) {
    // Value left = this.visit(ctx.expr(0));
    // Value right = this.visit(ctx.expr(1));
    // return new Value(Math.pow(left.asDouble(), right.asDouble()));
    // }

    @Override
    public Value visitUnaryMinusExpr(LabeledExprParser.UnaryMinusExprContext ctx) {
        Value value = this.visit(ctx.expr());
        return new Value(-value.asDouble());
    }

    @Override
    public Value visitNotExpr(LabeledExprParser.NotExprContext ctx) {
        Value value = this.visit(ctx.expr());
        return new Value(!value.asBoolean());
    }

    @Override
    public Value visitMultiplicationExpr(LabeledExprParser.MultiplicationExprContext ctx) {

        Value left = this.visit(ctx.expr(0));
        Value right = this.visit(ctx.expr(1));

        switch (ctx.op.getType()) {
            case LabeledExprParser.MULT:
                return new Value(left.asDouble() * right.asDouble());
            case LabeledExprParser.DIV:
                return new Value(left.asDouble() / right.asDouble());
            case LabeledExprParser.MOD:
                return new Value(left.asDouble() % right.asDouble());
            default:
                throw new RuntimeException("unknown operator: " + LabeledExprParser.tokenNames[ctx.op.getType()]);
        }
    }

    @Override
    public Value visitAdditiveExpr(LabeledExprParser.AdditiveExprContext ctx) {

        Value left = this.visit(ctx.expr(0));
        Value right = this.visit(ctx.expr(1));

        switch (ctx.op.getType()) {
            case LabeledExprParser.PLUS:
                return left.isDouble() && right.isDouble() ? new Value(left.asDouble() + right.asDouble())
                        : new Value(left.asString() + right.asString());
            case LabeledExprParser.MINUS:
                return new Value(left.asDouble() - right.asDouble());
            default:
                throw new RuntimeException("unknown operator: " + LabeledExprParser.tokenNames[ctx.op.getType()]);
        }
    }

    @Override
    public Value visitRelationalExpr(LabeledExprParser.RelationalExprContext ctx) {

        Value left = this.visit(ctx.expr(0));
        Value right = this.visit(ctx.expr(1));

        switch (ctx.op.getType()) {
            case LabeledExprParser.LT:
                return new Value(left.asDouble() < right.asDouble());
            case LabeledExprParser.LTEQ:
                return new Value(left.asDouble() <= right.asDouble());
            case LabeledExprParser.GT:
                return new Value(left.asDouble() > right.asDouble());
            case LabeledExprParser.GTEQ:
                return new Value(left.asDouble() >= right.asDouble());
            default:
                throw new RuntimeException("unknown operator: " + LabeledExprParser.tokenNames[ctx.op.getType()]);
        }
    }

    @Override
    public Value visitEqualityExpr(LabeledExprParser.EqualityExprContext ctx) {

        Value left = this.visit(ctx.expr(0));
        Value right = this.visit(ctx.expr(1));

        switch (ctx.op.getType()) {
            case LabeledExprParser.EQ:
                return left.isDouble() && right.isDouble()
                        ? new Value(Math.abs(left.asDouble() - right.asDouble()) < SMALL_VALUE)
                        : new Value(left.equals(right));
            case LabeledExprParser.NEQ:
                return left.isDouble() && right.isDouble()
                        ? new Value(Math.abs(left.asDouble() - right.asDouble()) >= SMALL_VALUE)
                        : new Value(!left.equals(right));
            default:
                throw new RuntimeException("unknown operator: " + LabeledExprParser.tokenNames[ctx.op.getType()]);
        }
    }

    @Override
    public Value visitAndExpr(LabeledExprParser.AndExprContext ctx) {
        Value left = this.visit(ctx.expr(0));
        Value right = this.visit(ctx.expr(1));
        return new Value(left.asBoolean() && right.asBoolean());
    }

    @Override
    public Value visitOrExpr(LabeledExprParser.OrExprContext ctx) {
        Value left = this.visit(ctx.expr(0));
        Value right = this.visit(ctx.expr(1));
        return new Value(left.asBoolean() || right.asBoolean());
    }

    @Override
    public Value visitFor_stat(LabeledExprParser.For_statContext ctx) {
        int start = this.visit(ctx.assignment()).asDouble().intValue();
        System.out.println(start);
        Value stop = this.visit(ctx.expr());
        System.out.println(stop);
        // for (int i = start; stop.asBoolean(); i++) {
        // this.visit(ctx.stat_block());
        // stop = this.visit(ctx.expr());
        // }
        while (stop.asBoolean()) {

            // evaluate the code block
            this.visit(ctx.stat_block());

            // evaluate the expression
            stop = this.visit(ctx.expr());

            memory.replace(ctx.assignment().ID().getText(),
                    new Value(memory.get(ctx.assignment().ID().getText()).asDouble() + 1));

        }

        return Value.VOID;
    }

    // println override
    @Override
    public Value visitPrintln(LabeledExprParser.PrintlnContext ctx) {
        Value value = this.visit(ctx.expr());
        System.out.println(value);
        return value;
    }

    // if override
    @Override
    public Value visitIf_stat(LabeledExprParser.If_statContext ctx) {

        List<LabeledExprParser.Condition_blockContext> conditions = ctx.condition_block();

        boolean evaluatedBlock = false;

        for (LabeledExprParser.Condition_blockContext condition : conditions) {

            Value evaluated = this.visit(condition.expr());

            if (evaluated.asBoolean()) {
                evaluatedBlock = true;
                // evaluate this block whose expr==true
                this.visit(condition.stat_block());
                break;
            }
        }

        if (!evaluatedBlock && ctx.stat_block() != null) {
            // evaluate the else-stat_block (if present == not null)
            this.visit(ctx.stat_block());
        }

        return Value.VOID;
    }

    // while override
    @Override
    public Value visitWhile_stat(LabeledExprParser.While_statContext ctx) {

        Value value = this.visit(ctx.expr());

        while (value.asBoolean()) {

            // evaluate the code block
            this.visit(ctx.stat_block());

            // evaluate the expression
            value = this.visit(ctx.expr());

        }

        return Value.VOID;
    }
}