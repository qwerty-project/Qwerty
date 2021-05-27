public class SymbolTableEntry
{
    public String Type; // type of variable or return type
    public String Name;
    public QwertyParser.Value_expressionContext Value;
    public SymbolTableEntry Scope; // The function it is part of
    public VariableType VariableType; // Is it variable or function_name
    public int Location;

    public SymbolTableEntry(String type, String name, QwertyParser.Value_expressionContext value, SymbolTableEntry scope, VariableType variableType, int location)
    {
        Type = type;
        Name = name;
        Value = value;
        Scope = scope;
        VariableType = variableType;
        Location = location;
    }

    static SymbolTableEntry CreateVariable(String type, String name, QwertyParser.Value_expressionContext value, int location = -1)
    {
        return new SymbolTableEntry(type, name, value, null, VariableType.Variable, location);
    }

    static SymbolTableEntry CreateFunction(String type, String name, QwertyParser.Value_expressionContext value, int location = -1)
    {
        return new SymbolTableEntry(type, name, value, new SymbolTable(), VariableType.Function, location);
    }
}
