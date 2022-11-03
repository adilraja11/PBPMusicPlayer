package com.example.pbpmusicplayer;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyViewHolder> {
    Context context;
    ArrayList<ItemMusic> itemMusics;

    public MyAdapter(Context context, List<ItemMusic> itemMusics) {
        this.context = context;
        this.itemMusics = (ArrayList<ItemMusic>) itemMusics;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new MyViewHolder(LayoutInflater.from(context).inflate(R.layout.trak_row, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.title.setText(itemMusics.get(position).getTitle());
        holder.artist.setText(itemMusics.get(position).getArtist());
        holder.imageView.setImageResource(itemMusics.get(position).getImage());

        holder.btnPlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, NextActivity.class);
                intent.putParcelableArrayListExtra("itemmusic", itemMusics);
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return itemMusics.size();
    }
}
