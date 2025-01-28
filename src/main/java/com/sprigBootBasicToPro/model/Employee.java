package com.sprigBootBasicToPro.model;

import org.springframework.stereotype.Component;

@Component
public class Employee {

    private String name;
    private String id;
    private String role;
    private String salary;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", role='" + role + '\'' +
                ", salary='" + salary + '\'' +
                '}';
    }
}
