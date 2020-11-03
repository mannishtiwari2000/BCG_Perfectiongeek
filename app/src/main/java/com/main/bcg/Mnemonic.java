package com.main.bcg;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Mnemonic extends AppCompatActivity {
Button mnemonic;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mnemonic);

    mnemonic=findViewById(R.id.btn_mnemon);
    mnemonic.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Mnemonic.this,Mnemonic_paste.class);
            startActivity(i);
        }
    });
    }
}