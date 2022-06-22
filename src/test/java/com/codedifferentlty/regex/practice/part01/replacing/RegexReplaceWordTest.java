package com.codedifferentlty.regex.practice.part01.replacing;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codedifferentlty.regex.practice.part01.replacing.RegexReplaceWord.*;

public class RegexReplaceWordTest {

    @Test
    @DisplayName("replace first one word")
    public void replaceFirstOneWordTest01() {
        String regex = "\\bcat\\b";
        String input = "The cat went to the cat vet";
        String replace = "dog";
        String expected = "The dog went to the cat vet";
        String actual = replaceFirst(regex, replace, input);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    @DisplayName("replace all one word")
    public void replaceAllOneWordTest01() {
        String regex = "\\bcat\\b";
        String input = "The cat went to the cat vet";
        String replace = "dog";
        String expected = "The dog went to the dog vet";
        String actual = replaceAll(regex, replace, input);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    @DisplayName("replace first multiple word")
    public void replaceFirstMultipleWordTest01() {
        String regex = "\\bcat\\b|\\bdog\\b";
        String input = "The cat went to the dog vet";
        String replace = "bird";
        String expected = "The bird went to the dog vet";
        String actual = replaceFirst(regex, replace, input);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    @DisplayName("replace all multiple word")
    public void replaceAllMultipleWordTest01() {
        String regex = "\\bcat\\b|\\bdog\\b";
        String input = "The cat went to the dog vet";
        String replace = "bird";
        String expected = "The bird went to the bird vet";
        String actual = replaceAll(regex, replace, input);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    @DisplayName("replace first prefix word")
    public void replaceFirstPrefixTest01() {
        String regex = "\\bcat";
        String input = "The cattle went to cattle the dog vet";
        String replace = "bat";
        String expected = "The battle went to cattle the dog vet";
        String actual = replaceFirst(regex, replace, input);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    @DisplayName("replace all prefix word")
    public void replaceAllPrefixTest01() {
        String regex = "\\bcat";
        String input = "The cattle went to cattle the dog vet";
        String replace = "bat";
        String expected = "The battle went to battle the dog vet";
        String actual = replaceAll(regex, replace, input);
        Assertions.assertEquals(expected, actual);
    }
}
