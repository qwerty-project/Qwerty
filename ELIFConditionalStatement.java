public class ELIFConditionalStatement extends Statement
{
	private QwertyParser.Value_expressionContext booleanExpression;

	ELIFConditionalStatement(SymbolTable symboltable_, QwertyParser.Value_expressionContext value_)
	{
		super(symboltable_, StatementType.ELIFConditional);

		booleanExpression = value_;
	}

	// Check if boolean expression is Truthy or Falsy
	public boolean check()
	{
		System.out.println("elifcheck: " + (symbolTable.GetValueOfExpression(booleanExpression) > 0));
		return symbolTable.GetValueOfExpression(booleanExpression) > 0;
	}

	@Override
	public void Run()
	{
		System.out.println("testelif");
	}
}
