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
		System.out.println("ifcheck: " + (symbolTable.GetValueOfExpression(booleanExpression) > 0));
		return symbolTable.GetValueOfExpression(booleanExpression) > 0;
	}

	@Override
	public void Run()
	{
		System.out.println("testif");

		for (Statement statement : Statements)
		{
			System.out.println("Heeee");
			statement.Run();
		}
	}
}
