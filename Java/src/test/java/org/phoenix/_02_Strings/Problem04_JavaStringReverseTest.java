package org.phoenix._02_Strings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem04_JavaStringReverseTest {
    private final Problem04_JavaStringReverse test = new Problem04_JavaStringReverse();

    @Test
    void palindrome() {
        assertEquals("Yes", test.palindrome("madam"));
    }
}