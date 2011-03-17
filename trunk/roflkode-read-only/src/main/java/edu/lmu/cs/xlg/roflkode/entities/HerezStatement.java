/**
 * 
 */
package edu.lmu.cs.xlg.roflkode.entities;

import java.util.List;

/**
 * @author Allison
 * Herez Ur statement class
 * 
 */
public class HerezStatement extends Statement {
	private Expression expressions; //

	public HerezStatement(Expression expressions) {
		this.expressions = expressions;
	}

	public Expression getExpressions() {
		return expressions;
	}
}
