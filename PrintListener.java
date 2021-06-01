import java.util.ArrayList;

public class PrintListener extends QwertyBaseListener
{
    private SymbolTable symbolTable;
	private ArrayList<SymbolTableVariableDeclarationEntry> functionArguments;
	private int counter = 0;

    public void SetSymbolTable(SymbolTable symbolTable_)
	{
		symbolTable = symbolTable_;
	}
	
	
    @Override
    public void enterFunction_call(QwertyParser.Function_callContext ctx)
	{
		counter = 0;
		functionArguments = new ArrayList<SymbolTableVariableDeclarationEntry>();
	}

    @Override
    public void exitFunction_call(QwertyParser.Function_callContext ctx)
    {
		String functionName = ctx.function_name().getText();
		symbolTable.RunFunction(functionName, functionArguments);
    }
	
	@Override
	public void exitFunction_argument(QwertyParser.Function_argumentContext ctx)
	{
		SymbolTableVariableDeclarationEntry newArgument = new SymbolTableVariableDeclarationEntry("Int", "tmp" + counter, ctx.value_expression());
		newArgument.SetSymbolTable(symbolTable);
		functionArguments.add(newArgument);
	}
}
