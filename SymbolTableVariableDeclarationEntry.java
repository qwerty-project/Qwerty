import java.util.ArrayList;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class SymbolTableVariableDeclarationEntry extends SymbolTableEntry
{
	boolean UseDouble = false;
	public Double ValueDouble;
    public QwertyParser.Value_expressionContext Value = null;
	
	public SymbolTableVariableDeclarationEntry(String type, String name)
	{
		super(type, name, VariableType.Variable);
        
		ValueDouble = 0.0;
	}
	
	public SymbolTableVariableDeclarationEntry(String type, String name, QwertyParser.Value_expressionContext value)
	{
		super(type, name, VariableType.Variable);
        
		Value = value;
	}
	
	@Override
	public void Print()
	{
		System.out.println("Variable Name: " + Name + " | Variable Type: " + Type);
	}
	
	public Double GetValue()
	{
		if (UseDouble)
		{
			return ValueDouble;
		}
		
		ExpressionListener listener = new ExpressionListener();
		listener.SetSymbolTable(symboltable);
		QwertyLexer lexer = new QwertyLexer(CharStreams.fromString(Value.getText()));

        CommonTokenStream tokens = new CommonTokenStream(lexer);
        QwertyParser parser = new QwertyParser(tokens);
        parser.addParseListener((ParseTreeListener) listener);
        parser.program();
		
		return listener.GetResult();
	}
	
	public void SetValue(Double value)
	{
		UseDouble = true;
		ValueDouble = value;
	}
}