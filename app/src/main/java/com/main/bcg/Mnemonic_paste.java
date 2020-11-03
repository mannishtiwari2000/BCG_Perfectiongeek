package com.main.bcg;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Mnemonic_paste extends AppCompatActivity {
    Button mnemonic_paste;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mnemonic_paste);

        mnemonic_paste = findViewById(R.id.Mnemonic_paste);
        mnemonic_paste.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Mnemonic_paste.this,Transaction_pin.class);
                startActivity(i);
            }
        });

    }
}