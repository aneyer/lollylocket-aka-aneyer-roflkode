package edu.lmu.cs.xlg.roflkode.entities;

public class HwgaStatement extends Statement {

	private VariableExpression loopName;
	
	public HwgaStatement() {
	}

	public HwgaStatement(VariableExpression loopName) {
		this.loopName = loopName;
	}

	public VariableExpression getLoopName() {
		return loopName;
	}
	
}
