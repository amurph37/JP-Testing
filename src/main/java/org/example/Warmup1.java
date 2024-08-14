package org.example;

public class Warmup1 {
    public static void main(String[] args) {
        System.out.println();
    }

    public boolean sleepIn(boolean weekday, boolean vacation) {
        // If it's not a weekday or if we're on vacation, we can sleep in
        if (!weekday || vacation) {
            return true; // Return true if either condition is met
        }

        // Otherwise, we cannot sleep in
        return false; // Return false if neither condition is met
    }


    public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
        // If both monkeys are smiling, we are in trouble
        if (aSmile && bSmile) {
            return true; // Return true if both monkeys are smiling
        }
        // If neither monkey is smiling, we are also in trouble
        if (!aSmile && !bSmile) {
            return true; // Return true if neither monkey is smiling
        }
        // In all other cases, we are not in trouble
        return false; // Return false if one monkey is smiling and the other is not
    }

}