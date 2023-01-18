package com.laurakovacic.javademo.lesson19;

public class Name {
    private String firstName;
    private String lastName;

    public Name(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Name(Name name) {

    }

    public static Name newInstance(Name name) {
        return new Name(name.firstName, name.lastName);
    }

    public String firstName() {
        return firstName;
    }

    public String lastName() {
        return lastName;
    }

    public String name() {
        return firstName + " " + lastName;
    }

    public void alterTo(String firstName, String lastName) {

    }

    public Name clone() {
        try {
            return (Name) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();             // can never happen
        }
    }
}
