package org.phoenix._04_DataStructures;

/*
 * Comparators are used to compare two objects. In this challenge, you'll create a comparator and use it
 * to sort an array.
 *
 * Given an array of n Player objects, write a comparator that sorts them in order of decreasing score;
 * if 2 or more players have the same score, sort those players alphabetically by name.
 */

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Problem11_JavaComparator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        Player[] player = new Player[n];
        Checker checker = new Checker();

        for (int i = 0; i < n; i++) {
            player[i] = new Player(scan.next(), scan.nextInt());
        }
        scan.close();

        Arrays.sort(player, checker);
        for (Player value : player) {
            System.out.printf("%s %s\n", value.name, value.score);
        }
    }
}

class Checker implements Comparator<Player> {

    @Override
    public int compare(Player o1, Player o2) {

        if (o1.score != o2.score) {
            return o2.score - o1.score;
        } else {
            return o1.name.compareTo(o2.name);
        }
    }
}

class Player {
    String name;
    int score;

    Player(String name, int score) {
        this.name = name;
        this.score = score;
    }
}
