package org.phoenix._02_Strings;

/*
* A palindrome is a word, phrase, number, or other sequence of characters which reads the same backward or forward.(Wikipedia)
Given a string , print Yes if it is a palindrome, print No otherwise.

Constraints
A will consist at most 50 lower case english letters.
Sample Input
 madam

Sample Output
Yes*/

import java.util.Scanner;

public class Problem04_JavaStringReverse {
    public String palindrome(String A) {

        int stringLength = A.length() - 1;
        String output = "Yes";
        for (int i = 0; i < stringLength / 2; i++) {
            if (A.charAt(i) != A.charAt(stringLength - i)) {
                output = "No";
                break;
            }
        }
        return output;
    }
}
