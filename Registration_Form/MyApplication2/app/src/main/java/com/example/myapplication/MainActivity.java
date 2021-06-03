package com.example.myapplication;

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

    public void updateData(View view) {

        EditText firstName = findViewById(R.id.edtText1);
        TextView ftName = findViewById(R.id.textView1);
        EditText lastName = findViewById(R.id.edtText2);
        TextView ltName = findViewById(R.id.textView2);
        EditText email = findViewById(R.id.edtText3);
        TextView eml = findViewById(R.id.textView3);
        ftName.setText("First Name: " + firstName.getText().toString());
        ltName.setText("Last Name: " + lastName.getText().toString());
        eml.setText("Email: " + email.getText().toString());

    }

}