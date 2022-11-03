package com.example.pbpmusicplayer;

import android.content.Intent;
import android.media.Image;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyViewHolder extends RecyclerView.ViewHolder {
    ImageView imageView;
    TextView title, artist;
    Button btnPlay;

    public MyViewHolder(@NonNull View itemView) {
        super(itemView);
        imageView = itemView.findViewById(R.id.imagemusic);
        title = itemView.findViewById(R.id.title);
        artist = itemView.findViewById(R.id.artist);
        btnPlay = itemView.findViewById(R.id.btnPlay);
    }
}
