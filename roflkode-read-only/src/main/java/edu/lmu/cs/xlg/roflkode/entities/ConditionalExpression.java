package edu.lmu.cs.xlg.roflkode.entities;

public class ConditionalExpression extends Expression {

	Expression conditional;
	Block body;
	
	public ConditionalExpression(Expression conditional, Block body) {
		this.conditional = conditional;
		this.body = body;
	}

	public Expression getConditional() {
		return conditional;
	}

	public Block getBody() {
		return body;
	}
	
	
	
}
