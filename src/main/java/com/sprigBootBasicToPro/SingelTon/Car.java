package com.sprigBootBasicToPro.SingelTon;

public class Car {

    private static Car car = new Car();

    private Car(){

    }

    public static Car getInstance(){

        System.out.println("I wanted to byu BMW CAR");
        return car;
    }
}
