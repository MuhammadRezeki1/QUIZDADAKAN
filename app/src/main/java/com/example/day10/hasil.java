package com.example.day10;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class hasil extends AppCompatActivity {

    private TextView menuTextView, minumanTextView, jmlTextView, totalTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hasil);

        menuTextView = findViewById(R.id.menuTextView);
        minumanTextView = findViewById(R.id.minumanTextView);
        jmlTextView = findViewById(R.id.jmlTextView);
        totalTextView = findViewById(R.id.totalTextView);

        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            String makanan = extras.getString("makanan");
            String minuman = extras.getString("minuman");
            String jumlahPorsi = extras.getString("jumlahPorsi");
            int totalHarga = extras.getInt("totalHarga");


            menuTextView.setText("Menu : " + makanan);
            minumanTextView.setText("Minuman : " + minuman);
            jmlTextView.setText("Jumlah Porsi : " + jumlahPorsi);
            totalTextView.setText("Total : "+"Rp." + totalHarga );
        }
    }
}
