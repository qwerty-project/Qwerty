import java.util.ArrayList;

public class FunctionCallStatement extends Statement
{
    String function_name = null;
    ArrayList<SymbolTableVariableDeclarationEntry> arguments = new ArrayList<SymbolTableVariableDeclarationEntry>();

	FunctionCallStatement(SymbolTable symboltable_, QwertyParser.Function_callContext function_call_)
	{
        super(symboltable_, StatementType.FunctionCall);

        function_name = function_call_.function_name().getText();

        for (QwertyParser.Function_argumentContext argument : function_call_.function_arguments().function_argument())
        {
            SymbolTableVariableDeclarationEntry arg = new SymbolTableVariableDeclarationEntry("Int", "temp", argument.value_expression());
            arg.SetSymbolTable(symbolTable);
			arguments.add(arg);
        }
	}

    @Override
    public void Run()
    {
        if (symbolTable.DoesFunctionExist(function_name))
        {
            SymbolTableFunctionDeclarationEntry function = symbolTable.GetFunction(function_name);
			
            function.RunFunction(arguments);
        }
    }
}
