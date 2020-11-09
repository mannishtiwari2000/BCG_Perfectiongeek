package com.main.bcg;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.main.bcg.Recycler_Adapter.Adapter_Project_Investment;

public class Project_Investing extends AppCompatActivity {
    RecyclerView recyclerView_project;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_project__investing);

    recyclerView_project=findViewById(R.id.Project_Investing_Recycler);
    recyclerView_project.setLayoutManager(new LinearLayoutManager(this));
    String[] data={"ABC","DEF","GHI","JKL","MNO","PQR","STU","VWZ","ABC","DEF","GHI","JKL","MNO","PQR","STU","VWZ","ABC","DEF","GHI","JKL","MNO","PQR","STU","VWZ"};
    recyclerView_project.setAdapter(new Adapter_Project_Investment(data));
    }
}