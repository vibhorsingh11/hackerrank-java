package org.phoenix._01_Introduction;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem12_JavaDateAndTimeTest {
    private final Problem12_JavaDateAndTime test = new Problem12_JavaDateAndTime();

    @Test
    void findDay() {
        assertEquals("WEDNESDAY", test.findDay(8, 5, 2015));
    }
}