package com.learnJava;

public class DoubleCheck {

    private static DoubleCheck doubleCheck;

    private DoubleCheck() {
    }

    public DoubleCheck getInstance() {

        if (doubleCheck == null) {
            synchronized (DoubleCheck.class) {
                if (doubleCheck == null) {
                    doubleCheck = new DoubleCheck();
                }
            }
        }

        return doubleCheck;
    }
}
