package com.example.mrmoney;

import android.os.Bundle;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

public class CurrentCalculation extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.current_calculation);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("히스토리");
    }
}
