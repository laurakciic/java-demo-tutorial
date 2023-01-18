package com.laurakovacic.javademo.lesson19;

import org.junit.Test;

import static org.junit.Assert.*;

public class PorscheTest {
    @Test
    public void shouldCloneStringArray() {
        String[] array = {"1", "2", "3"};
        String[] copiedArray = array.clone();

        assertSame(array, array);
        assertNotSame(array, copiedArray);

        for(String str: array) {
            System.out.println(str);
        }
    }

    @Test
    public void shouldClonePorsche() {
        Porsche porsche = new Porsche("Laura");
        Porsche clonedPorsche = porsche.clone();

        assertNotSame(porsche, clonedPorsche);
        clonedPorsche.sellTo("clone");
        assertEquals("Porsche of clone", clonedPorsche.asString());
        assertEquals("Porsche of Laura", porsche.asString());
    }
}
