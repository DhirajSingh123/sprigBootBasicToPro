package com.sprigBootBasicToPro.java8problems;

import java.util.*;
import java.util.stream.Collectors;

public class Problem1 {
    //filter even no and sort with ascending order
    public static void getProblem1(){
        List<Integer> no= Arrays.asList(66,19,2,31,14,24,54,35,66,26,17);

        List<Integer> filteredList=no.stream().filter(n->n%2==0).sorted().collect(Collectors.toList());
        System.out.println(filteredList);
    }

    //filter even no and sort with descending order and remove duplicate
    public static void getProblem2(){
        List<Integer> no= Arrays.asList(66,19,2,31,14,24,54,35,66,26,17);

        List<Integer> filteredList=no.stream().filter(n->n%2==0).sorted(Comparator.reverseOrder()).distinct().toList();
        System.out.println(filteredList);
    }

    //find maximum no from list
    public static void getProblem3(){
        List<Integer> no= Arrays.asList(66,19,2,31,14,24,54,35,96,26,17);

        List<Integer> filteredList=no.stream().sorted(Comparator.reverseOrder()).distinct().toList();
        System.out.println(filteredList.get(0));
    }

    //find 2nd even maximum no from the list
    public static void getProblem4(){
        List<Integer> no= Arrays.asList(66,19,2,31,14,24,54,35,96,26,17);
        List<Integer> filteredList=no.stream().filter(n->n%2==0).sorted(Comparator.reverseOrder()).distinct().skip(1).toList();
        System.out.println(filteredList.get(0));
    }
    public static void main(String[] args) {

        Problem1.getProblem1();
        Problem1.getProblem2();
        Problem1.getProblem3();
        Problem1.getProblem4();


    }
}
