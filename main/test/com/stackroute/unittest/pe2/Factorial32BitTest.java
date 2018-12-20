package com.stackroute.unittest.pe2;

import org.junit.Test;

import static org.junit.Assert.*;

public class Factorial32BitTest {

    Factorial64Bit factorial = new Factorial64Bit();
    @Test
    public void fact() {
        long expected = 24;
        long actual = factorial.fact(4);
        assertEquals(expected, actual);
    }
}