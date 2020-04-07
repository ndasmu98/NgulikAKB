package com.example.coba;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class slide2 extends AppCompatActivity {
Button btnPencet;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_slide2);

        TextView view = findViewById(R.id.textView4);
        btnPencet = findViewById(R.id.klik2);

        String formatText = "Dengan Menekan Tombol masuk berarti Anda menyetujui <b>Ketentuan Pengguna</b> dan <b>Kebijakan Data</b> kami";
        view.setText(Html.fromHtml(formatText));

        btnPencet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(slide2.this, slide3.class);
                startActivity(intent);
            }
        });
    }
}
