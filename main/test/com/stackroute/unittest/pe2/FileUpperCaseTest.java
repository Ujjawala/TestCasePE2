package com.stackroute.unittest.pe2;

import org.junit.Test;

import static org.junit.Assert.*;

public class FileUpperCaseTest {
    FileUpperCase fileUpperCase = new FileUpperCase();
    @Test
    public void upperCase() {
        String expected = "I AM A MAN , \n" +
                "I LIKE TO SLEEP , \n" +
                "I HAVE A HOME.";
        assertEquals(expected, fileUpperCase.upperCase());
    }
}