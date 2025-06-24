package io.conduktor.demos;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Employee_information")
public class Employee {
    @Id
    private int eNum;
    private String eName;
    private String eSurname;
    @Column(name = "eOrganization")
    private String eOrg;

    public Employee() {
    }

    public Employee(int eNum, String eName, String eSurname, String eOrg) {
        this.eNum = eNum;
        this.eName = eName;
        this.eSurname = eSurname;
        this.eOrg = eOrg;
    }

    public int geteNum() {
        return eNum;
    }

    public void seteNum(int eNum) {
        this.eNum = eNum;
    }

    public String geteName() {
        return eName;
    }

    public void seteName(String eName) {
        this.eName = eName;
    }

    public String geteSurname() {
        return eSurname;
    }

    public void seteSurname(String eSurname) {
        this.eSurname = eSurname;
    }

    public String geteOrg() {
        return eOrg;
    }

    public void seteOrg(String eOrg) {
        this.eOrg = eOrg;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "eNum=" + eNum +
                ", eName='" + eName + '\'' +
                ", eSurname='" + eSurname + '\'' +
                ", eOrg='" + eOrg + '\'' +
                '}';
    }
}
