package com.learnJava;

public enum EnumSingleton {
    INSTANCE;
    private int a = 1;

    public int getA(){
        return a;
    }
}
