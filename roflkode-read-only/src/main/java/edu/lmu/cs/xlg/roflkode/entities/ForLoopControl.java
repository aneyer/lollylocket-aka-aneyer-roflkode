package edu.lmu.cs.xlg.roflkode.entities;

import java.util.List;

public class ForLoopControl extends LoopControlExpression {
	
    private VariableExpression variable;
    private Expression fromExpression;
    private Expression toExpression;
    private Expression thruExpression;
    
	public ForLoopControl(VariableExpression variable,
			Expression fromExpression, Expression toExpression) {
		this.variable = variable;
		this.fromExpression = fromExpression;
		this.toExpression = toExpression;
		this.thruExpression = null;
	}

	public ForLoopControl(VariableExpression variable, Expression thruExpression) {
		this.variable = variable;
		this.fromExpression = null;
		this.toExpression = null;
		this.thruExpression = thruExpression;
	}

	public VariableExpression getVariable() {
		return variable;
	}

	public Expression getFromExpression() {
		return fromExpression;
	}

	public Expression getToExpression() {
		return toExpression;
	}

	public Expression getThruExpression() {
		return thruExpression;
	}

	
    

}
