import java.util.ArrayList;

public class SymbolTable
{
    private ArrayList<SymbolTableEntry> entries = new ArrayList<SymbolTableEntry>();

    public SymbolTable()
    {
    }

    public bool DoesVariableExist(String varname)
    {
        foreach(SymbolTableEntry entry in entries)
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
    }

    public void AddEntry(SymbolTableEntry newEntry) throws
    {
        if (DoesVariableExist(newEntry.Name))
        {
            throw new VariableAlreadyExistsException("Variable: " + newEntry.Name + " already exists!")
        }

        entries.Add(newEntry);
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
}
