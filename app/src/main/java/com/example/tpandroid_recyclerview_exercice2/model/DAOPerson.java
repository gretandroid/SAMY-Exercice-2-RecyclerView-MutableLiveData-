package com.example.tpandroid_recyclerview_exercice2.model;

import java.util.ArrayList;
import java.util.List;

public class DAOPerson {

    // Attributes
    private static ArrayList<Person> persons = new ArrayList<Person>();

    // Getters
    public static ArrayList<Person> getPersons() {
        return persons;
    }

    // méthodes
    public static void addPerson(Person person) {
        persons.add(person);
    }
}
