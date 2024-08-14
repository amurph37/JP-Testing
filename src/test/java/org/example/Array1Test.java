package org.example;

import org.example.Array1;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;


class Array1Test {

    private final Array1 array1 = new Array1();

    @Test
    void testFirstLast6FirstElement6() {
        int[] nums = {6, 2, 3, 4};
        assertTrue(array1.firstLast6(nums), "firstLast6 should return true when the first element is 6.");
    }

    @Test
    void testFirstLast6LastElement6() {
        int[] nums = {1, 2, 3, 6};
        assertTrue(array1.firstLast6(nums), "firstLast6 should return true when the last element is 6.");
    }

    @Test
    void testFirstLast6No6() {
        int[] nums = {1, 2, 3, 4};
        assertFalse(array1.firstLast6(nums), "firstLast6 should return false when neither the first nor last element is 6.");
    }

    @Test
    void testSameFirstLastSameFirstLast() {
        int[] nums = {1, 2, 3, 1};
        assertTrue(array1.sameFirstLast(nums), "sameFirstLast should return true when the first and last elements are the same.");
    }

    @Test
    void testSameFirstLastDifferentFirstLast() {
        int[] nums = {1, 2, 3, 4};
        assertFalse(array1.sameFirstLast(nums), "sameFirstLast should return false when the first and last elements are different.");
    }

    @Test
    void testSameFirstLastSingleElement() {
        int[] nums = {1};
        assertTrue(array1.sameFirstLast(nums), "sameFirstLast should return true for single element arrays.");
    }

    @Test
    void testSameFirstLastEmptyArray() {
        int[] nums = {};
        assertFalse(array1.sameFirstLast(nums), "sameFirstLast should return false for an empty array.");
    }
}
