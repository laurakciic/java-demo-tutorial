package com.laurakovacic.javademo.lesson2;

import com.laurakovacic.javademo.lesson10.LoggingLevel;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class PersonTest {

    private static final String[] STATE_VALUES = {"PENDING", "PROCESSING", "PROCESSED"};
    private static final int PENDING = 40;
    private static final int PROCESSING = 41;
    private static final int PROCESSED = 42;

    public String[] returnStateArray() {
        return Arrays.copyOf(STATE_VALUES, STATE_VALUES.length);
    }

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
    public void demonstrateArrays(Person[] persons) {
//        Person[] persons = new Person[4];

        for(int i = 0; i < persons.length; i++) {
            persons[i] = new Person();
        }

        for(Person person: persons) {
            person.helloWorld();
        }

        Person luka = new Person();
        final Person[] person2 = {persons[0], null, luka};

        LoggingLevel state = LoggingLevel.PROCESSING;

        int myState = PENDING;

        switch(myState) {
            case PENDING:
                // falls through
            case PROCESSING:
                break;
            default:
                // throw error
        }

        for(LoggingLevel stateValue: LoggingLevel.values()) {
            if(stateValue == LoggingLevel.PENDING) {

            }
            if(stateValue == LoggingLevel.PROCESSED) {

            }
            if(stateValue == LoggingLevel.PROCESSED) {

            }
        }
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