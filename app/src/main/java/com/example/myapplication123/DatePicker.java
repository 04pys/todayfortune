package com.example.myapplication123;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class DatePicker extends AppCompatActivity {

    android.widget.DatePicker datepicker_birthday;
    Button datepicker_btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_datepicker);
        final Intent mainactivity = new Intent(getApplicationContext(),MainActivity.class);
        datepicker_birthday = findViewById(R.id.datepicker_birthday);
        datepicker_btn = findViewById(R.id.datepicker_btn);

        datepicker_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(mainactivity);
                Toast.makeText(DatePicker.this, "생년월일을 성공적으로 입력하였습니다!", Toast.LENGTH_SHORT).show();
            }
        });
    }
}