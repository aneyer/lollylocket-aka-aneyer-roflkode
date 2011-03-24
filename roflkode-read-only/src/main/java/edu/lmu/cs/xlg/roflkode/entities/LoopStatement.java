package edu.lmu.cs.xlg.roflkode.entities;

public class LoopStatement extends Statement {

    private String id;
    private LoopControlExpression control;
    private Block body;
    private String end;

//    public LoopStatement(String id, LoopControlExpression control, Block body) {
//        this.id = id;
//        this.control = control;
//        this.body = body;
//    }
    
    public LoopStatement(String id, LoopControlExpression control, Block body, String end) {
        this.id = id;
        this.control = control;
        this.body = body;
        this.end = end;
    }

	public String getEnd() {
		return end;
	}

	public Block getBody() {
		return body;
	}

	public String getId() {
		return id;
	}

	public LoopControlExpression getControl() {
		return control;
	}
	
}
