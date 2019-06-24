package com.example.random_color;

import android.graphics.Color;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private ConstraintLayout layout;
    private Button btnGenerateColor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        layout = (ConstraintLayout)findViewById(R.id.layout);
        btnGenerateColor = (Button)findViewById(R.id.btnGenerateColor);

        btnGenerateColor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random random = new Random();

                int color = Color.argb(255,random.nextInt(256),random.nextInt(256),random.nextInt(256));

                layout.setBackgroundColor(color);
            }
        });
    }
}
