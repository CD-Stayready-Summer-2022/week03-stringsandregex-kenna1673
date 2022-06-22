package com.codedifferentlty.regex.practice.part02.readingFiles;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.IOException;

public class ReadingInDataMethod1Test {
    @Test
    @DisplayName("read data in and replace test 01")
    public void readDataInAndReplaceTest01() throws IOException {

        String path = "./files/Sample1.txt";
        String replace = "NEVER";
        String regex = "\\balways\\b";
        String expected = "Code Differently\nOur Students NEVER forget to write their unit test.";
        String actual = ReadingInDataMethod01.readDataInAndReplace(path, regex, replace);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    @DisplayName("read data and replace test unknown file name")
    public void readDataInAndReplaceTest02() {
        String path = "./files/Sample1000.txt";
        String replace = "NEVER";
        String regex = "\\balways\\b";
        Assertions.assertThrows(IOException.class, ()->{
            ReadingInDataMethod01.readDataInAndReplace(path, replace, regex);
        });
    }

}
