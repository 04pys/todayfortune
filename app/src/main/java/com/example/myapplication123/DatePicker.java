package com.example.myapplication123;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

public class DatePicker extends AppCompatActivity {

    android.widget.DatePicker datepicker_birthday;
    Button datepicker_btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_datepicker);

        datepicker_birthday = findViewById(R.id.datepicker_birthday);
        datepicker_btn = findViewById(R.id.datepicker_btn);
    }
}