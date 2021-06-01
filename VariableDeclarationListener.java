public class VariableDeclarationListener extends QwertyBaseListener
{
    private SymbolTable symbolTable;

    public void SetSymbolTable(SymbolTable symbolTable_)
	{
		symbolTable = symbolTable_;
	}

    @Override
    public void exitVariable_declaration(QwertyParser.Variable_declarationContext ctx)
    {
        String type = ctx.type().getText();
        String name = ctx.VARNAME().getText();
        QwertyParser.Value_expressionContext value = ctx.value_expression();

        SymbolTableEntry entry = new SymbolTableVariableDeclarationEntry(type, name, value);

        try
        {
            symbolTable.AddEntry(entry);
        }
        catch (SymbolTable.VariableAlreadyExistsException ex)
        {
            System.out.println(ex);
        }
    }
}
