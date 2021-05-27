public class FunctionDeclarationListener extends QwertyBaseListener
{
	SymbolTable symbolTable;
	
	public void SetSymbolTable(SymbolTable symbolTable_)
	{
		symbolTable = symbolTable_;
	}
	
	@Override
    public void exitFunction_declaration(QwertyParser.Function_declarationContext ctx)
	{
		String functionName = ctx.VARNAME().getText();
		String returnType = ctx.type().getText();
		//var functionParameters = ctx.function_parameters();
		//var functionBlock = ctx.function_block();
		
		try
		{
			symbolTable.AddEntry(SymbolTableEntry.CreateFunction(returnType, functionName, null));
		}
		catch (SymbolTable.VariableAlreadyExistsException ex)
		{
			System.out.println("Function already exists!");
		}
	}
}