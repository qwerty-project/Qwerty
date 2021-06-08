import java.util.ArrayList;

public class FunctionDeclarationListener extends QwertyBaseListener
{
	private SymbolTable symbolTable;
	private ArrayList<SymbolTableVariableDeclarationEntry> parameters;
	
	public void SetSymbolTable(SymbolTable symbolTable_)
	{
		symbolTable = symbolTable_;
	}
	
	@Override
    public void enterFunction_declaration(QwertyParser.Function_declarationContext ctx)
	{
		parameters = new ArrayList<SymbolTableVariableDeclarationEntry>();
	}
	
	@Override
    public void exitFunction_declaration(QwertyParser.Function_declarationContext ctx)
	{
		String functionName = ctx.VARNAME().getText();
		String returnType = ctx.type().getText();
		
		StatementVisitor statement_visitor =  new StatementVisitor();
		statement_visitor.SetSymbolTable(symbolTable);
		
		statement_visitor.visit(ctx.function_block());
		
		Statement statement = statement_visitor.GetOutput();
		
		SymbolTableFunctionDeclarationEntry newFunction = new SymbolTableFunctionDeclarationEntry(returnType, functionName, parameters);
		newFunction.AddStatement(statement);
		try
		{
			symbolTable.AddEntry(newFunction);
		}
		catch (SymbolTable.VariableAlreadyExistsException ex)
		{
			System.out.println("Function already exists!");
		}
	}
	
	@Override
	public void exitFunction_parameter(QwertyParser.Function_parameterContext ctx)
	{
		String variableType = ctx.type().getText();
		String varname = ctx.VARNAME().getText();
		
		parameters.add(new SymbolTableVariableDeclarationEntry(variableType, varname, null));
	}
}