import java.util.Stack;
import java.util.ArrayList;
import java.lang.Math;

public class ExpressionListener extends QwertyBaseListener
{
    private final Stack<Double> stack = new Stack<>();

	private SymbolTable symboltable;

	public void SetSymbolTable(SymbolTable symboltable_)
	{
		symboltable = symboltable_;
	}

    int indent;

	@Override
	public void exitFunctioncallExpression(QwertyParser.FunctioncallExpressionContext ctx)
	{
		String functionname = ctx.function_call().function_name().getText();
		ArrayList<SymbolTableVariableDeclarationEntry> arguments = new ArrayList<SymbolTableVariableDeclarationEntry>();

		for (QwertyParser.Function_argumentContext argument : ctx.function_call().function_arguments().function_argument())
		{
			SymbolTableVariableDeclarationEntry arg = new SymbolTableVariableDeclarationEntry("Int", "temp", argument.value_expression());
            arg.SetSymbolTable(symboltable);
			arguments.add(arg);
		}
		Double number = symboltable.GetFunction(functionname).RunFunction(arguments);
		AddToStack(number);
	}

    @Override
    public void exitNumberExpression(QwertyParser.NumberExpressionContext ctx)
    {
        Double number = Double.parseDouble(ctx.NUMBER().getText());
        AddToStack(number);
    }

    @Override
    public void exitVarnameExpression(QwertyParser.VarnameExpressionContext ctx)
    {
        String varname = ctx.VARNAME().getText();
		
		if (symboltable.GetVariable(varname) == null)
		{
			if (symboltable.DoesFunctionExist(varname))
			{
				AddToStack(symboltable.GetFunction(varname).RunFunction());
			}
			else
			{
				AddToStack(0.0);
			}
		}
		else
		{
			Double variableValue = symboltable.GetVariable(varname).GetValue();
		
			AddToStack(variableValue);
		}
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

    @Override
    public void exitEqualEqualExpression(QwertyParser.EqualEqualExpressionContext ctx)
    {
        Double right = this.stack.pop();
        Double left = this.stack.pop();

        if (left.equals(right))
        {
            AddToStack(1.0);
        }
        else
        {
            AddToStack(0.0);
        }
    }

    @Override
    public void exitNotExpression(QwertyParser.NotExpressionContext ctx)
    {
        Double number = this.stack.pop();

        if (number > 0)
        {
            AddToStack(0.0);
        }
        else
        {
            AddToStack(1.0);
        }
    }

    @Override
    public void exitLessthanExpression(QwertyParser.LessthanExpressionContext ctx)
    {
        Double right = this.stack.pop();
        Double left = this.stack.pop();

        if (left < right)
        {
            AddToStack(1.0);
        }
        else
        {
            AddToStack(0.0);
        }
    }

    @Override
    public void exitLessthanorequalExpression(QwertyParser.LessthanorequalExpressionContext ctx)
    {
        Double right = this.stack.pop();
        Double left = this.stack.pop();

        if (left <= right)
        {
            AddToStack(1.0);
        }
        else
        {
            AddToStack(0.0);
        }
    }

    @Override
    public void exitGreaterthanExpression(QwertyParser.GreaterthanExpressionContext ctx)
    {
        Double right = this.stack.pop();
        Double left = this.stack.pop();

        if (left > right)
        {
            AddToStack(1.0);
        }
        else
        {
            AddToStack(0.0);
        }
    }

    @Override
    public void exitGreaterthanorequalExpression(QwertyParser.GreaterthanorequalExpressionContext ctx)
    {
        Double right = this.stack.pop();
        Double left = this.stack.pop();

        if (left >= right)
        {
            AddToStack(1.0);
        }
        else
        {
            AddToStack(0.0);
        }
    }

    @Override
    public void exitTrueExpression(QwertyParser.TrueExpressionContext ctx)
    {
        AddToStack(1.0);
    }

    @Override
    public void exitFalseExpression(QwertyParser.FalseExpressionContext ctx)
    {
        AddToStack(0.0);
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
		Double result = 0.0;
		result = this.stack.pop();
        return result;
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
