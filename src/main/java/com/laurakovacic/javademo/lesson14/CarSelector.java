package com.laurakovacic.javademo.lesson14;

import com.laurakovacic.javademo.lesson13.CarService;
import com.laurakovacic.javademo.lesson15.CarState;

/*
* RUNTIME EXCEPTIONS - unchecked (not enforced by compiler to be handled) exceptions - throw them or Java will throw them for you
*                    - can happen at any line, don't have to be handled in code (program will stop bc exception will bubble up to the top and print stack trace)
*
* CHECKED EXCEPTIONS - enforced by the compiler to do something about them / add throws with exception name in method signature
*                    - IOException
* */

public class CarSelector {
    public static void main(String[] args) {
        CarService carService = new CarService();
        for(String argument: args) {
            if(isValid(argument)) {
                carService.process(argument);
            } else {
                System.err.println("Ignoring invalid argument: " + argument);
            }
        }
    }
    private static boolean isValid(String argument) {
        try {
            CarState.valueOf(argument);     // convert string to enum

            System.out.println("valid arg: " + argument);
        } catch(RuntimeException e) {
            System.out.println("Hello AGAIN, arg: " + e.getMessage());
        } finally {
            System.out.println("finally block");
        }
        return true;
    }
}
