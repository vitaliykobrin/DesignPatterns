package com.fmdev.patterns.creational.singleton.internet.v3;

class App {
    public static void main(String[] args) {
        Singleton singleton1 = Singleton.getInstance();
        singleton1.setMessage("Hello");

        Singleton singleton2 = Singleton.getInstance();
        System.out.println(singleton2.getMessage());

        singleton2.setMessage("hi");
        System.out.println(singleton1.getMessage());
    }
}
