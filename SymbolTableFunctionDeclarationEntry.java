import java.util.ArrayList;

public class SymbolTableFunctionDeclarationEntry extends SymbolTableEntry
{
	
	private ArrayList<SymbolTableVariableDeclarationEntry> Parameters;
	
	public SymbolTableFunctionDeclarationEntry(String type, String name, ArrayList<SymbolTableVariableDeclarationEntry> parameters)
	{
		super(type, name, VariableType.Function);
		
		Parameters = parameters;
	}
	
	public SymbolTableFunctionDeclarationEntry(String type, String name)
	{
		super(type, name, VariableType.Function);
		
		Parameters = new ArrayList<SymbolTableVariableDeclarationEntry>();
	}
	
	@Override
	public void Print()
	{
		System.out.print("Function Name: " + Name + " | Function Type: " + Type + " | ");
		PrintParameters();
		System.out.println("");
	}
	
	public void PrintParameters()
	{
		for(SymbolTableVariableDeclarationEntry parameter : Parameters)
		{
			System.out.print("Name: " + parameter.Name + " Type: " + parameter.Type + ", ");
		}
	}
	
	public Double RunFunction(ArrayList<SymbolTableVariableDeclarationEntry> parameters)
	{
		Double outputValue = 0.0;
		if (Name.equals("Print"))
		{
			for (SymbolTableVariableDeclarationEntry parameter : parameters)
			{
				System.out.println("Expression Result: " + parameter.GetValue());
			}
		}
		
		return outputValue;
	}
}