package org.phoenix._02_Strings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem03_JavaSubstringComparisonsTest {
    private final Problem03_JavaSubstringComparisons test = new Problem03_JavaSubstringComparisons();

    @Test
    void getSmallestAndLargest() {
        assertEquals("avawel", test.getSmallestAndLargest("welcometojava",3));
    }
}