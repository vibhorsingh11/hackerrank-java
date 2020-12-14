package org.phoenix._04_DataStructures;

/*
 * You are given a phone book that consists of people's names and their phone number. After that you will be given some
 * person's name as query. For each query, print the phone number of that person.*/

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Problem07_JavaMap {
    public static void main(String[] argh) {
        Map map = new HashMap();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.nextLine();
        for (int i = 0; i < n; i++) {
            String name = in.nextLine();
            int phone = in.nextInt();
            in.nextLine();
            map.put(name, phone);
        }
        while (in.hasNext()) {
            String s = in.nextLine();
            if (map.containsKey(s)) {
                System.out.println(s + "=" + map.get(s));
            } else {
                System.out.println("Not found");
            }
        }
        in.close();
    }
}
