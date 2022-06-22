package com.codedifferentlty.regex.practice.part01.replacing;

public class RegexReplaceWordDriver {

    public static void main(String[] args) {
        String regex = "\\bdog";
        String input = "The dog says meow. All dogs say meow.";
        String replace = "cat";
        String out1 = RegexReplaceWord.replaceFirst(regex, replace, input);
        System.out.println(out1);
        String out2 = RegexReplaceWord.replaceAll(regex, replace, input);
        System.out.println(out2);
    }
}
