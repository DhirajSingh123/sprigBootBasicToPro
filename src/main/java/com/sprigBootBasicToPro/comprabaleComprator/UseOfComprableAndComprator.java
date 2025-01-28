package com.sprigBootBasicToPro.comprabaleComprator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class UseOfComprableAndComprator {

    //Sorting by Comparable
    public void getComprable(List<Employee> emp){

        for(Employee list:emp){
            System.out.println("Employee Id:::"+list.getId()+" Employee Name:::"+list.getName()+" Employe Salary::"+list.getSalary());
        }

        Collections.sort(emp);

        System.out.println("AFTER SORTING::::::::::::::");
    }

    //Sorting by Comparator
    public void getComprator(List<Employee> emp){

        Collections.sort(emp, new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {

                if(o1.getSalary()==o2.getSalary()){
                    return o1.getId()-o2.getId();
                }

                return o1.getSalary()-o2.getSalary();
            }
        });

    }

    public static void main(String[] args) {

        UseOfComprableAndComprator obj = new UseOfComprableAndComprator();
        List<Employee> emp = new ArrayList<>();

        Employee emp1= new Employee(101,"Dhiraj",150000);
        Employee emp2= new Employee(106,"Raju",150000);
        Employee emp3= new Employee(102,"Prsant",75000);
        Employee emp4= new Employee(109,"Ambani",250000);
        Employee emp5= new Employee(121,"Shreya",15000);
        Employee emp6 = new Employee(104,"Vadiraj",75000);

        emp.add(emp1);
        emp.add(emp2);
        emp.add(emp6);
        emp.add(emp4);
        emp.add(emp5);
        emp.add(emp3);

        obj.getComprable(emp);
        for(Employee list:emp){

            System.out.println("Employee Id:::"+list.getId()+" Employee Name:::"+list.getName()+" Employe Salary::"+list.getSalary());
        }
    }
}
