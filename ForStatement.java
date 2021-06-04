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
		try
		{
			SymbolTableVariableDeclarationEntry variable = new SymbolTableVariableDeclarationEntry("Int", "i");
			variable.SetValue(0.0);
			symbolTable.AddEntry(variable);
		}
		catch(SymbolTable.VariableAlreadyExistsException ex)
		{
			symbolTable.GetVariable("i").SetValue(0.0);
		}
		
		while (symbolTable.GetValueOfExpression(loopExpression) > 0)
		{
			for (Statement statement : Statements)
			{
				statement.Run();
			}
			
			SymbolTableVariableDeclarationEntry variable = symbolTable.GetVariable("i");
			variable.SetValue(variable.GetValue() + 1);
		}
	}
}