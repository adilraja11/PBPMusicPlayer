package com.example.pbpmusicplayer;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyViewHolder> {
    Context context;
    List<ItemMusic> itemMusics;

    public MyAdapter(Context context, List<ItemMusic> itemMusics) {
        this.context = context;
        this.itemMusics = itemMusics;
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
    }

    @Override
    public int getItemCount() {
        return itemMusics.size();
    }
}
