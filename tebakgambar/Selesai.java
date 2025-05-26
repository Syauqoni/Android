package com.example.tebakgambar;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Selesai extends AppCompatActivity {

    private Button btnSelesai;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selesai);

        btnSelesai = findViewById(R.id.btnSelesai);
        btnSelesai.setOnClickListener(v -> {
            // Kembali ke halaman utama atau materi
            Intent intent = new Intent(this, LevelActivity.class);
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NEW_TASK);
            startActivity(intent);
            finish();
        });
    }
}
