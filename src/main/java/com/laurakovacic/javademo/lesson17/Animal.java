package com.laurakovacic.javademo.lesson17;

public abstract class Animal {                      // cannot be instantiated
    public abstract void eat();
    protected void age() {
        System.out.println("Calculating age...");
    }
}
