/**
 * 
 */
package edu.lmu.cs.xlg.roflkode.entities;


/**
 * @author Allison
 * Herez Ur statement class
 * 
 */
public class HerezStatement extends Statement {
	private Expression expressions; //private variable for expression

	public HerezStatement(Expression expressions) {
		this.expressions = expressions;
	}

	public Expression getExpressions() {
		return expressions;
	}
}
