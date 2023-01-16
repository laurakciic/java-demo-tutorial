package com.laurakovacic.javademo.lesson16;

public class CarService {
    public void drive() {                     // public void drive(Car[] cars) {
//        Car wagen213 = new Mercedes();      // object of type Mercedes with a reference of type Car (and run only Car methods)

        Car[] cars = {new BMW(), new Ford(), new Mercedes()};
        for(Car car: cars) {
            car.drive();
        }
    }
}
