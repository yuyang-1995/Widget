package com.yuyang.datedemo2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.Toast;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity implements DatePicker.OnDateChangedListener{
     Button b1,b2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        DatePicker dp_test = (DatePicker) findViewById(R.id.dp_test);
        Calendar calendar = Calendar.getInstance();
        int year=calendar.get(Calendar.YEAR);
        int monthOfYear=calendar.get(Calendar.MONTH);
        int dayOfMonth=calendar.get(Calendar.DAY_OF_MONTH);
        dp_test.init(year,monthOfYear,dayOfMonth,this);
        b1 = ((Button) findViewById(R.id.b1));
        b2 = ((Button) findViewById(R.id.b2));
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, TimePickerActivity.class);
                startActivity(intent);
            } });
       b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, CalendarViewActivity.class);
                startActivity(intent);     }
        });}
    @Override
    public void onDateChanged(DatePicker view, int year, int monthOfYear, int dayOfMonth) {
        Toast.makeText(MainActivity.this,"您选择的日期是："+year+"年"+(monthOfYear+1)+"月"+dayOfMonth+"日!",Toast.LENGTH_SHORT).show();
    }
}
