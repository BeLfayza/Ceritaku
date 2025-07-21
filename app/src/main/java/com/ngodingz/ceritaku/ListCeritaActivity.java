package com.ngodingz.ceritaku;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class ListCeritaActivity extends AppCompatActivity {

    Button btnBaca1, btnBaca2;
    ImageButton btnKembali;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_cerita);

        btnKembali = findViewById(R.id.btnKembali);
        btnBaca1 = findViewById(R.id.btnBaca1);
        btnBaca2 = findViewById(R.id.btnBaca2);

        btnKembali.setOnClickListener(v -> {
            Intent intent = new Intent(ListCeritaActivity.this, MainActivity.class);
            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
            startActivity(intent);
            finish();
        });

        btnBaca1.setOnClickListener(v -> {
            Intent intent = new Intent(this, IsiCeritaActivity.class);
            intent.putExtra("judul", "Putri di Menara");
            intent.putExtra("isi", "Dahulu kala, hiduplah seorang putri di puncak menara tinggi...");
            startActivity(intent);
        });

        btnBaca2.setOnClickListener(v -> {
            Intent intent = new Intent(this, IsiCeritaActivity.class);
            intent.putExtra("judul", "Si Kancil dan Buaya");
            intent.putExtra("isi", "Suatu hari, Si Kancil hendak menyeberangi sungai...");
            startActivity(intent);
        });
    }
}
