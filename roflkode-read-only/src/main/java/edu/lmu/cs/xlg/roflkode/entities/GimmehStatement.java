/**
 * 
 */
package edu.lmu.cs.xlg.roflkode.entities;

/**
 * @author Allison
 * 
 */
public class GimmehStatement extends Statement {

	private VariableExpression expressions; // private variable expression since
											// it takes in an ID

	/**
	 * @param expressions
	 */
	public GimmehStatement(VariableExpression expressions) {
		this.expressions = expressions;
	}

	/**
	 * @return the expressions
	 */
	public VariableExpression getExpressions() {
		return expressions;
	}

}
