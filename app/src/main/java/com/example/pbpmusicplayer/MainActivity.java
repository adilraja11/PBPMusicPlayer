package com.example.pbpmusicplayer;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.rvTracks);

        List<ItemMusic> itemMusics = new ArrayList<>();
        itemMusics.add(new ItemMusic("Indonesia Raya 1 Stanza", "WR Supratman", R.drawable.imageb));
        itemMusics.add(new ItemMusic("Indonesia Raya Piano 1 Stanza", "WR Supratman", R.drawable.imageb));
        itemMusics.add(new ItemMusic("Indonesia Raya 3 Stanza", "WR Supratman", R.drawable.imagec));

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new MyAdapter(getApplicationContext(),itemMusics));
    }
}