package com.bjtu.java.bjtugymclubs;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.AdapterView;
import android.widget.CalendarView;
import android.widget.TextView;
import android.widget.Toast;

public class ClubActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid_club);

        Intent intent = getIntent();
        final String message = intent.getStringExtra("CLUB_NAME");

        TextView club_nameTXT = findViewById(R.id.ClubName);
        club_nameTXT.setText(message);

        final CardView reservCard = findViewById(R.id.CardReserv);
        reservCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ClubActivity.this, ReservationActivity.class);
                intent.putExtra("CLUB_NAME", message);
                startActivity(intent);
            }
        });


        final CardView trainerCard = findViewById(R.id.CardTrainer);
        trainerCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ClubActivity.this, TrainerActivity.class);
                intent.putExtra("CLUB_NAME", message);
                startActivity(intent);
            }
        });
    }
}
