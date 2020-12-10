package org.phoenix._02_Strings;

/*
* We define the following terms:

Lexicographical Order, also known as alphabetic or dictionary order, orders characters as follows:
For example, ball < cat, dog < dorm, Happy < happy, Zoo < ball.

A substring of a string is a contiguous block of characters in the string. For example, the substrings of
abc are a, b, c, ab, bc, and abc.
Given a string, , and an integer, , complete the function so that it finds the lexicographically smallest and largest substrings of length .

Input Format
The first line contains a string denoting s.
The second line contains an integer denoting k.

Constraints

s consists of English alphabetic letters only (i.e., [a-zA-Z]).
Output Format

Return the respective lexicographically smallest and largest substrings as a single newline-separated string.

Sample Input 0
welcometojava
3
Sample Output 0
ava
wel

Explanation 0
String s has the following lexicographically-ordered substrings of length k = 3:

We then return the first (lexicographically smallest) substring and the last (lexicographically largest)
substring as two newline-separated values (i.e., ava\nwel).

The stub code in the editor then prints ava as our first line of output and wel as our second line of output.*/

public class Problem03_JavaSubstringComparisons {
    public String getSmallestAndLargest(String s, int k) {
        String currStr = s.substring(0, k);
        String smallest = currStr;
        String largest = currStr;

        for (int i = k; i < s.length(); i++) {
            currStr = currStr.substring(1, k) + s.charAt(i);
            if (largest.compareTo(currStr) < 0)
                largest = currStr;
            if (smallest.compareTo(currStr) > 0)
                smallest = currStr;
        }

        return smallest + "" + largest;
    }
}
