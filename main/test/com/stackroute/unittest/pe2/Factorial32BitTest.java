package com.stackroute.unittest.pe2;

import org.junit.Test;

import static org.junit.Assert.*;

public class Factorial32BitTest {

    private Factorial32Bit factorial = new Factorial32Bit();
    @Test
    public void fact() {
        long expected = 24;
        long actual = factorial.fact(4);
        assertEquals(expected, actual);
    }
}