package com.sprigBootBasicToPro.java8problems;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class AddListInStream {





















    public static void addProblem(){
        List<Integer> no = Arrays.asList(12,32,3,45,32,65,76);

        Optional<Integer> addition = no.stream().reduce((a, b)->a+b);
        System.out.println(addition);
    }
    public static void main(String[] args) {

        AddListInStream.addProblem();

    }
}
