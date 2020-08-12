package com.example.myapplication123;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.util.Random;

public class Print extends AppCompatActivity {

    TextView textView1;
    TextView textView2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_print);
        Random random = new Random();
        int number = random.nextInt(15);
        String[] fortune1 = getResources().getStringArray(R.array.LUCK);
        String fortune;   fortune = fortune1[number];
        String main = fortune.split("\\.")[0];
        String story = "";
        for(String i : fortune.split("\\."))
        {
         if(main.equals(i))
         {
             continue;
         }
         story += i + ".";
        }

        textView1 = (TextView)findViewById(R.id.textView1);
        textView1.setText(story);
        textView2 = (TextView)findViewById(R.id.textView2);
        textView2.setText(main);
    }
}