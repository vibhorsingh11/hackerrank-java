/*
 * MD5 (Message-Digest algorithm 5) is a widely-used cryptographic hash function with a -bit hash value.
 * Here are some common uses for MD5:
 *
 * To store a one-way hash of a password.
 * To provide some assurance that a transferred file has arrived intact.
 *
 * Given an alphanumeric string, , denoting a password, compute and print its MD5 encryption value.
 */

package org.phoenix._07_Advanced;

import java.util.Scanner;

public class Problem11_MD5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        scanner.close();
        StringBuilder hash = new StringBuilder();

        try {

            java.security.MessageDigest md = java.security.MessageDigest.getInstance("MD5");
            byte[] messageDigest = md.digest((s.getBytes()));
            java.math.BigInteger bigInteger = new java.math.BigInteger(1, messageDigest);
            hash = new StringBuilder(bigInteger.toString(16));

            while (hash.length() < 32) {
                hash.insert(0, "0");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println(hash);
    }
}
