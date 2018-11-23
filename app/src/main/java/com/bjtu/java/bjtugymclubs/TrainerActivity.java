package com.bjtu.java.bjtugymclubs;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by Grégoire on 23/11/2018.
 */

public class TrainerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trainer);


        Intent intent = getIntent();
        String message = "Trainers available for the ";
        message += intent.getStringExtra("CLUB_NAME");


        TextView new_description = findViewById(R.id.TrainerDescription);
        new_description.setText(message);
    }
}