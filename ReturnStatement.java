public class ReturnStatement extends Statement
{
	private Double value_;
	private QwertyParser.Value_expressionContext valueExpression;
	
	public ReturnStatement(SymbolTable symboltable_, QwertyParser.Value_expressionContext value_)
	{
		super(symboltable_, StatementType.Return);
		
		valueExpression = value_;
	}
	
	
	// Calculate return value, given symboltable
	@Override
	public void Run()
	{
		value_ = symbolTable.GetValueOfExpression(valueExpression);
	}
	
	public Double GetValue()
	{
		return value_;
	}
	
	@Override
	public void Print(int indent)
	{
		for (int i = 0; i < indent; i++)
		{
			System.out.print("\t");
		}
		
		System.out.println("Return: " + valueExpression.getText());
	}
}