package com.example.final_c;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private NewsAdapter newsAdapter;
    private ArrayList<News> newsArrayList;
    private ArrayList<NewsItem> newsArrayList1;
    private ListView listView;
    private ArrayAdapter<String> listAdapter;
    private ArrayList<String> liveNewsArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recyclerView);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        layoutManager.setOrientation(LinearLayoutManager.HORIZONTAL);
        recyclerView.setLayoutManager(layoutManager);
        // Vertical news
        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        newsArrayList = new ArrayList<>(Arrays.asList(
                new News("Technology", "Sony releases its new 10k resolution phone", R.drawable.vector_image_1),
                new News("Vodafone", "Some users experiencing 3g instead of 5g", R.drawable.vector_image_2),
                new News("Lord", "god is everywhere says a man with drugs", R.drawable.vector_image_3),
                new News("currency update", "due to inflation dollar prie drops", R.drawable.vector_image_4),
                new News("whatsapp bans!", "whats app bans some of the illegal group chats", R.drawable.vector_image_5)
        ));

        newsAdapter = new NewsAdapter(getApplicationContext(), newsArrayList);
        recyclerView.setAdapter(newsAdapter);

        // Horizontal live news
        listView = findViewById(R.id.listView);
        liveNewsArrayList = new ArrayList<>(Arrays.asList(
                "Recent celeb news",
                "TOP music plays",
                "THOPU dresses",
                "KEKA figures",
                "MADDA lo news"
        ));

        listAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, liveNewsArrayList);
        listView.setAdapter(listAdapter);

        // Set onItemClick listener for live news list
        listView.setOnItemClickListener((parent, view, position, id) -> {
            Intent intent = new Intent(MainActivity.this, NewsDetailActivity.class);
            intent.putExtra("title", liveNewsArrayList.get(position));
            intent.putExtra("description", "top  g descriptions");
            startActivity(intent);
        });
    }
}
