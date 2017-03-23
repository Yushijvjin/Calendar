package com.example.mycalendar;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    MyCalendar myCalendar;
    EditText editTextYear;
    EditText editTextMonth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myCalendar = (MyCalendar) findViewById(R.id.mycalendar);
        myCalendar.setOnCalendarClickListener(new MyCalendar.OnCalendarClickListener() {

            @Override
            public void onCalendaeClick(int dateNum, APPConfig.CalendarState calendarState) {
                // TODO Auto-generated method stub
                Toast.makeText(
                        getApplication(),
                        "dateNum:" + dateNum + "  calendarState:"
                                + calendarState, Toast.LENGTH_LONG).show();
            }
        });

        editTextYear = (EditText) findViewById(R.id.edityear);
        editTextMonth = (EditText) findViewById(R.id.editmonth);
        findViewById(R.id.btnconfirm).setOnClickListener(
                new View.OnClickListener() {

                    @Override
                    public void onClick(View v) {
                        // TODO Auto-generated method stub
                        myCalendar.setYearMonth(Integer.parseInt(editTextYear
                                .getText().toString()), Integer
                                .parseInt(editTextMonth.getText().toString()));
                    }
                });

    }
}
