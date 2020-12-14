package org.phoenix._04_DataStructures;

import java.lang.reflect.Method;

public class Problem10_JavaGenerics {

    public static void main(String[] args) {
        Printer myPrinter = new Printer();
        Integer[] intArray = {1, 2, 3};
        String[] stringArray = {"Hello", "World"};
        myPrinter.printArray(intArray);
        myPrinter.printArray(stringArray);
        int count = 0;

        for (Method method : Printer.class.getDeclaredMethods()) {
            String name = method.getName();

            if (name.equals("printArray"))
                count++;
        }

        if (count > 1) System.out.println("Method overloading is not allowed!");

    }
}

class Printer {
    //Write your code here
    <T> void printArray(T[] arr) {

        for (T t : arr) {
            System.out.println(t);
        }
    }
}
