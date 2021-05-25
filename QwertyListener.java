// Generated from Qwerty.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link QwertyParser}.
 */
public interface QwertyListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link QwertyParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(QwertyParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link QwertyParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(QwertyParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link QwertyParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmt(QwertyParser.StmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link QwertyParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmt(QwertyParser.StmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link QwertyParser#variable_declaration}.
	 * @param ctx the parse tree
	 */
	void enterVariable_declaration(QwertyParser.Variable_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link QwertyParser#variable_declaration}.
	 * @param ctx the parse tree
	 */
	void exitVariable_declaration(QwertyParser.Variable_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link QwertyParser#function_declaration}.
	 * @param ctx the parse tree
	 */
	void enterFunction_declaration(QwertyParser.Function_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link QwertyParser#function_declaration}.
	 * @param ctx the parse tree
	 */
	void exitFunction_declaration(QwertyParser.Function_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link QwertyParser#function_parameters}.
	 * @param ctx the parse tree
	 */
	void enterFunction_parameters(QwertyParser.Function_parametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link QwertyParser#function_parameters}.
	 * @param ctx the parse tree
	 */
	void exitFunction_parameters(QwertyParser.Function_parametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link QwertyParser#function_arguments}.
	 * @param ctx the parse tree
	 */
	void enterFunction_arguments(QwertyParser.Function_argumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link QwertyParser#function_arguments}.
	 * @param ctx the parse tree
	 */
	void exitFunction_arguments(QwertyParser.Function_argumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link QwertyParser#function_block}.
	 * @param ctx the parse tree
	 */
	void enterFunction_block(QwertyParser.Function_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link QwertyParser#function_block}.
	 * @param ctx the parse tree
	 */
	void exitFunction_block(QwertyParser.Function_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link QwertyParser#function_call}.
	 * @param ctx the parse tree
	 */
	void enterFunction_call(QwertyParser.Function_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link QwertyParser#function_call}.
	 * @param ctx the parse tree
	 */
	void exitFunction_call(QwertyParser.Function_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link QwertyParser#return_stmt}.
	 * @param ctx the parse tree
	 */
	void enterReturn_stmt(QwertyParser.Return_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link QwertyParser#return_stmt}.
	 * @param ctx the parse tree
	 */
	void exitReturn_stmt(QwertyParser.Return_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link QwertyParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(QwertyParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link QwertyParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(QwertyParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link QwertyParser#system_type}.
	 * @param ctx the parse tree
	 */
	void enterSystem_type(QwertyParser.System_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link QwertyParser#system_type}.
	 * @param ctx the parse tree
	 */
	void exitSystem_type(QwertyParser.System_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link QwertyParser#custom_type}.
	 * @param ctx the parse tree
	 */
	void enterCustom_type(QwertyParser.Custom_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link QwertyParser#custom_type}.
	 * @param ctx the parse tree
	 */
	void exitCustom_type(QwertyParser.Custom_typeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code cosExpression}
	 * labeled alternative in {@link QwertyParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterCosExpression(QwertyParser.CosExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code cosExpression}
	 * labeled alternative in {@link QwertyParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitCosExpression(QwertyParser.CosExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code numberExpression}
	 * labeled alternative in {@link QwertyParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterNumberExpression(QwertyParser.NumberExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code numberExpression}
	 * labeled alternative in {@link QwertyParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitNumberExpression(QwertyParser.NumberExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code multiplyDivideExpression}
	 * labeled alternative in {@link QwertyParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMultiplyDivideExpression(QwertyParser.MultiplyDivideExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code multiplyDivideExpression}
	 * labeled alternative in {@link QwertyParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMultiplyDivideExpression(QwertyParser.MultiplyDivideExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code varnameExpression}
	 * labeled alternative in {@link QwertyParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterVarnameExpression(QwertyParser.VarnameExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code varnameExpression}
	 * labeled alternative in {@link QwertyParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitVarnameExpression(QwertyParser.VarnameExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code paranthesesExpression}
	 * labeled alternative in {@link QwertyParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterParanthesesExpression(QwertyParser.ParanthesesExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code paranthesesExpression}
	 * labeled alternative in {@link QwertyParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitParanthesesExpression(QwertyParser.ParanthesesExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code powerExpression}
	 * labeled alternative in {@link QwertyParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterPowerExpression(QwertyParser.PowerExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code powerExpression}
	 * labeled alternative in {@link QwertyParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitPowerExpression(QwertyParser.PowerExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code decimalExpression}
	 * labeled alternative in {@link QwertyParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterDecimalExpression(QwertyParser.DecimalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code decimalExpression}
	 * labeled alternative in {@link QwertyParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitDecimalExpression(QwertyParser.DecimalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stringExpression}
	 * labeled alternative in {@link QwertyParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterStringExpression(QwertyParser.StringExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stringExpression}
	 * labeled alternative in {@link QwertyParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitStringExpression(QwertyParser.StringExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code tanExpression}
	 * labeled alternative in {@link QwertyParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterTanExpression(QwertyParser.TanExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tanExpression}
	 * labeled alternative in {@link QwertyParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitTanExpression(QwertyParser.TanExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code sinExpression}
	 * labeled alternative in {@link QwertyParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterSinExpression(QwertyParser.SinExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code sinExpression}
	 * labeled alternative in {@link QwertyParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitSinExpression(QwertyParser.SinExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code addSubtractExpression}
	 * labeled alternative in {@link QwertyParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAddSubtractExpression(QwertyParser.AddSubtractExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code addSubtractExpression}
	 * labeled alternative in {@link QwertyParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAddSubtractExpression(QwertyParser.AddSubtractExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code factorialExpresion}
	 * labeled alternative in {@link QwertyParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterFactorialExpresion(QwertyParser.FactorialExpresionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code factorialExpresion}
	 * labeled alternative in {@link QwertyParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitFactorialExpresion(QwertyParser.FactorialExpresionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code functioncallExpression}
	 * labeled alternative in {@link QwertyParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterFunctioncallExpression(QwertyParser.FunctioncallExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code functioncallExpression}
	 * labeled alternative in {@link QwertyParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitFunctioncallExpression(QwertyParser.FunctioncallExpressionContext ctx);
}