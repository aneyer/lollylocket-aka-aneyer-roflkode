package edu.lmu.cs.xlg.roflkode.entities;

public class Variable extends Declarable {
    private Expression initializer;
    private Type type;

    /**
     * Constructs a variable.
     */
    public Variable(String name, Type type, Expression initializer) {
        super(name);
        this.type = type;
        this.initializer = initializer;
    }

    /**
     * Special constructor for variables created during semantic analysis
     * (not known while parsing). Examples include parameters for external
     * or built-in functions, and special variables such as ARBITRARY.
     */
    public Variable(String name, Type type) {
        super(name);
        this.initializer = null;
        this.type = type;
    }	
}
