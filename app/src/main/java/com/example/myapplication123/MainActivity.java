package com.example.myapplication123;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.HashMap;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
private TextView textView1;

    //옥인성
    Button main_nextscreen_btn, main_datepicker_btn;
    TextView main_text_year;
    TextView main_text_month;
    TextView main_text_day;
    EditText main_edit_name;
    TextView main_text_title;
    //옥인성

    private static final String TAG = "MainActivity";
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        Random random = new Random();
//        int number = random.nextInt(15);
//        String[] fortune1 = getResources().getStringArray(R.array.LUCK);
//        String fortune;   fortune = fortune1[number];

        //옥인성
        main_datepicker_btn = findViewById(R.id.datepicker_btn);
        main_nextscreen_btn = findViewById(R.id.main_nextscreen_btn);
        main_text_year = findViewById(R.id.main_text_year);
        main_text_month = findViewById(R.id.main_text_month);
        main_text_day = findViewById(R.id.main_text_day);
        main_edit_name = findViewById(R.id.main_edit_name);
        main_text_title = findViewById(R.id.main_text_title);
        //옥인성
        main_nextscreen_btn = findViewById(R.id.main_nextscreen_btn);
        main_nextscreen_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Print.class);
                if(main_edit_name.getText()!=null){
                    intent.putExtra("name",main_edit_name.getText().toString());
                }
                startActivity(intent);
            }
        });
//옥인성
        main_datepicker_btn.setOnClickListener(new View.OnClickListener() {//"다음으로" 버튼 누르면 다음화면으로 이동하는거
            @Override
            public void onClick(View v) {
                Intent nextscreen = new Intent(getApplicationContext(), DatePicker.class);
                startActivity(nextscreen);
            }
        });
//옥인성
//        textView1 = (TextView)findViewById(R.id.textView1);
//        textView1.setText(fortune);


    }

}