package com.example.tebakgambar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class SoalActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_soal);

        Button btnBack = findViewById(R.id.btnBack);
        btnBack.setOnClickListener(v -> {
            finish();
        });

        Button btnSoal1 = findViewById(R.id.btnSoal1);
        btnSoal1.setOnClickListener(v -> {
            Intent intent = new Intent(SoalActivity.this, PertanyaanActivity.class);
            startActivity(intent);
        });

    }
}
