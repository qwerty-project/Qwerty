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
			return;
		}
		
		for (ELIFConditionalStatement Elif : Elifs)
		{
			if (Elif != null && Elif.check())
			{
				Elif.Run();
				return;
			}
		}
		
		if (Else != null)
		{
			Else.Run();
		}
	}
}