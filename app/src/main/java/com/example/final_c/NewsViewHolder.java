package com.example.final_c;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

public class NewsViewHolder extends RecyclerView.ViewHolder {

    public TextView newsTitle;
    public ImageView newsImage;

    public NewsViewHolder(View itemView) {
        super(itemView);
        newsTitle = itemView.findViewById(R.id.news_title);
        newsImage = itemView.findViewById(R.id.news_image);
    }
}
