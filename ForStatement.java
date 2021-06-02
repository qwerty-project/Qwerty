public class ForStatement extends Statement
{
	private QwertyParser.Value_expressionContext loopExpression;
	
	ForStatement(SymbolTable symboltable_, QwertyParser.Value_expressionContext value_)
	{
		super(symboltable_, StatementType.For);
		
		loopExpression = value_;
	}
	
	// Logic to loop
	@Override
	public void Run()
	{
		
	}
}