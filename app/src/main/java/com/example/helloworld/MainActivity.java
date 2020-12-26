package com.example.helloworld;

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

    public void onBtnClick(View view){
        EditText edtFirstName = findViewById(R.id.edtTxtFirstName);
        EditText edtLastName = findViewById(R.id.edtTextLastName);
        EditText edtEmail = findViewById(R.id.edtTxtEmail);

        TextView txtEmail = findViewById(R.id.txtViewEmail);
        TextView txtLastName = findViewById(R.id.txtViewLastName);
        TextView txtFirstName = findViewById(R.id.txtViewFirstName);

        txtEmail.setText("Email: "+ edtEmail.getText().toString());
        txtLastName.setText("Last Name: " + edtLastName.getText().toString());
        txtFirstName.setText("First Name: " + edtFirstName.getText().toString());
    }
}