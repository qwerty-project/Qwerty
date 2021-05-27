import java.util.ArrayList;

public class SymbolTable
{
    private ArrayList<SymbolTableEntry> entries = new ArrayList<SymbolTableEntry>();

    public SymbolTable()
    {
    }

    public boolean DoesVariableExist(String varname)
    {
        for(SymbolTableEntry entry : entries)
        {
            if (entry.Name == varname)
            {
                return true;
            }
        }

        return false;
    }

    public SymbolTableEntry GetVariable(String varname)
    {
        for (SymbolTableEntry entry : entries)
        {
            if (entry.Name == varname)
            {
                return entry;
            }
        }
		
		return null;
    }

    public void AddEntry(SymbolTableEntry newEntry) throws VariableAlreadyExistsException
    {
        if (DoesVariableExist(newEntry.Name))
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
}
