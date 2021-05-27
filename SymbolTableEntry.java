public class SymbolTableEntry
{
    public String Type; // type of variable or return type
    public String Name;
    public QwertyParser.Value_expressionContext Value;
    public SymbolTableEntry Scope; // The function it is part of
    public VariableType VarType; // Is it variable or function_name
    public int Location;

    public SymbolTableEntry(String type, String name, QwertyParser.Value_expressionContext value, SymbolTableEntry scope, VariableType variableType, int location)
    {
        Type = type;
        Name = name;
        Value = value;
        Scope = scope;
        VarType = variableType;
        Location = location;
    }

    public static SymbolTableEntry CreateVariable(String type, String name, QwertyParser.Value_expressionContext value)
    {
        return new SymbolTableEntry(type, name, value, null, VariableType.Variable, -1);
    }

    public static SymbolTableEntry CreateVariable(String type, String name, QwertyParser.Value_expressionContext value, int location)
    {
        return new SymbolTableEntry(type, name, value, null, VariableType.Variable, location);
    }

    public static SymbolTableEntry CreateFunction(String type, String name, QwertyParser.Value_expressionContext value)
    {
        return new SymbolTableEntry(type, name, value, null, VariableType.Function, -1);
    }

    public static SymbolTableEntry CreateFunction(String type, String name, QwertyParser.Value_expressionContext value, int location)
    {
        return new SymbolTableEntry(type, name, value, null, VariableType.Function, location);
    }
	
	public void Print()
	{
		System.out.println("Type: " + Type + " Name: " + Name + " Location: " + Location + " VariableType: " + VarType);
	}
}
