package org.java.projects.models;

import org.java.projects.models.Person;

public class Student extends Person {

   private int phoneNumber;

   public int getPhoneNumber() {
      return phoneNumber;
   }

   public void setPhoneNumber(int phoneNumber) {
      this.phoneNumber = phoneNumber;
   }

   public Student(String name, int age , int phoneNumber) {
      super(name, age);
      this.phoneNumber=phoneNumber;
   }

   @Override
   public String toString() {
      return "Student{" +
              "phoneNumber=" + phoneNumber +
              '}';
   }
}
