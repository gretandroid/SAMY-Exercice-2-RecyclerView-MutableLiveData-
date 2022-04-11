package com.example.tpandroid_recyclerview_exercice2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import com.example.tpandroid_recyclerview_exercice2.model.DAOPerson;
import com.example.tpandroid_recyclerview_exercice2.model.MainActivityViewModel;
import com.example.tpandroid_recyclerview_exercice2.model.Person;
import com.example.tpandroid_recyclerview_exercice2.recyclerview.CustomAdapter;

import java.util.ArrayList;
import java.util.Observer;

public class MainActivity extends AppCompatActivity {

    TextView firstnameEditText;
    TextView lastnameEditText;
    RecyclerView recyclerView;
    MainActivityViewModel viewModelProvider;
    MutableLiveData<ArrayList<Person>> persons;
    CustomAdapter customAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        firstnameEditText = findViewById(R.id.firstNameEditText);
        lastnameEditText = findViewById(R.id.lastNameEditText);
        persons = MainActivityViewModel.getPersonsList();
        recyclerView = findViewById(R.id.recyclerView);
        viewModelProvider = new ViewModelProvider(this).get(MainActivityViewModel.class);

        // RecyclerView
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        customAdapter = new CustomAdapter(viewModelProvider.getPersonsList().getValue());
        recyclerView.setAdapter(customAdapter);

        // ViewModel
        viewModelProvider.getPersonsList().observe(this, value -> customAdapter.notifyItemInserted(value.size() - 1));
    }

    public void addButtonOnClick(View view) {
        String firstname = firstnameEditText.getText().toString();
        String lastname = lastnameEditText.getText().toString();
        Person person = new Person(firstname, lastname);
        DAOPerson.addPerson(person);
        MainActivityViewModel.setPersonsList(DAOPerson.getPersons());
    }
}