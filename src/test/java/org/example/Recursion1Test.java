package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class Recursion1Test {

    private final Recursion1 recursion1 = new Recursion1();

    @Test
    void testFactorialBaseCase() {
        // Test the base case where n = 1
        assertEquals(1, recursion1.factorial(1), "factorial(1) should return 1.");
    }

    @Test
    void testFactorialOf2() {
        // Test factorial of 2
        assertEquals(2, recursion1.factorial(2), "factorial(2) should return 2.");
    }

    @Test
    void testFactorialOf3() {
        // Test factorial of 3
        assertEquals(6, recursion1.factorial(3), "factorial(3) should return 6.");
    }

    @Test
    void testFactorialOf5() {
        // Test factorial of 5
        assertEquals(120, recursion1.factorial(5), "factorial(5) should return 120.");
    }

    @Test
    void testFactorialOf10() {
        // Test factorial of 10
        assertEquals(3628800, recursion1.factorial(10), "factorial(10) should return 3628800.");
    }
}

