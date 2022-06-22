package com.codedifferentlty.regex.practice.part01.countingword;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codedifferentlty.regex.practice.part01.countingwords.RegexWordCounter.countWordOccurrences;

public class RegexWordCounterTest {

    @Test
    @DisplayName("one word test")
    public void oneWordTest01() {
        // Given
        String REGEX = "\\bcat\\b";
        String input = "cat cattle dsdcat in the hat";
        int expected = 1;
        // When
        int actual = countWordOccurrences(REGEX, input);
        // Then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    @DisplayName("multiple word test")
    public void multipleWordTest01() {
        // Given
        String REGEX = "\\bcat\\b | \\bdog\\b";
        String input = "cat cattle in jscat the doggle dsdog hat and a dog";
        int expected = 2;
        // When
        int actual = countWordOccurrences(REGEX, input);
        // Then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    @DisplayName("prefix test")
    public void prefixTest01() {
        // Given
        String REGEX = "\\bcat";
        String input = "cattle ahcatas dog cat dfdcat";
        int expected = 2;
        // When
        int actual = countWordOccurrences(REGEX, input);
        // Then
        Assertions.assertEquals(expected, actual);
    }
}
