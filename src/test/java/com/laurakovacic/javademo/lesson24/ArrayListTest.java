package com.laurakovacic.javademo.lesson24;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ArrayListTest {
    private final int INITIAL_CAPACITY = 5;

    @Test
    public void shouldDemonstrateArrayList() {
        List<String> elements = new ArrayList<>(INITIAL_CAPACITY);
        System.out.println(elements.size());
        System.out.println(elements.isEmpty());

        elements.add("Laura");
        elements.add("Luka");
        elements.add("Cuba");

        elements.remove(2);
        elements.add(1, "Kovacic");
        elements.add(3, "Roncevic");

        for(String str: elements) {
            System.out.println(str);
        }

        System.out.println(elements.indexOf("Laura"));
        System.out.println(elements.size());
        System.out.println(elements.isEmpty());
    }
}
