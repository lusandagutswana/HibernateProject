package io.conduktor.demos;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Student {
    @Id
    private int rollNo;
    private String sName;
    private int Age;
    private String sSurname;

    public Student() {
    }

    public Student(int rollNo, String sName, int age, String sSurname) {
        this.rollNo = rollNo;
        this.sName = sName;
        Age = age;
        this.sSurname = sSurname;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    public String getsSurname() {
        return sSurname;
    }

    public void setsSurname(String sSurname) {
        this.sSurname = sSurname;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollNo=" + rollNo +
                ", sName='" + sName + '\'' +
                ", Age=" + Age +
                ", sSurname='" + sSurname + '\'' +
                '}';
    }
}
