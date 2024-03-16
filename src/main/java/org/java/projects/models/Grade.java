package org.java.projects.models;

import java.util.List;
import java.util.Objects;

public class Grade {
    private int code;
    private String name;
    private Teacher teacher;
    private List<Student> student;

    public Grade(int code, String name, Teacher teacher, List<Student> student) {
        this.code = code;
        this.name = name;
        this.teacher = teacher;
        this.student = student;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public List<Student> getStudent() {
        return student;
    }

    public void setStudent(List<Student> student) {
        this.student = student;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (!(object instanceof Grade)) return false;
        Grade grade = (Grade) object;
        return getCode() == grade.getCode() && Objects.equals(getName(), grade.getName()) && Objects.equals(getTeacher(), grade.getTeacher()) && Objects.equals(getStudent(), grade.getStudent());
    }

    @Override
    public String toString() {
        return "Grade{" +
                "code=" + code +
                ", name='" + name + '\'' +
                ", teacher=" + teacher +
                ", student=" + student +
                '}';
    }
}
