package com.codedifferentlty.regex.practice.part01.countingwords;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexWordCounter {
    public static Integer countWordOccurrences(String REGEX, String input){
        Pattern p = Pattern.compile(REGEX);
        Matcher m = p.matcher(input);
        int count = 0;
        while(m.find()){
            count++;
        }
        return count;
    }
}
