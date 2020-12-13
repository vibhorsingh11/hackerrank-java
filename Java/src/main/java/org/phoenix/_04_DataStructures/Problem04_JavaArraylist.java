package org.phoenix._04_DataStructures;

/*
 * You are given n lines. In each line there are zero or more integers. You need to answer a few queries where you need
 * to tell the number located in yth position of xth line.*/

import java.util.ArrayList;
import java.util.Scanner;

public class Problem04_JavaArraylist {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        ArrayList[] lists = new ArrayList[n];

        for (int i = 0; i < n; i++) {

            int d = scanner.nextInt();
            lists[i] = new ArrayList<>();
            for (int j = 0; j < d; j++) {

                lists[i].add(scanner.nextInt());
            }
        }

        int q = scanner.nextInt();

        for (int i = 0; i < q; i++) {
            try {
                System.out.println(lists[scanner.nextInt() - 1].get(scanner.nextInt() - 1));
            } catch (Exception e) {
                System.out.println("ERROR!");
            }
        }

        scanner.close();
    }
}
