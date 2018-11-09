package com.bjtu.java.bjtugymclubs;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ClubActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_club);

        Intent intent = getIntent();
        String message = intent.getStringExtra("CLUB_NAME");

        TextView club_nameTXT = findViewById(R.id.clubName);
        club_nameTXT.setText(message);
    }
}
