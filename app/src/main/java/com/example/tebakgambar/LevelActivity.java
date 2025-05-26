package com.example.tebakgambar;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class LevelActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    List<Level> levelList;
    LevelAdapter levelAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level);

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        levelList = new ArrayList<>();
        levelList.add(new Level("HTML", false));  // Terbuka
        levelList.add(new Level("Perangkat Keras", true));   // Terkunci
        levelList.add(new Level("Jaringan", true));   // Terkunci

        levelAdapter = new LevelAdapter(this, levelList);
        recyclerView.setAdapter(levelAdapter);
    }
}
