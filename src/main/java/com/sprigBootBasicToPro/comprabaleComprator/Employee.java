package com.sprigBootBasicToPro.comprabaleComprator;

public class Employee implements Comparable<Employee>{
    private int id;
    private String name;
    private int salary;

    Employee(int id,String name,int salary){
        this.id=id;
        this.name=name;
        this.salary=salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

//    @Override
//    public String toString() {
//        return "Employee{" +
//                "id=" + id +
//                ", name='" + name + '\'' +
//                ", salary=" + salary +
//                '}';
//    }

    @Override
    public int compareTo(Employee that) {
        if(this.salary == that.salary){
            return this.id-that.id;
        }
        return this.salary-that.salary;
    }
}
