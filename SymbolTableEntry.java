public class SymbolTableEntry
{
    public String Type; // type of variable or return type
    public String Name;
    public VariableType VarType; // Is it variable or function_name
	
	protected SymbolTable symboltable = new SymbolTable();

    public SymbolTableEntry(String type, String name, VariableType variableType)
    {
        Type = type;
        Name = name;
        VarType = variableType;
    }
	
	public void Print()
	{
		System.out.println("Type: " + Type + " Name: " + Name + " VariableType: " + VarType);
	}
	
	public void SetSymbolTable(SymbolTable symboltable_)
	{
		symboltable = symboltable_;
	}
}
