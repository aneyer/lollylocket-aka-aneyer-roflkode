package edu.lmu.cs.xlg.roflkode.entities;

public class RoflkodeForStatement extends Statement {

	private String typeName;
	private String index;
	private Expression init, test;
	private Statement each;
	private Block body;
	private VariableExpression indexVariable;
	
	public RoflkodeForStatement(String typeName, String index, Expression init,
			Expression test, Statement each, Block body,
			VariableExpression indexVariable) {
		this.typeName = typeName;
		this.index = index;
		this.init = init;
		this.test = test;
		this.each = each;
		this.body = body;
		this.indexVariable = indexVariable;
	}
	
	public String getTypeName() {
		return typeName;
	}
	public String getIndex() {
		return index;
	}
	public Expression getInit() {
		return init;
	}
	public Expression getTest() {
		return test;
	}
	public Statement getEach() {
		return each;
	}
	public Block getBody() {
		return body;
	}
	public VariableExpression getIndexVariable() {
		return indexVariable;
	}
	
}
