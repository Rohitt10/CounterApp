package com.example.counterapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView app;
    TextView count;
    Button button;
    int c=0;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        app=findViewById(R.id.textView);
        count=findViewById(R.id.textView2);
        button=findViewById(R.id.button);
        //adding functionality
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                count.setText(""+counter());
            }
        });
    }
    public int counter()
    {
        return ++c;
    }
}