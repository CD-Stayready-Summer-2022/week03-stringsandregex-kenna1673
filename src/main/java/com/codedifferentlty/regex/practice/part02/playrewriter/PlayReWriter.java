package com.codedifferentlty.regex.practice.part02.playrewriter;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PlayReWriter {

    public String characterNameChanger(String regex, String characterName, String input){
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(input);
        return m.replaceAll(characterName);
    }

    public String locationNameChanger(String regex,
                                       String locationName,
                                       String input){
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(input);
        return m.replaceAll(locationName);
    }


}
