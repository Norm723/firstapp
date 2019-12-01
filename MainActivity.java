package com.example.firstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Integer Value = 0;
    Button button1, button2;
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button1 = (Button) findViewById(R.id.Inc);
        button1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Value+=1;
                textView = (TextView) findViewById(R.id.inctext);
                textView.setText(Value.toString());
            }
        });
        button2 = (Button) findViewById(R.id.Dec);
        button2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Value-=1;
                textView = (TextView) findViewById(R.id.inctext);
                textView.setText(Value.toString());
            }
        });
    }

}
