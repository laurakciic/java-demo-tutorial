package com.laurakovacic.javademo.lesson16;

public class Ford implements Car, Loggable, Asset, Property {

    @Override
    public void drive() {
        System.out.println("Ford driving...");
    }

    @Override
    public int value() {
        return 80000;
    }

    @Override
    public String message() {
        return "I want ssstutututu turbine";
    }

    @Override
    public String owner() {
        return "Laura";
    }
}
