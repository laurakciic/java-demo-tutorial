package com.laurakovacic.javademo.lesson17;

public class Gorilla extends Animal {
    @Override
    public void eat() {
        System.out.println("Gorilla eating");
    }

    protected void age() {
        System.out.println("Gorilla is implementing age() by itself.");
    }
}
