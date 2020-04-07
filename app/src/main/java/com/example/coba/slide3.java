package com.example.coba;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class slide3 extends AppCompatActivity {
    private String sandi1 = "PENGENAL";
    private String sandi2 = "USIA";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_slide3);
        Button send = findViewById(R.id.btnIdentitas);
        final EditText txtPengenal = findViewById(R.id.txtPengenal);
        final EditText txtUsia = findViewById(R.id.txtUsia);

        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nama = txtPengenal.getText().toString();
                String umur = txtUsia.getText().toString();

                Intent i = new Intent(slide3.this, slide4.class);
                i.putExtra(sandi1,nama);
                i.putExtra(sandi2,umur);
                startActivity(i);
            }
        });
    }
}
