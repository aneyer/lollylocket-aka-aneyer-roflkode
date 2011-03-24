package edu.lmu.cs.xlg.roflkode.entities;

public class ModifierExpression extends Expression {

	private Expression booleanExpression;
	private String type;
	
	public ModifierExpression(Expression booleanExpression, String type) {
		this.booleanExpression = booleanExpression;
		this.type = type;
	}
	public Expression getBooleanExpression() {
		return booleanExpression;
	}
	public String getType() {
		return type;
	}
	
}
