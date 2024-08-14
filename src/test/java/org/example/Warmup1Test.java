package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class Warmup1Test {

    private final Warmup1 warmup1 = new Warmup1();

    @Test
    void testSleepInWeekdayNotVacation() {
        // Test case where it is a weekday but not a vacation
        assertFalse(warmup1.sleepIn(true, false), "sleepIn should return false when it's a weekday and not a vacation.");
    }

    @Test
    void testSleepInWeekend() {
        // Test case where it is not a weekday and not a vacation (weekend)
        assertTrue(warmup1.sleepIn(false, false), "sleepIn should return true when it's not a weekday (weekend).");
    }

    @Test
    void testSleepInVacation() {
        // Test case where it is a vacation, regardless of whether it's a weekday
        assertTrue(warmup1.sleepIn(true, true), "sleepIn should return true when it's a vacation.");
        assertTrue(warmup1.sleepIn(false, true), "sleepIn should return true when it's not a weekday but it's a vacation.");
    }

    @Test
    void testMonkeyTroubleBothSmiling() {
        // Test case where both monkeys are smiling
        assertTrue(warmup1.monkeyTrouble(true, true), "monkeyTrouble should return true when both monkeys are smiling.");
    }

    @Test
    void testMonkeyTroubleNeitherSmiling() {
        // Test case where neither monkey is smiling
        assertTrue(warmup1.monkeyTrouble(false, false), "monkeyTrouble should return true when neither monkey is smiling.");
    }

    @Test
    void testMonkeyTroubleOneSmiling() {
        // Test case where only one monkey is smiling
        assertFalse(warmup1.monkeyTrouble(true, false), "monkeyTrouble should return false when only one monkey is smiling.");
        assertFalse(warmup1.monkeyTrouble(false, true), "monkeyTrouble should return false when only one monkey is smiling.");
    }
}
