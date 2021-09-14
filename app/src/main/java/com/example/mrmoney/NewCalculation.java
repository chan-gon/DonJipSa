package com.example.mrmoney;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import org.w3c.dom.Text;

import java.util.Calendar;

public class NewCalculation extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.new_calculation);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("N분의 일");

        TextView tv = findViewById(R.id.spend_date);
        Calendar cal = Calendar.getInstance();
        tv.setText(cal.get(Calendar.YEAR)+"-"+(cal.get(Calendar.MONTH)+1)+"-"+cal.get(Calendar.DATE));
    }

    DatePickerDialog.OnDateSetListener onDateSetListener = new DatePickerDialog.OnDateSetListener() {
        @Override
        public void onDateSet(DatePicker datePicker, int yy, int mm, int dd) {
            TextView tv = findViewById(R.id.spend_date);
            tv.setText(String.format("%d-%d-%d", yy,mm+1,dd));
        }
    };

    public void setDate(View view){
        Calendar cal = Calendar.getInstance();
        new DatePickerDialog(this, onDateSetListener, cal.get(Calendar.YEAR), cal.get(Calendar.MONTH), cal.get(Calendar.DATE)).show();
    }
}
// https://blog.naver.com/wizand02/221691801438