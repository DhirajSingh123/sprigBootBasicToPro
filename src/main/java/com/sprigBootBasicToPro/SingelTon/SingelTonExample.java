package com.sprigBootBasicToPro.SingelTon;

public class SingelTonExample {

    public static void main(String[] args) {
        Car obj = Car.getInstance();
        //we can't create bcz its single ton...
//        Car d= new Car();


    }
}
