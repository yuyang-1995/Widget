
package com.yuyang.datedemo2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CalendarView;
import android.widget.Toast;

public class CalendarViewActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calendar_view);
        CalendarView cv_test = (CalendarView) findViewById(R.id.cv_test);
        cv_test.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            @Override
            public void onSelectedDayChange(CalendarView view, int year, int month, int dayOfMonth) {
                Toast.makeText(CalendarViewActivity.this,"您选择的时间是："+ year + "年" + month + "月" + dayOfMonth + "日",Toast.LENGTH_SHORT).show();
            }
        });
    }
}
