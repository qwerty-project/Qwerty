import java.util.Stack;
import java.lang.Math;

public class ExpressionListener extends QwertyBaseListener
{
    private final Stack<Double> stack = new Stack<>();

    int indent;

    @Override
    public void exitNumberExpression(QwertyParser.NumberExpressionContext ctx)
    {
        Double number = Double.parseDouble(ctx.NUMBER().getText());
        AddToStack(number);
    }

    @Override
    public void exitAddSubtractExpression(QwertyParser.AddSubtractExpressionContext ctx)
    {
        Double right = this.stack.pop();
        Double left = this.stack.pop();

        if (ctx.operator.getText().equals("+"))
        {
            AddToStack(left + right);
        }
        else
        {
            AddToStack(left - right);
        }
    }

    @Override
    public void exitMultiplyDivideExpression(QwertyParser.MultiplyDivideExpressionContext ctx)
    {
        Double right = this.stack.pop();
        Double left = this.stack.pop();

        if (ctx.operator.getText().equals("*"))
        {
            AddToStack(left * right);
        }
        else
        {
            AddToStack(left / right);
        }
    }

    @Override
    public void exitFactorialExpresion(QwertyParser.FactorialExpresionContext ctx)
    {
        Double number = this.stack.pop();

        AddToStack(Factorial(number));
    }

    @Override
    public void exitPowerExpression(QwertyParser.PowerExpressionContext ctx)
    {
        Double right = this.stack.pop();
        Double left = this.stack.pop();

        AddToStack(Math.pow(left, right));
    }

    @Override
    public void exitCosExpression(QwertyParser.CosExpressionContext ctx)
    {
        Double number = this.stack.pop();

        AddToStack(Math.cos(number));
    }

    @Override
    public void exitSinExpression(QwertyParser.SinExpressionContext ctx)
    {
        Double number = this.stack.pop();

        AddToStack(Math.sin(number));
    }

    @Override
    public void exitTanExpression(QwertyParser.TanExpressionContext ctx)
    {
        Double number = this.stack.pop();

        AddToStack(Math.tan(number));
    }

    public Double Factorial(Double number)
    {
        int rounded = (int)Math.round(number);

        return Factorial(rounded, 1.0);
    }

    public Double Factorial(int number, Double value)
    {
        if (number <= 0)
        {
            return value;
        }
        else
        {
            return Factorial(number - 1, value * number);
        }
    }

    public void AddToStack(Double integer)
    {
        this.stack.push(integer);
    }

    public Double GetResult()
    {
        return this.stack.pop();
    }

    public String createIndent()
    {
        String output = new String();
        for(int i = 0; i < indent; i++)
        {
            output += '\t';
        }
        return output;
    }
}
