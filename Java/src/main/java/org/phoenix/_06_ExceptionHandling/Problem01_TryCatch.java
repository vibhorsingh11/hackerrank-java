package org.phoenix._06_ExceptionHandling;

/*
 * Java has built-in mechanism to handle exceptions. Using the try statement we can test a block of code for errors.
 * The catch block contains the code that says what to do if exception occurs.
 * You will be given two integers x and y as input, you have to compute x/y. If x and y are not 32 bit signed integers
 * or if y is zero, exception will occur and you have to report it. Read sample Input/Output to know what to report in case of
 * exceptions.*/

import java.util.InputMismatchException;
import java.util.Scanner;

public class Problem01_TryCatch {
    public static void main(String[] args) {
        try {
            Scanner scan = new Scanner(System.in);
            int x = scan.nextInt();
            int y = scan.nextInt();
            System.out.println(x / y);
        } catch (InputMismatchException e) {
            System.out.println(e.getClass().getName());
        } catch (ArithmeticException e) {
            System.out.println(e.getClass().getName() + ": / by zero");
        }
    }
}
