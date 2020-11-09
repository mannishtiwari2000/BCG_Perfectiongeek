package com.main.bcg;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.LinearLayout;

import com.main.bcg.Recycler_Adapter.MyAdapter;
import com.main.bcg.Recycler_Adapter.more_transaction_Adapter;

public class transaction_more extends AppCompatActivity {
    RecyclerView recyclerView_more;
    RecyclerView.LayoutManager RecyclerViewLayoutManager_more;
    LinearLayoutManager HorizontalLayout_more;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transaction_more);
        recyclerView_more = findViewById(R.id.more_transaction_histroy_recyclerview);
        recyclerView_more.setLayoutManager(new LinearLayoutManager(getBaseContext()));//set The layout
        String[] programming = {"C", "C++", "JAVA", "VB.NET", "ANDROID STUDIO", "C", "C++", "JAVA", "VB.NET", "ANDROID STUDIO"};
        recyclerView_more.setAdapter(new more_transaction_Adapter(programming));

    }
}