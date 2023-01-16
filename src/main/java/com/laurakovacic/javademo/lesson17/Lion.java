package com.laurakovacic.javademo.lesson17;

public class Lion extends Animal implements Loggable, Printable {
    @Override
    public String message() {
        return "Important message";
    }

    @Override
    public void print() {
        System.out.println("Printing...");
    }

    @Override
    public void eat() {
        System.out.println("Lion eating");
    }
}
