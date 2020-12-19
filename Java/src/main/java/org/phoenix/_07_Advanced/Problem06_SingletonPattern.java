/*
 * Complete the Singleton class in your editor which contains the following components:
 * A private Singleton non parameterized constructor.
 * A public String instance variable named str.
 * Write a static method named getSingleInstance that returns the single instance of the Singleton class.
 */
package org.phoenix._07_Advanced;

public class Problem06_SingletonPattern {
    private volatile static Problem06_SingletonPattern instance;
    public static String str;

    private Problem06_SingletonPattern() {
    }

    static Problem06_SingletonPattern getSingleInstance() {
        if (instance == null) {
            synchronized (Problem06_SingletonPattern.class) {
                if (instance == null) {
                    instance = new Problem06_SingletonPattern();
                }
            }
        }
        return instance;
    }
}
