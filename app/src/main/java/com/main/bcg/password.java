package com.main.bcg;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class password extends AppCompatActivity {
Button pwdcnt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_password);
        pwdcnt =findViewById(R.id.pwdcont);
        pwdcnt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(password.this,otpform.class);
                startActivity(i);
            }
        });

    }
}