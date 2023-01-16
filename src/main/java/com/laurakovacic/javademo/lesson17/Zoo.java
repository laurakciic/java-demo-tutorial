package com.laurakovacic.javademo.lesson17;

public class Zoo {
    public void feedAnimals(Animal[] animals) {
        for(Animal animal: animals) {
            animal.eat();
            animal.age();
        }
    }
}
