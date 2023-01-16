package com.laurakovacic.javademo.lesson16;

import org.junit.Test;

public class CarServiceTest {
    @Test
    public void shouldDemonstrateInterfaces() {
        CarService carService = new CarService();
        carService.drive();
    }
}
