package com.ngodingz.ceritaku;

import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class IsiCeritaActivity extends AppCompatActivity {

    TextView tvJudul, tvIsi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_isi_cerita);

        tvJudul = findViewById(R.id.tvJudul);
        tvIsi = findViewById(R.id.tvIsi);

        String judul = getIntent().getStringExtra("judul");
        String isi = getIntent().getStringExtra("isi");

        tvJudul.setText(judul);
        tvIsi.setText(isi);
    }
}