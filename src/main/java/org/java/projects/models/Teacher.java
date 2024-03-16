package org.java.projects.models;

import org.java.projects.models.Person;

public class Teacher extends Person {
    private int salary;

    public Teacher(String name, int age , int salary) {
        super(name, age);
        this.salary=salary;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "salary=" + salary +
                '}';
    }
}
