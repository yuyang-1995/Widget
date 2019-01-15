package com.yuyang.datedemo3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TimePicker;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TimePicker tp_test = (TimePicker) findViewById(R.id.tp_test);
        tp_test.setOnTimeChangedListener(new TimePicker.OnTimeChangedListener() {
            @Override
            public void onTimeChanged(TimePicker view, int hourOfDay, int minute) {
                Toast.makeText(MainActivity.this,"您选择的时间是："+hourOfDay+"时"+minute+"分!",Toast.LENGTH_SHORT).show();
            }
        });
    }
}
