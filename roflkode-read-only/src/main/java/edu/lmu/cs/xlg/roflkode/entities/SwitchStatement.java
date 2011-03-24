package edu.lmu.cs.xlg.roflkode.entities;

import java.util.List;

public class SwitchStatement extends Statement {

    private Expression expression;
    private List<ConditionalExpression> omgExpressions;
    private Block omgwtfBlock;

    public SwitchStatement(Expression expression, 
                           List<ConditionalExpression>omgExpressions, 
                           Block omgwtfBlock) {
        this.expression = expression;
        this.omgExpressions = omgExpressions;
        this.omgwtfBlock = omgwtfBlock;
    }

	public Expression getExpression() {
		return expression;
	}

	public List<ConditionalExpression> getOmgExpressions() {
		return omgExpressions;
	}

	public Block getOmgwtfBlock() {
		return omgwtfBlock;
	}	
    

}
