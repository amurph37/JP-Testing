package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class String1Test {

    private final String1 string1 = new String1();

    @Test
    void testHelloName() {
        // Test with a sample name
        assertEquals("Hello Alice!", string1.helloName("Alice"), "helloName should return the greeting 'Hello Alice!'.");

        // Test with another sample name
        assertEquals("Hello Bob!", string1.helloName("Bob"), "helloName should return the greeting 'Hello Bob!'.");

        // Test with an empty string as a name
        assertEquals("Hello !", string1.helloName(""), "helloName should handle empty strings.");
    }

    @Test
    void testMakeAbba() {
        // Test with two sample strings
        assertEquals("HiByeByeHi", string1.makeAbba("Hi", "Bye"), "makeAbba should return 'HiByeByeHi'.");

        // Test with two other sample strings
        assertEquals("YoAliceAliceYo", string1.makeAbba("Yo", "Alice"), "makeAbba should return 'YoAliceAliceYo'.");

        // Test with empty strings
        assertEquals("", string1.makeAbba("", ""), "makeAbba should handle empty strings.");

        // Test with one empty string
        assertEquals("HiHi", string1.makeAbba("Hi", ""), "makeAbba should return 'HiHi' when the second string is empty.");
    }
}
