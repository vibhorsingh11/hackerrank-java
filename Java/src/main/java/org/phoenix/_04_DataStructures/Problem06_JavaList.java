package org.phoenix._04_DataStructures;

/*
 * Given a list, L, of N integers, perform Q queries on the list. Once all queries are completed, print the modified list
 * as a single line of space-separated integers.*/

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Problem06_JavaList {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int value = scan.nextInt();
            list.add(value);
        }
        int q = scan.nextInt();
        for (int i = 0; i < q; i++) {
            String action = scan.next();
            int index = scan.nextInt();
            if (action.equals("Insert")) {
                int value = scan.nextInt();
                list.add(index, value);
            } else {
                list.remove(index);
            }
        }
        scan.close();
        for (Integer value : list) {
            System.out.print(value + " ");
        }
    }
}
