public class IFConditionalStatement extends Statement
{
	private QwertyParser.Value_expressionContext booleanExpression;

	IFConditionalStatement(SymbolTable symboltable_, QwertyParser.Value_expressionContext value_)
	{
		super(symboltable_, StatementType.IFConditional);

		booleanExpression = value_;
	}

	// Check if boolean expression is Truthy or Falsy
	public boolean check()
	{
		return symbolTable.GetValueOfExpression(booleanExpression) > 0;
	}
}
