package com.example.pbpmusicplayer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class NextActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next);

        String judul = getIntent().getStringExtra("TITLE");
        String artis = getIntent().getStringExtra("ARTIST");


        TextView title = findViewById(R.id.title);
        TextView artist = findViewById(R.id.artist);
        TextView currenttime = findViewById(R.id.currenttime);
        TextView totaltime = findViewById(R.id.totaltime);
        ImageView imagemusic = findViewById(R.id.artWork);

        title.setText(judul);
        artist.setText(artis);
    }
}