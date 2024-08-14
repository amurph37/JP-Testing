package org.example;

public class Array1 {

    public boolean firstLast6(int[] nums) {
        // Check if the first element is 6 or the last element is 6
        if (nums[0] == 6 || nums[nums.length - 1] == 6) {
            return true; // Return true if either condition is met
        }

        // Otherwise, return false
        return false; // Return false if neither condition is met
    }

    public boolean sameFirstLast(int[] nums) {
        // Check if the array length is 1 or more and the first element is equal to the last element
        if (nums.length >= 1 && nums[0] == nums[nums.length - 1]) {
            return true; // Return true if both conditions are met
        }

        // Otherwise, return false
        return false; // Return false if either condition is not met
    }

}