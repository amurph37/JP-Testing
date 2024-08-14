package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

class Warmup2Test {

    private final Warmup2 warmup2 = new Warmup2();

    @Test
    void testDoubleXTrue() {
        // Test case where "xx" exists in the string
        assertTrue(warmup2.doubleX("axxbb"), "doubleX should return true when the first 'x' is followed by another 'x'.");

        // Test case with "xx" at the beginning
        assertTrue(warmup2.doubleX("xxbb"), "doubleX should return true when the string starts with 'xx'.");
    }

    @Test
    void testDoubleXFalse() {
        // Test case where "x" is not followed by another "x"
        assertFalse(warmup2.doubleX("axaxax"), "doubleX should return false when the first 'x' is not followed by another 'x'.");

        // Test case with only one "x"
        assertFalse(warmup2.doubleX("x"), "doubleX should return false when there is only one 'x'.");

        // Test case with no "x"
        assertFalse(warmup2.doubleX("abc"), "doubleX should return false when there is no 'x' in the string.");
    }

    @Test
    void testStringBits() {
        // Test case with normal string
        assertEquals("ace", warmup2.stringBits("abcdef"), "stringBits should return 'ace' when taking every other character.");

        // Test case with an empty string
        assertEquals("", warmup2.stringBits(""), "stringBits should return an empty string when the input is an empty string.");

        // Test case with a single character string
        assertEquals("a", warmup2.stringBits("a"), "stringBits should return the single character when the input has only one character.");

        // Test case with a string of even length
        assertEquals("aceg", warmup2.stringBits("abcdefgh"), "stringBits should return 'aceg' when taking every other character.");

        // Test case with a string of odd length
        assertEquals("ace", warmup2.stringBits("abcde"), "stringBits should return 'ace' when taking every other character from a string of odd length.");
    }
}
