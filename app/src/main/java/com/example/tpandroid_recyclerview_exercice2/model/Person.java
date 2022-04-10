package com.example.tpandroid_recyclerview_exercice2.model;

public class Person {

    // Attributes
    private String firstname;
    private String lastname;

    // Constructors
    public Person(String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
    }

    // Getters
    public String getFirstname() {
        return firstname;
    }
    public String getLastname() {
        return lastname;
    }

    // Setters
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
}
