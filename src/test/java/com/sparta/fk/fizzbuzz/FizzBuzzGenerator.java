package com.sparta.fk.fizzbuzz;

public class FizzBuzzGenerator {
    public static String getValue(int userNumber) {
        if (userNumber == 3) {
            return "fizz";
        } else {
            return "buzz";
        }
    }
}
