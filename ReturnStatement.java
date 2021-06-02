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
		
	}
	
	public Double GetValue()
	{
		return value_;
	}
}