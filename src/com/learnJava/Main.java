package com.learnJava;

public class Main {

    public static void main(String[] args) {

    // Singleton singleton = new Singleton(); // invalid.
    // Singleton singleton = Singleton.getInstance(); // valid.

        EnumSingleton test = EnumSingleton.INSTANCE;

        System.out.println(test.getA());
    }
}
