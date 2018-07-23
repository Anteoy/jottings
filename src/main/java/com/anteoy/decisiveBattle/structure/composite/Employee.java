package com.anteoy.decisiveBattle.structure.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zhoudazhuang on 17-12-13.
 * 组合/合成模式
 */
public class Employee {
    public String name;
    public String dept;
    public int salary;

    public List<Employee> subEmployees;

    public Employee(String name, String dept, int salary) {
        this.name = name;
        this.dept = dept;
        this.salary = salary;
        this.subEmployees = new ArrayList<>();
    }

    public void add(Employee employee) {
        subEmployees.add(employee);
    }

    public void remove(Employee employee) {
        subEmployees.remove(employee);
    }

    public List<Employee> getSubEmployees() {
        return subEmployees;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", dept='" + dept + '\'' +
                ", salary=" + salary +
                ", subEmployees=" + subEmployees +
                '}';
    }
}
