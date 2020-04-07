package com.example.coba;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class slide4 extends AppCompatActivity {
    private String pengenal,usia;
    private String sandi1 = "PENGENAL";
    private String sandi2 = "USIA";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_slide4);
        TextView txtShow = findViewById(R.id.txtTampil);

        pengenal = getIntent().getStringExtra(sandi1);
        usia = getIntent().getStringExtra(sandi2);
        txtShow.setText("Beres! Sekarang "+pengenal+" udah bisa ngecek penggunaan HP mu tiap hari buat bantu kamu ngatur waktu :)");
    }
}
