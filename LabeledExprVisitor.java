// Generated from LabeledExpr.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link LabeledExprParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface LabeledExprVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link LabeledExprParser#parse}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParse(LabeledExprParser.ParseContext ctx);
	/**
	 * Visit a parse tree produced by {@link LabeledExprParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(LabeledExprParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link LabeledExprParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStat(LabeledExprParser.StatContext ctx);
	/**
	 * Visit a parse tree produced by {@link LabeledExprParser#var}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar(LabeledExprParser.VarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ConstType}
	 * labeled alternative in {@link LabeledExprParser#const_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstType(LabeledExprParser.ConstTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TypeStr}
	 * labeled alternative in {@link LabeledExprParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeStr(LabeledExprParser.TypeStrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TypeInt}
	 * labeled alternative in {@link LabeledExprParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeInt(LabeledExprParser.TypeIntContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TypeFloat}
	 * labeled alternative in {@link LabeledExprParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeFloat(LabeledExprParser.TypeFloatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TypeBool}
	 * labeled alternative in {@link LabeledExprParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeBool(LabeledExprParser.TypeBoolContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ListaType}
	 * labeled alternative in {@link LabeledExprParser#lista}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListaType(LabeledExprParser.ListaTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link LabeledExprParser#id_lista}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId_lista(LabeledExprParser.Id_listaContext ctx);
	/**
	 * Visit a parse tree produced by {@link LabeledExprParser#expr_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_list(LabeledExprParser.Expr_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link LabeledExprParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(LabeledExprParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link LabeledExprParser#if_stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_stat(LabeledExprParser.If_statContext ctx);
	/**
	 * Visit a parse tree produced by {@link LabeledExprParser#condition_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition_block(LabeledExprParser.Condition_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link LabeledExprParser#stat_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStat_block(LabeledExprParser.Stat_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link LabeledExprParser#while_stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_stat(LabeledExprParser.While_statContext ctx);
	/**
	 * Visit a parse tree produced by {@link LabeledExprParser#for_stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_stat(LabeledExprParser.For_statContext ctx);
	/**
	 * Visit a parse tree produced by {@link LabeledExprParser#boolean_literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolean_literal(LabeledExprParser.Boolean_literalContext ctx);
	/**
	 * Visit a parse tree produced by {@link LabeledExprParser#println}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintln(LabeledExprParser.PrintlnContext ctx);
	/**
	 * Visit a parse tree produced by the {@code notExpr}
	 * labeled alternative in {@link LabeledExprParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotExpr(LabeledExprParser.NotExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code unaryMinusExpr}
	 * labeled alternative in {@link LabeledExprParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryMinusExpr(LabeledExprParser.UnaryMinusExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code multiplicationExpr}
	 * labeled alternative in {@link LabeledExprParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplicationExpr(LabeledExprParser.MultiplicationExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code atomExpr}
	 * labeled alternative in {@link LabeledExprParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtomExpr(LabeledExprParser.AtomExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code orExpr}
	 * labeled alternative in {@link LabeledExprParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrExpr(LabeledExprParser.OrExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code additiveExpr}
	 * labeled alternative in {@link LabeledExprParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditiveExpr(LabeledExprParser.AdditiveExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code relationalExpr}
	 * labeled alternative in {@link LabeledExprParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelationalExpr(LabeledExprParser.RelationalExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code equalityExpr}
	 * labeled alternative in {@link LabeledExprParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualityExpr(LabeledExprParser.EqualityExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code andExpr}
	 * labeled alternative in {@link LabeledExprParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndExpr(LabeledExprParser.AndExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parExpr}
	 * labeled alternative in {@link LabeledExprParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParExpr(LabeledExprParser.ParExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code numberAtom}
	 * labeled alternative in {@link LabeledExprParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumberAtom(LabeledExprParser.NumberAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code booleanAtom}
	 * labeled alternative in {@link LabeledExprParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanAtom(LabeledExprParser.BooleanAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IDlistaAtom}
	 * labeled alternative in {@link LabeledExprParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIDlistaAtom(LabeledExprParser.IDlistaAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code idAtom}
	 * labeled alternative in {@link LabeledExprParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdAtom(LabeledExprParser.IdAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stringAtom}
	 * labeled alternative in {@link LabeledExprParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringAtom(LabeledExprParser.StringAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code nullAtom}
	 * labeled alternative in {@link LabeledExprParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNullAtom(LabeledExprParser.NullAtomContext ctx);
}