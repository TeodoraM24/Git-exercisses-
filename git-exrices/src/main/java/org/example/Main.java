package org.example;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println("Hello world 2!");
        Random randomNum = new Random();
        int randomNumber = randomNum.nextInt(100) + 1;


            if (randomNumber % 3 == 0 && randomNumber % 5 == 0) {
                System.out.println("Fizz");
            } else if (randomNumber % 3 == 0) {
                System.out.println("Buzz");
            } else if (randomNumber % 5 == 0) {
                System.out.println("FizzBuzz");
            } else {
                System.out.println(randomNumber);
            }

    }
}
