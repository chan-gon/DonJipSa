package com.example.mrmoney;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button newCalculation = findViewById(R.id.new_calculation);
        newCalculation.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, NewCalculation.class);
                startActivity(intent);
            }
        });

        Button currentCalculation = findViewById(R.id.current_calculation);
        currentCalculation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, CurrentCalculation.class);
                startActivity(intent);
            }
        });

    }
}