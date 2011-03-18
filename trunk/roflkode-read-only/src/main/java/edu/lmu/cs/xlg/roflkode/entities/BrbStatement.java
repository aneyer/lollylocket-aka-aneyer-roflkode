/**
 * 
 */
package edu.lmu.cs.xlg.roflkode.entities;

/**
 * @author Allison
 * Brb Statement class
 *
 */
public class BrbStatement extends Statement {
	private Expression expressions; //private variable for expression

	/**
	 * BrbStatement constructor 
	 * @param expressions
	 */
	public BrbStatement(Expression expressions) {
		this.expressions = expressions;
	}

	public Expression getExpressions() {
		return expressions;
	}

}
