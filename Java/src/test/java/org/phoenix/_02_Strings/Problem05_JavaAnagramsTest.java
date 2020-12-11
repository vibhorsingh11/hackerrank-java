package org.phoenix._02_Strings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class Problem05_JavaAnagramsTest {
    private final Problem05_JavaAnagrams test = new Problem05_JavaAnagrams();

    @Test
    void isAnagram() {
        assertTrue(test.isAnagram("anagram", "margana"));
    }
}