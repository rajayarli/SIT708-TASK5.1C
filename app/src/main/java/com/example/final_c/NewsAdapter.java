package com.example.final_c;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

public class NewsAdapter extends RecyclerView.Adapter<NewsAdapter.ViewHolder> {

    private Context context;
    private ArrayList<News> newsArrayList;

    public NewsAdapter(Context context, ArrayList<News> newsArrayList) {
        this.context = context;
        this.newsArrayList = newsArrayList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.news_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        News newsItem = newsArrayList.get(position);
        holder.newsTitleTextView.setText(newsItem.getTitle());
        holder.newsDescriptionTextView.setText(newsItem.getDescription());
        holder.newsImageView.setImageResource(newsItem.getImageResource());
        holder.newsDateTextView.setText(newsItem.getDate());
    }

    @Override
    public int getItemCount() {
        return newsArrayList.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public TextView newsTitleTextView;
        public TextView newsDescriptionTextView;
        public TextView newsDateTextView;
        public ImageView newsImageView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            newsTitleTextView = itemView.findViewById(R.id.news_title);
            newsDescriptionTextView = itemView.findViewById(R.id.news_description);
            newsDateTextView = itemView.findViewById(R.id.news_date);
            newsImageView = itemView.findViewById(R.id.news_image);
        }
    }
}
