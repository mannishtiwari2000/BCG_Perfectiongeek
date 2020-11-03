package com.main.bcg;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class resestpwd extends AppCompatActivity {
Button btncoont;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resestpwd);
        btncoont=findViewById(R.id.Continue3);
        btncoont.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(resestpwd.this,MainActivity.class);
                startActivity(i);
            }
        });
    }
}