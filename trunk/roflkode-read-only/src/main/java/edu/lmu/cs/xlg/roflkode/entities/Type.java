package edu.lmu.cs.xlg.roflkode.entities;

public class Type extends Declarable {

    public static final Type INT = new Type("INT");
    public static final Type NUMBR = new Type("NUMBR");
    public static final Type BOOL = new Type("BOOL");
    public static final Type KAR = new Type("KAR");
    public static final Type YARN = new Type("YARN");

    /**
     * Constructs a type with the given name.
     */
    public Type(String name) {
        super(name);
    }
    
    
    
}