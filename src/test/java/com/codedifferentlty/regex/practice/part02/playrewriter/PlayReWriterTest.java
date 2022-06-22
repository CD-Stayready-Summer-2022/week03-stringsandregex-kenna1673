package com.codedifferentlty.regex.practice.part02.playrewriter;

import com.codedifferentlty.regex.practice.part02.readingFiles.ReadingInDataMethod01;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.IOException;

public class PlayReWriterTest {
    @Test
    @DisplayName("character name changer test")
    public void characterNameChangerTest01() {
        String input = "FRANCISCO\nI think I hear them. Stand, ho! Who's there?\nEnter HORATIO and MARCELLUS\nHORATIO\n" +
        "Friends to this ground.\nMARCELLUS\nAnd liegemen to the Dane.\nFRANCISCO\nGive you good night.";
        String regex = "\\bHORATIO\\b";
        String characterName = "FlavaFlav";
        String expected = "FRANCISCO\nI think I hear them. Stand, ho! Who's there?\nEnter FlavaFlav and MARCELLUS\nFlavaFlav\n" +
                "Friends to this ground.\nMARCELLUS\nAnd liegemen to the Dane.\nFRANCISCO\nGive you good night.";
        PlayReWriter play = new PlayReWriter();
        String actual = play.characterNameChanger(regex, characterName, input);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    @DisplayName("character name changer test")
    public void locationNameChangerTest01() {
        String input = "In which the majesty of buried Denmark";
        String regex = "\\bDenmark\\b";
        String locationName = "England";
        String expected = "In which the majesty of buried England";
        PlayReWriter play = new PlayReWriter();
        String actual = play.locationNameChanger(regex, locationName, input);
        Assertions.assertEquals(expected, actual);
    }
}
