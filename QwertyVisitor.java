// Generated from Qwerty.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link QwertyParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface QwertyVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link QwertyParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(QwertyParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link QwertyParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt(QwertyParser.StmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link QwertyParser#conditional}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditional(QwertyParser.ConditionalContext ctx);
	/**
	 * Visit a parse tree produced by {@link QwertyParser#if_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_statement(QwertyParser.If_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link QwertyParser#elif_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElif_statement(QwertyParser.Elif_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link QwertyParser#else_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElse_statement(QwertyParser.Else_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link QwertyParser#conditional_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditional_block(QwertyParser.Conditional_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link QwertyParser#while_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_statement(QwertyParser.While_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link QwertyParser#for_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_statement(QwertyParser.For_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link QwertyParser#variable_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable_declaration(QwertyParser.Variable_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link QwertyParser#function_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_declaration(QwertyParser.Function_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link QwertyParser#function_parameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_parameters(QwertyParser.Function_parametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link QwertyParser#function_parameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_parameter(QwertyParser.Function_parameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link QwertyParser#function_arguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_arguments(QwertyParser.Function_argumentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link QwertyParser#function_argument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_argument(QwertyParser.Function_argumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link QwertyParser#function_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_block(QwertyParser.Function_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link QwertyParser#function_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_call(QwertyParser.Function_callContext ctx);
	/**
	 * Visit a parse tree produced by {@link QwertyParser#function_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_name(QwertyParser.Function_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link QwertyParser#system_function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSystem_function(QwertyParser.System_functionContext ctx);
	/**
	 * Visit a parse tree produced by {@link QwertyParser#custom_function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCustom_function(QwertyParser.Custom_functionContext ctx);
	/**
	 * Visit a parse tree produced by {@link QwertyParser#return_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn_stmt(QwertyParser.Return_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link QwertyParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(QwertyParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link QwertyParser#system_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSystem_type(QwertyParser.System_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link QwertyParser#custom_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCustom_type(QwertyParser.Custom_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link QwertyParser#value_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue_expression(QwertyParser.Value_expressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code greaterthanExpression}
	 * labeled alternative in {@link QwertyParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGreaterthanExpression(QwertyParser.GreaterthanExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code cosExpression}
	 * labeled alternative in {@link QwertyParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCosExpression(QwertyParser.CosExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code greaterthanorequalExpression}
	 * labeled alternative in {@link QwertyParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGreaterthanorequalExpression(QwertyParser.GreaterthanorequalExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code numberExpression}
	 * labeled alternative in {@link QwertyParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumberExpression(QwertyParser.NumberExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code multiplyDivideExpression}
	 * labeled alternative in {@link QwertyParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplyDivideExpression(QwertyParser.MultiplyDivideExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code notExpression}
	 * labeled alternative in {@link QwertyParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotExpression(QwertyParser.NotExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code falseExpression}
	 * labeled alternative in {@link QwertyParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFalseExpression(QwertyParser.FalseExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code varnameExpression}
	 * labeled alternative in {@link QwertyParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarnameExpression(QwertyParser.VarnameExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code paranthesesExpression}
	 * labeled alternative in {@link QwertyParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParanthesesExpression(QwertyParser.ParanthesesExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code orExpression}
	 * labeled alternative in {@link QwertyParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrExpression(QwertyParser.OrExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code powerExpression}
	 * labeled alternative in {@link QwertyParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPowerExpression(QwertyParser.PowerExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code lessthanExpression}
	 * labeled alternative in {@link QwertyParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLessthanExpression(QwertyParser.LessthanExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code decimalExpression}
	 * labeled alternative in {@link QwertyParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecimalExpression(QwertyParser.DecimalExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code andExpression}
	 * labeled alternative in {@link QwertyParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndExpression(QwertyParser.AndExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stringExpression}
	 * labeled alternative in {@link QwertyParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringExpression(QwertyParser.StringExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code trueExpression}
	 * labeled alternative in {@link QwertyParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrueExpression(QwertyParser.TrueExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code tanExpression}
	 * labeled alternative in {@link QwertyParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTanExpression(QwertyParser.TanExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code sinExpression}
	 * labeled alternative in {@link QwertyParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSinExpression(QwertyParser.SinExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code addSubtractExpression}
	 * labeled alternative in {@link QwertyParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddSubtractExpression(QwertyParser.AddSubtractExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code factorialExpresion}
	 * labeled alternative in {@link QwertyParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactorialExpresion(QwertyParser.FactorialExpresionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code equalEqualExpression}
	 * labeled alternative in {@link QwertyParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualEqualExpression(QwertyParser.EqualEqualExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code lessthanorequalExpression}
	 * labeled alternative in {@link QwertyParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLessthanorequalExpression(QwertyParser.LessthanorequalExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code functioncallExpression}
	 * labeled alternative in {@link QwertyParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctioncallExpression(QwertyParser.FunctioncallExpressionContext ctx);
}