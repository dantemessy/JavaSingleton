package com.learnJava;


// this is a singleton object;
public class Singleton {

    private static final Singleton singleton = new Singleton();

    private Singleton(){};

    public static Singleton getInstance(){
        return singleton;
    }

}

