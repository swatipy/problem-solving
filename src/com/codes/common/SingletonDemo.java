package com.codes.common;

public class SingletonDemo {

    public static void main(String[] args) {
        Singleton inst = Singleton.getInstance();
        Singleton inst1 = Singleton.getInstance();
        System.out.println(inst.getData());
        System.out.println(inst1.getData());

        inst.setData("Hello Modified");
        System.out.println(inst.getData());
        System.out.println(inst1.getData());


    }
}
