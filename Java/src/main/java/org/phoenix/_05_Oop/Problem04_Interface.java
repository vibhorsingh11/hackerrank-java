package org.phoenix._05_Oop;

/*
 * A Java interface can only contain method signatures and fields. The interface can be used to achieve polymorphism.
 * In this problem, you will practice your knowledge on interfaces.
 * You are given an interface AdvancedArithmetic which contains a method signature int divisor_sum(int n).
 * You need to write a class called MyCalculator which implements the interface.
 * divisorSum function just takes an integer as input and return the sum of all its divisors.
 * For example divisors of 6 are 1, 2, 3 and 6, so divisor_sum should return 12. The value of n will be at most 1000.*/

import java.util.Scanner;

public class Problem04_Interface {
    public static void main(String[] args) {
        MyCalculator my_calculator = new MyCalculator();
        System.out.print("I implemented: ");
        ImplementedInterfaceNames(my_calculator);
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(my_calculator.divisor_sum(n) + "\n");
        sc.close();
    }

    /*
     *  ImplementedInterfaceNames method takes an object and prints the name of the interfaces it implemented
     */
    static void ImplementedInterfaceNames(Object o) {
        Class[] theInterfaces = o.getClass().getInterfaces();
        for (Class theInterface : theInterfaces) {
            String interfaceName = theInterface.getName();
            System.out.println(interfaceName);
        }
    }
}

interface AdvancedArithmetic {
    int divisor_sum(int n);
}

//Write your code here
class MyCalculator implements AdvancedArithmetic {
    public int divisor_sum(int n) {
        if (n == 1) {
            return n;
        }
        int sum = 0;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }
        return sum + 1 + n;
    }
}
