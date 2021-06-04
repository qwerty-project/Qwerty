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
		symboltable.AddSystemFunctions();

		VariableDeclarationListener variableDeclarationListener = new VariableDeclarationListener();
		FunctionDeclarationListener functionDeclarationListener = new FunctionDeclarationListener();
		//PrintListener printListener = new PrintListener();
        StatementVisitor statementVisitor = new StatementVisitor();

		variableDeclarationListener.SetSymbolTable(symboltable);
        functionDeclarationListener.SetSymbolTable(symboltable);
		statementVisitor.SetSymbolTable(symboltable);
		//printListener.SetSymbolTable(symboltable);
        parser.addParseListener((ParseTreeListener) variableDeclarationListener);
        parser.addParseListener((ParseTreeListener) functionDeclarationListener);
		//parser.addParseListener((ParseTreeListener) printListener);

        ParseTree tree = parser.program();
        statementVisitor.visit(tree);

        Statement output = statementVisitor.GetOutput();
		
        output.Run();
    }
}
