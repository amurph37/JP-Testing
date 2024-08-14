package org.example;

public class String1 {
    public static void main(String[] args) {
        System.out.println();
    }

    public String helloName(String name) {
        // Concatenate the greeting with the name and the exclamation mark
        String greeting = "Hello " + name + "!";

        // Return the final greeting string
        return greeting;
    }

    public String makeAbba(String a, String b) {
        // Concatenate the strings in the order abba
        String result = a + b + b + a;

        // Return the resulting string
        return result;
    }

}