package com.bjtu.java.bjtugymclubs;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CalendarView;
import android.widget.TextView;
import android.widget.Toast;

public class ClubActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_club);

        Intent intent = getIntent();
        String message = intent.getStringExtra("CLUB_NAME");

        TextView club_nameTXT = findViewById(R.id.clubName);
        club_nameTXT.setText(message);

        CalendarView calendarView= findViewById(R.id.calendarView2);
        calendarView.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {

            @Override
            public void onSelectedDayChange(CalendarView view, int year, int month,
                                            int dayOfMonth) {
                AlertDialog.Builder builder = new AlertDialog.Builder(ClubActivity.this);
                builder.setMessage("Do you want to subscribe for the course of the "
                        + month + "/" + dayOfMonth + "/" + year)
                        .setPositiveButton("Register", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                            }
                        })
                        .setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                            }
                        });
                AlertDialog dialog = builder.create();
                dialog.show();
            }
        });
    }
}
