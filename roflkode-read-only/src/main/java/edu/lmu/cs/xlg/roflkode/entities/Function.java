package edu.lmu.cs.xlg.roflkode.entities;

import java.util.List;

public class Function extends Declarable {

    private String returnTypeName;
    private List<Variable> parameters;
    private Block body;
    private Type returnType;

    public Function(String returnTypeName, String name,
            List<Variable> parameters) {
        super(name);
        this.returnTypeName = returnTypeName;
        this.parameters = parameters;
    }
    
    /**
     * Creates a normal function object.
     */
    public Function(String returnTypeName, String name,
            List<Variable> parameters, Block body) {
        this(returnTypeName, name, parameters);
        this.body = body;
    }
    
    /**
     * Returns the body.
     */
    public Block getBody() {
        return body;
    }

    /**
     * Returns the parameters.
     */
    public List<Variable> getParameters() {
        return parameters;
    }

    /**
     * Returns the return type.
     */
    public Type getReturnType() {
        return returnType;
    }

    /**
     * Returns the return type name.
     */
    public String getReturnTypeName() {
        return returnTypeName;
    }

}
