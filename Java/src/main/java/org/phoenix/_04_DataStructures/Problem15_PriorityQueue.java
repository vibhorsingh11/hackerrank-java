package org.phoenix._04_DataStructures;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Problem15_PriorityQueue {
    private final static Scanner scan = new Scanner(System.in);
    private final static Priorities priorities = new Priorities();

    public static void main(String[] args) {
        int totalEvents = Integer.parseInt(scan.nextLine());
        List<String> events = new ArrayList<>();

        while (totalEvents-- != 0) {
            String event = scan.nextLine();
            events.add(event);
        }

        List<Student> students = priorities.getStudents(events);

        if (students.isEmpty()) {
            System.out.println("EMPTY");
        } else {
            for (Student st : students) {
                System.out.println(st.getName());
            }
        }
    }

    static class Student implements Comparable<Student> {
        String name;
        double cgpa;
        int id;

        Student(String name, double cgpa, int id) {
            this.name = name;
            this.cgpa = cgpa;
            this.id = id;
        }

        String getName() {
            return this.name;
        }

        public int compareTo(Student s) {
            if (cgpa == s.cgpa) {
                if (name.compareTo(s.name) == 0) {
                    return Integer.compare(id, s.id);
                } else
                    return name.compareTo(s.name);
            } else if (cgpa > s.cgpa)
                return -1;
            else
                return 1;
        }
    }

    static class Priorities {
        ArrayList<Student> getStudents(List<String> events) {
            PriorityQueue<Student> pq = new PriorityQueue<>();
            for (String i : events) {
                String[] s;
                s = i.split("\\s");
                if (s.length > 1) {
                    pq.add(new Student(s[1], Double.parseDouble(s[2]), Integer.parseInt(s[3])));
                } else {
                    pq.poll();
                }
            }
            while (pq.size() > 1) {
                System.out.println(pq.poll().name);
            }
            return new ArrayList<>(pq);
        }
    }
}
