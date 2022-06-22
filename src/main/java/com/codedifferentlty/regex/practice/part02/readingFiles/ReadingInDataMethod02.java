package com.codedifferentlty.regex.practice.part02.readingFiles;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ReadingInDataMethod02 {

    public static String readDataIn(String filePath){
        StringBuilder builder = new StringBuilder();
        try (BufferedReader buffer = new BufferedReader(
                new FileReader(filePath))) {
            String str;
            while ((str = buffer.readLine()) != null) {

                builder.append(str).append("\n");
            }
        } catch (IOException ex) {
            System.out.println("Error: no file "+ex.getMessage());
        }
        return builder.toString();
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
