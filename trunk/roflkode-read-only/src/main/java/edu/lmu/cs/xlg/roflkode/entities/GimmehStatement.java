package edu.lmu.cs.xlg.roflkode.entities;

/**
 * Class for the Gimmeh statement in roflkode, which reads
 * from standard input.
 */
public class GimmehStatement extends Statement {

    private String input;

    /**
     * This is a comment...for the constructor. Tee hee. :-) <(-_-)>
     */
    public GimmehStatement(String input) {
        this.input = input;
    }

	public String getInput() {
		return input;
	}
}