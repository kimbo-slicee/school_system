package org.java.projects.models;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class School {
    private String name;
    private String address;
    private int phoneNumber;
    List<Student> studentList;
    List<Teacher> teacherList;
    List<Grade> grades;



    public School(String name, String address, int phoneNumber) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.studentList = new ArrayList<>();
        this.teacherList = new ArrayList<>();
        this.grades=new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }

    public List<Teacher> getTeacherList() {
        return teacherList;
    }

    public void setTeacherList(List<Teacher> teacherList) {
        this.teacherList = teacherList;
    }
    public List<Grade> getGrades() {
        return grades;
    }

    public void setGrades(List<Grade> grades) {
        this.grades = grades;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (!(object instanceof School)) return false;
        School school = (School) object;
        return getPhoneNumber() == school.getPhoneNumber() && Objects.equals(getName(), school.getName()) && Objects.equals(getAddress(), school.getAddress()) && Objects.equals(getStudentList(), school.getStudentList()) && Objects.equals(getTeacherList(), school.getTeacherList());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getAddress(), getPhoneNumber(), getStudentList(), getTeacherList());
    }

    @Override
    public String toString() {
        return "School{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phoneNumber=" + phoneNumber +
                ", studentList=" + studentList +
                ", teacherList=" + teacherList +
                '}';
    }
}
