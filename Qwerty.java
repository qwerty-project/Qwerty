import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class Qwerty
{
    public static void main(String[] args)
    {
        CharStream input;

        try
        {
            input = CharStreams.fromFileName(args[0]);
        }
        catch(Exception ex)
        {
            System.out.println(ex);
            return;
        }

        QwertyLexer lexer = new QwertyLexer(input);

        CommonTokenStream tokens = new CommonTokenStream(lexer);
        QwertyParser parser = new QwertyParser(tokens);
	
		SymbolTable symboltable = new SymbolTable();
	
		FunctionDeclarationListener functionDeclarationListener = new FunctionDeclarationListener();
		
		functionDeclarationListener.SetSymbolTable(symboltable);
        parser.addParseListener((ParseTreeListener) functionDeclarationListener);
        parser.program();
		
		symboltable.Print();
    }
}
