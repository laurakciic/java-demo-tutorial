package com.laurakovacic.javademo.lesson19;

import com.laurakovacic.javademo.lesson16.Car;

public class BMW implements Car, Cloneable {

    private Name ownerName;
    private Color color;

    public BMW(Name ownerName, Color colorName) {
        this.ownerName = ownerName;
        this.color = colorName;
    }

    public BMW(BMW bmw) {
        this.ownerName = new Name(bmw.ownerName);
        this.color = new Color(bmw.color);
    }

    public static BMW newInstance(BMW bmw) {
        return new BMW(Name.newInstance(bmw.ownerName), Color.newInstance(bmw.color));
    }

    @Override
    public void drive() {
        System.out.println("BMW driving...");
    }
}
