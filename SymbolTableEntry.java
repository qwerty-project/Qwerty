public class SymbolTableEntry
{
    public String Type; // type of variable or return type
    public String Name;
    public ValueExpression Value;
    public SymbolTableEntry Scope; // The function it is part of
    public VariableType VariableType; // Is it variable or function_name
    public int Location;
}
