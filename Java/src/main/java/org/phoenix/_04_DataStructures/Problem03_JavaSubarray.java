package org.phoenix._04_DataStructures;

/*
 * Given an array of  integers, find and print its number of negative subarrays on a new line.
 */

import java.util.Scanner;

public class Problem03_JavaSubarray {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        scanner.close();
        int count = 0;
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
                sum += a[j];
                if (sum < 0) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
