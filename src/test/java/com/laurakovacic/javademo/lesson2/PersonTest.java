package com.laurakovacic.javademo.lesson2;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PersonTest {
    @Test
    public void shouldReturnHelloWorld() {
        Person laura = new Person();
        assertEquals("Hello World", laura.helloWorld());
    }

    @Test
    public void shouldReturnHelloLuka() {
        Person luka = new Person();
        assertEquals("Hello Luka", luka.hello("Luka"));
    }

    @Test
    public void shouldReturnNumberOfPersons() {
        Person person1 = new Person();
        Person person2 = new Person();
        Person person3 = new Person();
        assertEquals(3, Person.numberOfPersons());
    }

    @Test
    public void shouldReturnNumberOfPersonsInALoop() {
        Person person;
        for(int i = 0; i < 4; i++) {
            person = new Person();
        }
        assertEquals(4, Person.numberOfPersons());
    }

    @Test
    public void demonstrateBoolean() {
        int i = 3;
        int j = 4;
        boolean areEqual = i == j;

        if(i > j) {
            j++;
        } else if(j > i) {
            i++;
        } else if(areEqual) {
            i *= 1000;
        } else {
            j += 1000;
        }
    }
}