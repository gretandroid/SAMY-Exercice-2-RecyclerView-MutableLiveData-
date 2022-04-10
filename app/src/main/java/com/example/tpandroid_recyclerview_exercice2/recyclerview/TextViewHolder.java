package com.example.tpandroid_recyclerview_exercice2.recyclerview;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.tpandroid_recyclerview_exercice2.R;


public class TextViewHolder extends RecyclerView.ViewHolder {

    // Attributes
    private TextView firstnameTextView;
    private TextView lastnameTextView;

    // Setters
    public void setFirstnameTextView(String string) {
        this.firstnameTextView.setText(string);
    }
    public void setLastnameTextView(String string) {
        this.lastnameTextView.setText(string);
    }

    // Constructors
    public TextViewHolder(@NonNull View parent) {
        super(parent);

        firstnameTextView = parent.findViewById(R.id.firstnameTextView);
        lastnameTextView = parent.findViewById(R.id.lastnameTextView);
    }
}
