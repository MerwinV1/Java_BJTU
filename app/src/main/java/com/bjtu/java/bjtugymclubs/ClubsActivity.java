package com.bjtu.java.bjtugymclubs;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ClubsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clubs);

        final String[] clubs = new String[] {
                "Soccer Club",
                "Karate Club",
                "Basketball Club",
                "Tennis Club"
        };

        final ListView listV = findViewById(R.id.clubsList);
        listV.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(ClubsActivity.this, ClubActivity.class);
                intent.putExtra("CLUB_NAME", clubs[position]);
                startActivity(intent);
            }
        });
        final List<String> clubsList = new ArrayList<String>(Arrays.asList(clubs));
        final ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>
                (this, android.R.layout.simple_list_item_1, clubsList);
        listV.setAdapter(arrayAdapter);
    }
}
