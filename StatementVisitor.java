import java.util.Stack;
import java.util.ArrayList;

public class StatementVisitor extends QwertyBaseVisitor<Double>
{
    private ArrayList<ArrayList<Statement>> currentStatements = null;

    IFConditionalStatement currentIfStatement = null;
    ArrayList<ELIFConditionalStatement> currentElifStatements = null;
    ELSEConditionalStatement currentElseStatement = null;

    private SymbolTable symboltable;

	public void SetSymbolTable(SymbolTable symboltable_)
	{
		symboltable = symboltable_;
	}

    public Statement GetOutput()
    {
        Statement output = new Statement(symboltable);
        output.AddStatements(currentStatements.get(currentStatements.size() - 1));

        return output;
    }

    @Override
    public Double visitProgram(QwertyParser.ProgramContext ctx)
    {
        currentStatements = new ArrayList<ArrayList<Statement>>();
        currentStatements.add(new ArrayList<Statement>());
        currentElifStatements = new ArrayList<ELIFConditionalStatement>();

        visitChildren(ctx);

        return 0.0;
    }

    @Override
    public Double visitStmt(QwertyParser.StmtContext ctx)
    {
        if (ctx.conditional() != null)
        {
            visit(ctx.conditional());
        }

        if (ctx.function_call() != null)
        {
            visit(ctx.function_call());
        }

        return 0.0;
    }
	
	@Override 
	public Double visitFor_statement(QwertyParser.For_statementContext ctx)
	{
		ForStatement forStatement = new ForStatement(symboltable, ctx.value_expression());
		
		visit(ctx.conditional_block());

        forStatement.AddStatements(currentStatements.get(currentStatements.size() - 1));

        currentStatements.remove(currentStatements.size() - 1);
		
		currentStatements.get(currentStatements.size() - 1).add(forStatement);
		
		return 0.0;
	}
	

    @Override
    public Double visitConditional(QwertyParser.ConditionalContext ctx)
    {
		if (ctx.for_statement() != null)
		{
			visit(ctx.for_statement());
			return 0.0;
		}
		
        if (ctx.if_statement() != null)
        {
                visit(ctx.if_statement());
        }

        if (ctx.elif_statement() != null)
        {
            for (QwertyParser.Elif_statementContext elif : ctx.elif_statement())
            {
                visit(elif);
            }
        }

        if (ctx.else_statement() != null)
        {
                visit(ctx.else_statement());
        }

        ConditionalStatement conditional = new ConditionalStatement(symboltable, currentIfStatement);

        for (ELIFConditionalStatement elif : currentElifStatements)
        {
            conditional.AddElseIfStatement(elif);
        }

        conditional.AddElseStatement(currentElseStatement);

        currentStatements.get(currentStatements.size() - 1).add(conditional);

        currentIfStatement = null;
        currentElifStatements = new ArrayList<ELIFConditionalStatement>();
        currentElseStatement = null;

        return 0.0;
    }

    @Override
    public Double visitIf_statement(QwertyParser.If_statementContext ctx)
    {
        visit(ctx.conditional_block());

        currentIfStatement = new IFConditionalStatement(symboltable, ctx.value_expression());

        currentIfStatement.AddStatements(currentStatements.get(currentStatements.size() - 1));

        currentStatements.remove(currentStatements.size() - 1);

        return 0.0;
    }

    @Override
    public Double visitConditional_block(QwertyParser.Conditional_blockContext ctx)
    {
        currentStatements.add(new ArrayList<Statement>());
        visitChildren(ctx);
        return 0.0;
    }

    @Override
    public Double visitElif_statement(QwertyParser.Elif_statementContext ctx)
    {
        visit(ctx.conditional_block());

		ELIFConditionalStatement currentElifStatement = new ELIFConditionalStatement(symboltable, ctx.value_expression());

        currentElifStatement.AddStatements(currentStatements.get(currentStatements.size() - 1));

        currentElifStatements.add(currentElifStatement);

        currentStatements.remove(currentStatements.size() - 1);

        return 0.0;
    }

	@Override
    public Double visitElse_statement(QwertyParser.Else_statementContext ctx)
    {
        visit(ctx.conditional_block());

        currentElseStatement = new ELSEConditionalStatement(symboltable);

        currentElseStatement.AddStatements(currentStatements.get(currentStatements.size() - 1));

        currentStatements.remove(currentStatements.size() - 1);

        return 0.0;
    }

    @Override
    public Double visitFunction_call(QwertyParser.Function_callContext ctx)
    {
        System.out.println("Function called: " + ctx.function_name().getText());

        currentStatements.get(currentStatements.size() - 1).add(new FunctionCallStatement(symboltable, ctx));

        return 0.0;
    }
}
