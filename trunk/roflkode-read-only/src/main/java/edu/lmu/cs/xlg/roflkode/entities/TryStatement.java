package edu.lmu.cs.xlg.roflkode.entities;

public class TryStatement extends Statement {

    private Statement statement;
    private Block awsumThxBlock;
    private Block oNoesBlock;

    public TryStatement(Statement statement, Block awsumThxBlock, Block oNoesBlock) {
        this.statement = statement;
        this.awsumThxBlock = awsumThxBlock;
        this.oNoesBlock = oNoesBlock;
    }

	public Statement getStatement() {
		return statement;
	}

	public Block getAwsumThxBlock() {
		return awsumThxBlock;
	}

	public Block getoNoesBlock() {
		return oNoesBlock;
	}
}