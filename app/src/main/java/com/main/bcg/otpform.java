package com.main.bcg;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class otpform extends AppCompatActivity {
Button optbt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_otpform);
optbt=findViewById(R.id.optbtn);
    optbt.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(otpform.this,resestpwd.class);
            startActivity(i);
        }
    });
    }
}