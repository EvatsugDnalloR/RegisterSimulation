package com.example.registersimulation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void clickingButton(View view) {
        TextView txtFNameContent = findViewById(R.id.TxtFName);
        TextView txtLNameContent = findViewById(R.id.TxtLName);
        TextView txtEmailContent = findViewById(R.id.TxtEmail);
        EditText editTxtFName = findViewById(R.id.editTxtFName);
        EditText editTxtLName = findViewById(R.id.editTxtLName);
        EditText editTxtEmail = findViewById(R.id.editTxtEmail);
        txtFNameContent.setText("First Name: " + editTxtFName.getText().toString());
        txtLNameContent.setText("Last Name: " + editTxtLName.getText().toString());
        txtEmailContent.setText("Email: " + editTxtEmail.getText().toString());
    }
}