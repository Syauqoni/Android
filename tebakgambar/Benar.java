package com.example.tebakgambar;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Benar extends AppCompatActivity {

    private ImageView imageCorrectAnswer;
    private TextView textJawabanBenar, textPenjelasan;
    private Button btnBackCorrect, btnLanjut;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_benar);

        imageCorrectAnswer = findViewById(R.id.imageCorrectAnswer);
        textJawabanBenar = findViewById(R.id.textJawabanBenar);
        textPenjelasan = findViewById(R.id.textPenjelasan);
        btnBackCorrect = findViewById(R.id.btnBackCorrect);
        btnLanjut = findViewById(R.id.btnLanjut);

        // Set gambar dan penjelasan
        imageCorrectAnswer.setImageResource(R.drawable.html2);
        textPenjelasan.setText("HTML (HyperText Markup Language) adalah bahasa markup " +
                "yang digunakan untuk membuat struktur dan konten halaman web.");

        btnBackCorrect.setOnClickListener(v -> finish());

        btnLanjut.setOnClickListener(v -> {
            Log.d("BenarActivity", "Menuju halaman selesai...");
            Intent intent = new Intent(this, Selesai.class);
            startActivity(intent);
            finish();
        });
    }
}

