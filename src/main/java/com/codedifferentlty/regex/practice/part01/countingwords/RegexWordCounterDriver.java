package com.codedifferentlty.regex.practice.part01.countingwords;

public class RegexWordCounterDriver {
    public static void main(String[] args) {
        String REGEX = "\\bcat\\b";
        String input = "cat cat cat cattie cat";
        Integer occurences = RegexWordCounter.countWordOccurrences(REGEX, input);
        System.out.println("This is the original string: "+ input );
        String output = String.format("It appears %d times.", occurences);
        System.out.println(output);
    }
}
