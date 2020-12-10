package org.phoenix._02_Strings;

/*
* Given a string, s, and two indices, start and end, print a substring consisting of all characters in the inclusive
 range from start to end-1. You'll find the String class' substring method helpful in completing this challenge.

Input Format

The first line contains a single string denoting s.
The second line contains two space-separated integers denoting the respective values of start and end.

Constraints

String a consists of English alphabetic letters (i.e., ) only.
Output Format

Print the substring in the inclusive range from start to end-1.

Sample Input

Helloworld
3 7
Sample Output

lowo
Explanation

In the diagram below, the substring is highlighted in green:

substring.*/

import java.util.Scanner;

public class Problem02_JavaSubstring {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        int start = in.nextInt();
        int end = in.nextInt();
        System.out.println(S.substring(start, end));
    }
}
