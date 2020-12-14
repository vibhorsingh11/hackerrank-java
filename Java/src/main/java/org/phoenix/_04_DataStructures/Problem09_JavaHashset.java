package org.phoenix._04_DataStructures;

/*
 * You are given n pairs of strings. Two pairs (a,b) and (c.d) are identical if a = c and b = d.
 * That also implies (a,b) is not same as (b,a).
 * After taking each pair as input, you need to print number of unique pairs you currently have.
 */

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Problem09_JavaHashset {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        String[] pair_left = new String[t];
        String[] pair_right = new String[t];
        Set<String> set = new HashSet<>();
        for (int i = 0; i < t; i++) {
            pair_left[i] = s.next();
            pair_right[i] = s.next();
            set.add("(" + pair_left[i] + ", " + pair_right[i] + ")");
            System.out.println(set.size());
        }
    }
}
