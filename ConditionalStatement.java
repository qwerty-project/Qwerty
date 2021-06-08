import java.util.ArrayList;

public class ConditionalStatement extends Statement
{
	private IFConditionalStatement If = null;
	private ArrayList<ELIFConditionalStatement> Elifs = new ArrayList<ELIFConditionalStatement>();
	private ELSEConditionalStatement Else = null;
	
	public ConditionalStatement(SymbolTable symboltable, IFConditionalStatement if_)
	{
		super(symboltable, StatementType.Conditional);
		
		If = if_;
	}
	
	public void AddElseIfStatement(ELIFConditionalStatement elif_)
	{
		Elifs.add(elif_);
	}
	
	public void AddElseStatement(ELSEConditionalStatement else_)
	{
		Else = else_;
	}
	
	@Override
	public void Run()
	{
		if (If != null && If.check())
		{
			If.Run();
			CheckReturn(If);
			return;
		}
		
		for (ELIFConditionalStatement Elif : Elifs)
		{
			if (Elif.check())
			{
				Elif.Run();
				CheckReturn(Elif);
				return;
			}
		}
		
		if (Else != null)
		{
			Else.Run();
			CheckReturn(Else);
		}
	}
	
	@Override
	public void Print(int indent)
	{
		if (If != null)
		If.Print(indent + 1);
		
		for(Statement statement : Elifs)
		{
			statement.Print(indent + 1);
		}
		
		if (Else != null)
		Else.Print(indent + 1);
	}
}