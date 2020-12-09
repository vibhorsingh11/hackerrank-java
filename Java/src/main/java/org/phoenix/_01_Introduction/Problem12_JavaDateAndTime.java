package org.phoenix._01_Introduction;

/*
* The Calendar class is an abstract class that provides methods for converting between a specific instant in time and a set of calendar fields such as YEAR, MONTH, DAY_OF_MONTH, HOUR, and so on, and for manipulating the calendar fields, such as getting the date of the next week.

You are given a date. You just need to write the method, getDay, which returns the day on that date. To simplify your task, we have provided a portion of the code in the editor.

For example, if you are given the date August 14th 2017, the method should return MONDAY as the day on that date.

image

Input Format

A single line of input containing the space separated month, day and year, respectively, in MM DD YYYY format.

Constraints

Output Format

Output the correct day in capital letters.

Sample Input

08 05 2015
Sample Output

WEDNESDAY
Explanation

The day on August 15th 2015 was WEDNESDAY.*/

import java.time.LocalDate;

public class Problem12_JavaDateAndTime {
    public String findDay(int month, int day, int year) {
        LocalDate date = LocalDate.of(year, month, day);
        return date.getDayOfWeek().toString();
    }

}
