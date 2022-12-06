package com.example.employeeapp_backend.model;

import jakarta.persistence.*;

@Entity
@Table(name="Employee")

public class Employee {

    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private int id;

    private int empCode;
    private String empName;
    private String designation;
    private int salary;
    private String companyName;
    private String mobile;
    private String username;
    private String password;

    public Employee() {
    }

    public Employee(int id, int empCode, String empName, String designation, int salary, String companyName, String mobile, String username, String password) {
        this.id=id;
        this.empCode = empCode;
        this.empName = empName;
        this.designation = designation;
        this.salary = salary;
        this.companyName = companyName;
        this.mobile = mobile;
        this.username = username;
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getEmpCode() {
        return empCode;
    }

    public void setEmpCode(int empCode) {
        this.empCode = empCode;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyname) {
        this.companyName = companyname;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
