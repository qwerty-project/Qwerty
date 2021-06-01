import java.util.ArrayList;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class SymbolTable
{
    private ArrayList<SymbolTableEntry> entries;

    public SymbolTable()
    {
		entries = new ArrayList<SymbolTableEntry>();
    }
	
	public void AddSystemFunctions()
	{
		entries.add(new SymbolTableFunctionDeclarationEntry("Void", "Print"));
	}

    public boolean DoesVariableExist(String varname)
    {
        for(SymbolTableEntry entry : entries)
        {
            if (entry.Name.equals(varname) && entry.VarType == VariableType.Variable)
            {
                return true;
            }
        }

        return false;
    }

    public boolean DoesFunctionExist(String functionname)
    {
        for(SymbolTableEntry entry : entries)
        {
            if (entry.Name.equals(functionname) && entry.VarType == VariableType.Function)
            {
                return true;
            }
        }

        return false;
    }

    public SymbolTableVariableDeclarationEntry GetVariable(String varname)
    {
        for (SymbolTableEntry entry : entries)
        {
            if (entry.Name.equals(varname) && entry.VarType == VariableType.Variable)
            {
                return (SymbolTableVariableDeclarationEntry) entry;
            }
        }
		
		return null;
    }

    public SymbolTableFunctionDeclarationEntry GetFunction(String functionname)
    {
        for (SymbolTableEntry entry : entries)
        {
            if (entry.Name.equals(functionname) && entry.VarType == VariableType.Function)
            {
                return (SymbolTableFunctionDeclarationEntry) entry;
            }
        }
		
		return null;
    }

    public void AddEntry(SymbolTableEntry newEntry) throws VariableAlreadyExistsException
    {
        if (DoesVariableExist(newEntry.Name) || DoesFunctionExist(newEntry.Name))
        {
            throw new VariableAlreadyExistsException("Variable: " + newEntry.Name + " already exists!");
        }

        entries.add(newEntry);
    }

    public void DeleteVariable(String varname)
    {

    }

    public class VariableAlreadyExistsException extends Exception
    {
        public VariableAlreadyExistsException(String s)
        {
            super(s);
        }
    }
	
	public void Print()
	{
		System.out.println("Symbol Table content:");
		for (SymbolTableEntry entry : entries)
		{
			entry.Print();
		}
	}
	
	public Double GetValueOfVariable(String varname)
	{
		SymbolTableVariableDeclarationEntry variable = GetVariable(varname);
		if (variable == null)
		{
			return 0.0;
		}
		
		ExpressionListener listener = new ExpressionListener();
		listener.SetSymbolTable(this);
		
		QwertyLexer lexer = new QwertyLexer(CharStreams.fromString(variable.Value.getText()));

        CommonTokenStream tokens = new CommonTokenStream(lexer);
        QwertyParser parser = new QwertyParser(tokens);
        parser.addParseListener((ParseTreeListener) listener);
        parser.program();
		
		return listener.GetResult();
	}
	
	public Double RunFunction(String functionName, ArrayList<SymbolTableVariableDeclarationEntry> functionArguments)
	{
		SymbolTableFunctionDeclarationEntry function = GetFunction(functionName);
		
		if (function == null)
		{
			return 0.0;
		}
		
		return function.RunFunction(functionArguments);
	}
}
