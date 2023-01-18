package com.laurakovacic.javademo.lesson19;

public class Color implements Cloneable {
    private String colorName;

    public static Color newInstance(Color color) {
        return new Color(color.colorName);
    }
    public Color(String color) {
        this.colorName = color;
    }

    public Color(Color color) {
        this.colorName = color.colorName;
    }

    public String name() {
        return colorName;
    }

    public void alterColor(String colorName) {
        this.colorName = colorName;
    }

    protected Color clone() {
        try {
            return (Color) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();             // can never happen
        }
    }
}
