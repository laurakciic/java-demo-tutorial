package com.laurakovacic.javademo.lesson10;

public enum LoggingLevel {
    PENDING(1), PROCESSING(2), PROCESSED(3);    // calling constructor
    private int i;
    private LoggingLevel(int i) {
        this.i = i;
    }
    public int code() {
        return i;
    }

    public boolean isPending() {
        return this == PENDING;
    }
}