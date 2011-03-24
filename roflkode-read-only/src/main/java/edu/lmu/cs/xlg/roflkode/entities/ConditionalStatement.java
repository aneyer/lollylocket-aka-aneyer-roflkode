package edu.lmu.cs.xlg.roflkode.entities;

import java.util.List;

public class ConditionalStatement extends Statement {

	private ConditionalExpression werd;
	private List<ConditionalExpression> mebbe;
	private Block nowaiBlock;
	
	public ConditionalStatement(ConditionalExpression werd) {
		this.werd = werd;
		this.mebbe = null;
		this.nowaiBlock = null;
	}
	
	public ConditionalStatement(ConditionalExpression werd, List<ConditionalExpression> mebbe) {
		this(werd);
		this.mebbe = mebbe;
	}

	public ConditionalStatement(ConditionalExpression werd, Block nowaiBlock) {
		this(werd);
		this.nowaiBlock = nowaiBlock;
	}

	public ConditionalStatement(ConditionalExpression werd, List<ConditionalExpression> mebbe, Block nowaiBlock) {
		this(werd, mebbe);
		this.nowaiBlock = nowaiBlock;
	}
	
	public ConditionalExpression getWerd() {
		return werd;
	}

	public List<ConditionalExpression> getMebbe() {
		return mebbe;
	}

	public Block getNowaiBlock() {
		return nowaiBlock;
	}

}
