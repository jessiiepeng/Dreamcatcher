package com.example.dreamcatcher;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.DatePicker;
import android.widget.EditText;

import java.text.DateFormatSymbols;
import java.util.Calendar;

public class LogDreamInfo extends AppCompatActivity {
    EditText txtDate;
    private int mYear, mMonth, mDay;
    int cYear, cMonth, cDay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_dream_info);
        txtDate = findViewById(R.id.txtDate);
    }

    @RequiresApi(api = Build.VERSION_CODES.N)
    public void chooseDate(View v) {
        final Calendar c = Calendar.getInstance();
        mYear = c.get(Calendar.YEAR);
        mMonth = c.get(Calendar.MONTH);
        mDay = c.get(Calendar.DAY_OF_MONTH);

        DatePickerDialog datePickerDialog = new DatePickerDialog(this, new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                String strMonth = new DateFormatSymbols().getMonths()[month];
                cYear = year; cMonth = month; cDay = dayOfMonth;
                txtDate.setText(strMonth + " " + dayOfMonth + ", " + year);
            }
        }, mYear, mMonth, mDay);
        datePickerDialog.show();
    }
}
