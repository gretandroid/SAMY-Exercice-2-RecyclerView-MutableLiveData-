package com.example.tpandroid_recyclerview_exercice2.model;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import java.util.ArrayList;

public class MainActivityViewModel extends ViewModel {

    // Attributes
    private static MutableLiveData<ArrayList<Person>> persons;

    // Getters
    public static MutableLiveData<ArrayList<Person>> getPersonsList() {

        if(persons == null) {
            if (DAOPerson.getPersons() != null) {
                persons = new MutableLiveData<>(DAOPerson.getPersons());
            } else {
                persons = new MutableLiveData<>(new ArrayList<Person>());
            }
            return persons;
        } else {
            return persons;
        }
    }

    // Setters
    public static void setPersonsList(ArrayList<Person> newPersonList) {
        persons.setValue(newPersonList);
    }
}
