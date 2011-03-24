package edu.lmu.cs.xlg.roflkode.entities;

/**
 * A superclass for anything that can be declared, such as types, variables,
 * and functions.
 */
public abstract class Declarable extends Entity {
    private String name;

    /**
     * Create a declarable with the given name.
     */
    public Declarable(String n) {
        name = n;
    }

    /**
     * Returns the name.
     */
    public String getName() {
        return name;
    }
}