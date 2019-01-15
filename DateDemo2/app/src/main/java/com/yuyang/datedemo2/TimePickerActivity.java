package com.yuyang.datedemo2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TimePicker;
import android.widget.Toast;

public class TimePickerActivity extends AppCompatActivity implements TimePicker.OnTimeChangedListener{

    TimePicker tp_test;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_time_picker);
        tp_test = (TimePicker) findViewById(R.id.tp_test);
    }

    @Override
    public void onTimeChanged(TimePicker view, int hourOfDay, int minute) {
        Toast.makeText(TimePickerActivity.this,"您选择的时间是："+hourOfDay+"时"+minute+"分!",Toast.LENGTH_SHORT).show();
    }
}
