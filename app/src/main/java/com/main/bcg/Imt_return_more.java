package com.main.bcg;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.main.bcg.Recycler_Adapter.Adapter_Imt_Return;

public class Imt_return_more extends AppCompatActivity {
RecyclerView recyclerView_imt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_imt_return_more);

        recyclerView_imt = findViewById(R.id.IMT_RECYCLER);
        recyclerView_imt.setLayoutManager(new LinearLayoutManager(this));
       String[] data={"Manish","Kritika","Rahul","Vikas","Manish","Kritika","Rahul","Vikas","Manish","Kritika","Rahul","Vikas"};
        recyclerView_imt.setAdapter(new Adapter_Imt_Return(data));
    }
}