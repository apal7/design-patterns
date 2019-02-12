package com.apal.designpatterns.singleton.multithreaded;


/**
 * ===============================================================================
 * Same class behaves incorrectly in a multithreaded environment
 * Multiple threads can call creational method simultaneously and get several instances of Singleton class.
 * ===============================================================================
 */

public final class Singleton {
    private static Singleton instance;
    public String value;

    private Singleton(String value) {
        // Following code emulates slow initialization.
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        this.value = value;
    }

    public static Singleton getInstance(String value) {
        if (instance == null) {
            instance = new Singleton(value);
        }
        return instance;
    }
}
