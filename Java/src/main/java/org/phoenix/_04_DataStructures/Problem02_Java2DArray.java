package org.phoenix._04_DataStructures;

/*
 * The sum of an hourglass is the sum of all the numbers within it. The sum for the hourglasses above are 7, 4, and 2,
 * respectively.
 * In this problem you have to print the largest sum among all the hourglasses in the array.*/

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Problem02_Java2DArray {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[][] arr = new int[6][6];

        for (int i = 0; i < 6; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                list.add(arr[i][j] + arr[i][j + 1] + arr[i][j + 2] + arr[i + 1][j + 1]
                        + arr[i + 2][j] + arr[i + 2][j + 1] + arr[i + 2][j + 2]);
            }
        }
        System.out.println(Collections.max(list));
        scanner.close();
    }
}
