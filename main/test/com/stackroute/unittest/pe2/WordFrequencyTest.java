package com.stackroute.unittest.pe2;

import org.junit.Test;

public class WordFrequencyTest {
    WordFrequency wordFrequency = new WordFrequency();
    @Test
    public void frequency(){
        String expected = "sleep -> 1\n" +
                "a -> 2\n" +
                "like -> 1\n" +
                "have -> 1\n" +
                "i -> 3\n" +
                "man -> 1\n" +
                "to -> 1\n" +
                "am -> 1\n" +
                "home -> 1";
        assertEquals(expected, wordFrequency.frequency(path));
    }
}
