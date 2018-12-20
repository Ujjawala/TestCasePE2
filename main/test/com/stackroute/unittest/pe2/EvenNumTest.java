package com.stackroute.unittest.pe2;

import org.junit.Test;

import static org.junit.Assert.*;

public class EvenNumTest {
    EvenNum evenNum = new EvenNum();
    @Test
    public void isEven() {
        assertTrue(evenNum.isEven(6));
    }
    @Test
    public void isNotEven(){
        assertFalse(evenNum.isEven(7));
    }
}