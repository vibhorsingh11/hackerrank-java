package org.phoenix._04_DataStructures;

/*
 * You are given N integers. You need to find the maximum number of unique integers among all the possible
 * contiguous subarrays of size M.
 *
 * Note: Time limit is  second for this problem.
 */

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashSet;
import java.util.Scanner;

public class Problem13_Dequeue {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Deque deque = new ArrayDeque<>();
        HashSet<Integer> set = new HashSet<>();
        int n = in.nextInt();
        int m = in.nextInt();
        int maxUniqueElements = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            int num = in.nextInt();

            deque.add(num);
            set.add(num);

            if (deque.size() == m) {
                if (set.size() > maxUniqueElements) {
                    maxUniqueElements = set.size();
                }

                int firstElement = (int) deque.removeFirst();
                if (!deque.contains(firstElement)) {
                    set.remove(firstElement);
                }
            }
        }
        in.close();

        System.out.println(maxUniqueElements);
    }
}
