package com.laurakovacic.javademo.lesson17;

import org.junit.Test;

public class ZooTest {

    @Test
    public void shouldFeedAllAnimals() {
        Zoo zoo = new Zoo();
        Animal[] animals = { new Dog(), new Gorilla(), new Lion(), new Tiger()};
        zoo.feedAnimals(animals);
    }
}
