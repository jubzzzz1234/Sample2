package com.example.jubin.sample2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //making changes in branch
        TextView textView=(TextView)findViewById(R.id.text_view);
        String string="change made";
        textView.setText(string);
    }
}
