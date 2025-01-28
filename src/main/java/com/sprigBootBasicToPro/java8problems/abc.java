package com.sprigBootBasicToPro.java8problems;

@FunctionalInterface
public interface abc {
    public void add();

    default void sub(){
        System.out.println("Hello");
    }
}
