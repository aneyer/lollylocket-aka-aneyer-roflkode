package edu.lmu.cs.xlg.roflkode.entities;

import java.util.List;

public class CallStatement extends Statement {

    private String functionName;
    private List<Expression> arguments;

    public CallStatement(String functionName, List<Expression> arguments) {
        this.functionName = functionName;
        this.arguments = arguments;
    }

    public String getFunctionName() {
        return functionName;
    }

    public List<Expression> getExpressions() {
        return arguments;
    }
}
