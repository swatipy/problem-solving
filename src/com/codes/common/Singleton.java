package com.codes.common;

public class Singleton {

    private static Singleton instance;
    private String data;

    private Singleton() {
        this.data = "Hello World";
    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}
