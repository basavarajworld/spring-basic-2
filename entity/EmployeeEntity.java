package com.developer.employeemanagement.entity;

import jakarta.persistence.*;

@Entity
@Table(name="mt_employee")
public class EmployeeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name="emp_id")
    private Long id;

    @Column(name="name")
    private String name;

    @Column(name="gender")
    private String gender;

    @Column(name="date_of_birth")
    private String dateOfBirth;

    @Column(name="address")
    private String address;

    //constructor
    public EmployeeEntity(){

    }

    public EmployeeEntity(long id, String name, String gender, String dateOfBirth, String address) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
        this.address = address;
    }

    //setters and getters
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
