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
}