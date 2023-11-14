package com.sparta.fk;

import com.sparta.fk.fizzbuzz.FizzBuzzGenerator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class FizzBuzzTest {

    //red
    //green
    //refactor

    @Test
    @DisplayName("Check that 3 returns fizz")
    void checkThat3ReturnsFizz() {
        Assertions.assertEquals("fizz", FizzBuzzGenerator.getValue(3));
    }

    @Test
    @DisplayName("Check that 5 returns buzz")
    void checkThat5ReturnsBuzz() {
        Assertions.assertEquals("buzz", FizzBuzzGenerator.getValue(5));
    }

}
