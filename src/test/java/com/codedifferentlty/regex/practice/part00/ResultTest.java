package com.codedifferentlty.regex.practice.part00;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ResultTest {

    private Result result;

    @BeforeEach
    public void setUp(){
        result = new Result();
    }

    @Test
    public void test01(){
        String stringInput = "aba";
        Long numberOfCharacters = 10l;
        Long expected = 7l;
        Long actual = result.repeatedString(stringInput, numberOfCharacters);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test02(){
        String stringInput = "a";
        Long numberOfCharacters = 1000000000000l;
        Long expected = 1000000000000l;
        Long actual = result.repeatedString(stringInput, numberOfCharacters);
        Assertions.assertEquals(expected, actual);
    }
}