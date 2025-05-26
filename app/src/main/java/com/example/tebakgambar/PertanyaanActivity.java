package com.example.tebakgambar;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class PertanyaanActivity extends AppCompatActivity {

    private ImageView imageQuestion;
    private TextView textQuestion;
    private EditText editAnswer;
    private Button btnCheckAnswer, btnBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pertanyaan);

        imageQuestion = findViewById(R.id.imageQuestion);
        textQuestion = findViewById(R.id.textQuestion);
        editAnswer = findViewById(R.id.editAnswer);
        btnCheckAnswer = findViewById(R.id.btnCheckAnswer);
        btnBack = findViewById(R.id.btnBack);

        textQuestion.setText("Logo ini memiliki bahasa markup yang digunakan untuk struktur" +
                "halaman web. Apa nama dari gambar ini?");
        imageQuestion.setImageResource(R.drawable.html2);

        btnBack.setOnClickListener(v -> finish());

        btnCheckAnswer.setOnClickListener(v -> {
            String jawaban = editAnswer.getText().toString().trim();
            if (jawaban.equalsIgnoreCase("html")) {
                Intent intent = new Intent(this, Benar.class);
                startActivity(intent);
                finish();
            } else {
                Toast.makeText(this, "Jawaban salah!", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
