package org.launchcode.techjobs.oo;

import java.util.Objects;

public abstract class JobField {

    protected int id;
    protected static int nextId=1;
    protected String value;

    //constructors
    public JobField() {
        id = nextId;
        nextId++;
    }

    public JobField(String value) {
        this();
        this.value = value;
    }

    // Custom toString, equals, and hashCode methods:

    @Override
    public String toString() {
        return value;
    }

    @Override
    public boolean equals(Object o) {  // Two objects are equal if they have the same id.
        if (this == o) return true;
        if (!(o instanceof JobField)) return false;
        JobField jobfield = (JobField) o;
        return getId() == jobfield.getId();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }


    //Getters and setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }


}
