package edu.lmu.cs.xlg.roflkode.entities;

public class ModifiedStatement extends Statement {
	
    Statement statement;
    ModifierExpression expression;
    
	public ModifiedStatement(Statement statement, ModifierExpression expression) {
		this.statement = statement;
		this.expression = expression;
	}
	
	public Statement getStatement() {
		return statement;
	}
	
	public ModifierExpression getExpression() {
		return expression;
	}
    
    
}
