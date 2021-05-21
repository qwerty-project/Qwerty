import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class Qwerty
{
    public static void main(String[] args)
    {
        CharStream input;

        try
        {
            input = CharStreams.fromFileName("input_3.txt");
        }
        catch(Exception ex)
        {
            System.out.println(ex);
            return;
        }

        QwertyLexer lexer = new QwertyLexer(input);

        CommonTokenStream tokens = new CommonTokenStream(lexer);
        QwertyParser parser = new QwertyParser(tokens);

        ExpressionListener listener = new ExpressionListener();
        parser.addParseListener((ParseTreeListener) listener);
        parser.program();

        System.out.println(listener.GetResult());
    }
}
