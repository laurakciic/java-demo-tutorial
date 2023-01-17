package com.laurakovacic.javademo.lesson19;

import com.laurakovacic.javademo.lesson16.Car;

public class Porsche implements Car, Cloneable {
    private String owner;                       // for OOP should be Name instead of String
    public Porsche(String owner) {
        this.owner = owner;
    }

    public void sellTo(String owner) {
        this.owner = owner;
    }

    public String asString() {
        return "Porsche of " + owner;
    }

    @Override
    public void drive() {
        System.out.println("Porsche driving...");
    }

    @Override
    public Porsche clone() {     // overridden bc originally clone() visibility protected
        try {
            return (Porsche) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
