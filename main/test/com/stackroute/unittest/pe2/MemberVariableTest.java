package com.stackroute.unittest.pe2;

import org.junit.Test;

import static org.junit.Assert.*;

public class MemberVariableTest {
    MemberVariable memberVariable = new MemberVariable();
    Member member = new Member();
    @Test
    public void getName() {
        String expected = "Parul";
        member.setName("Parul");
        assertEquals("Parul", memberVariable.getName());
    }

    @Test
    public void getAge() {
        member.setAge(25);
        assertEquals(25, memberVariable.getAge());
    }

    @Test
    public void getSalary() {
        member.setSalary(60000.0);
        assertEquals(60000.0, memberVariable.getSalary());
    }
}