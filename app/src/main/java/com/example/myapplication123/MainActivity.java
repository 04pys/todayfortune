package com.example.myapplication123;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import java.util.HashMap;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
private TextView textView1;
    private static final String TAG = "MainActivity";
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       // ArrayList fortune = new ArrayList();
        Random random = new Random();
        int number = random.nextInt(15);
        String[] fortune1 = getResources().getStringArray(R.array.LUCK);
        String fortune;   fortune = fortune1[number];


        textView1 = (TextView)findViewById(R.id.textView1);
        textView1.setText(fortune);
    }

}