package Homeworks.hw4;

import java.util.Arrays;
import java.util.Scanner;

public class Employee implements Comparable<Employee> {

    private String name;
    private double salary;
    private String position;
    private String department;
    private int age;
    private String email;

    //    public Employee(){
//
//    }
    public Employee(String name, double salary, String position, String department) {
        setName(name);
        setSalary(salary);
        setPosition(position);
        setDepartment(department);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.length() == 0) {
            throw new IllegalArgumentException("Invalid name! ");
        }
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if (salary < 0) {
            throw new IllegalArgumentException("Invalid salary! ");
        }
        this.salary = salary;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        if (position == null || position.length() == 0) {
            throw new IllegalArgumentException("Invalid position! ");
        }
        this.position = position;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        if (department == null || department.length() == 0) {
            throw new IllegalArgumentException("Invalid department! ");
        }

        this.department = department;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Invalid age");
        }
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (email == null || email.length() == 0 || !(email.contains("@"))) {
            throw new IllegalArgumentException(" Inavalid email");
        }
        this.email = email;

    }

    @Override
    public int compareTo(Employee other) {
        return (int) (salary - other.getSalary());
    }


}