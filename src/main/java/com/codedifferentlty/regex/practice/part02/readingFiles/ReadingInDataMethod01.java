package com.codedifferentlty.regex.practice.part02.readingFiles;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ReadingInDataMethod01 {

    public static String readDataIn(String pathToFile) throws IOException {
        Path fileName = Path.of(pathToFile);
        String str = Files.readString(fileName);
        return str;
    }

    public static String readDataInAndReplace(String pathToFile,
                                              String regex,
                                              String replace) throws IOException {
        String input = readDataIn(pathToFile);
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(input);
        return m.replaceAll(replace);
    }
}
