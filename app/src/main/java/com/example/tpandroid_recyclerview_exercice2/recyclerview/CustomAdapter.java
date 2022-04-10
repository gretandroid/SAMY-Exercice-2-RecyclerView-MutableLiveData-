package com.example.tpandroid_recyclerview_exercice2.recyclerview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.tpandroid_recyclerview_exercice2.R;
import com.example.tpandroid_recyclerview_exercice2.model.Person;

import java.util.ArrayList;

public class CustomAdapter extends RecyclerView.Adapter<TextViewHolder> {

    private ArrayList<Person> persons;

    public CustomAdapter(ArrayList<Person> personsList) {
        this.persons = personsList;

        this.persons.add(new Person("samy", "meraihi"));
    }

    @NonNull
    @Override
    public TextViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.row, parent, false);
        return new TextViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull TextViewHolder holder, int position) {
        holder.setFirstnameTextView(persons.get(position).getFirstname());
        holder.setLastnameTextView(persons.get(position).getLastname());
    }

    @Override
    public int getItemCount() {
        return persons.size();
    }
}
