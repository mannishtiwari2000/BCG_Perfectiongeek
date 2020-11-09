package com.main.bcg;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.main.bcg.Recycler_Adapter.MyAdapter;
import com.main.bcg.Recycler_Adapter.MyAdapter_history;

import java.util.ArrayList;


public class HistroyFragment extends Fragment {
    RecyclerView recyclerView,recyclerView_return,recyclerView_investment;
    RecyclerView.LayoutManager RecyclerViewLayoutManager, RecyclerViewLayoutManager_return,RecyclerViewLayoutManager_investment;
    LinearLayoutManager HorizontalLayout, HorizontalLayout_return,HorizontalLayout_investment;
 TextView more_transaction,more_imt,more_project;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_histroy, container, false);
        recyclerView = root.findViewById(R.id.transaction_Recycler);
        RecyclerViewLayoutManager = new LinearLayoutManager(getContext());
        recyclerView.setLayoutManager(RecyclerViewLayoutManager);//set The layout
        HorizontalLayout = new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL, false);
        recyclerView.setLayoutManager(HorizontalLayout);
        String[] programming={"C","C++","JAVA","VB.NET","ANDROID STUDIO","C","C++","JAVA","VB.NET","ANDROID STUDIO"};
        recyclerView.setAdapter(new MyAdapter(programming));

        //IMT Return Recycler view

        recyclerView_return=root.findViewById(R.id.Imt_return_Recycler);
        RecyclerViewLayoutManager_return=new LinearLayoutManager(getContext());
        recyclerView_return.setLayoutManager(RecyclerViewLayoutManager_return);//set The layout
        ArrayList<String> programmingA= new ArrayList<>();
        programmingA.add("Manish");
        programmingA.add("Manish");
        programmingA.add("Manish");
        programmingA.add("Manish");
        programmingA.add("Manish");
        programmingA.add("Manish");

        HorizontalLayout_return= new LinearLayoutManager(getContext(),LinearLayoutManager.HORIZONTAL,false);
        recyclerView_return.setLayoutManager(HorizontalLayout_return);
         recyclerView_return.setAdapter(new MyAdapter_history(programmingA));
//Investing RecyclerView

        recyclerView_investment=root.findViewById(R.id.recyclerView_3);
        RecyclerViewLayoutManager_investment= new LinearLayoutManager(getContext());
        recyclerView_investment.setLayoutManager(RecyclerViewLayoutManager_investment);

        ArrayList<String> programmingB= new ArrayList<>();
        programmingB.add("Manish Tiwari");
        programmingB.add("Manish Tiwari");
        programmingB.add("Manish Tiwari");
        programmingB.add("Manish Tiwari");
        programmingB.add("Manish Tiwari");
        programmingB.add("Manish Tiwari");
        HorizontalLayout_investment =new LinearLayoutManager(getContext(),LinearLayoutManager.HORIZONTAL,false);
        recyclerView_investment.setLayoutManager(HorizontalLayout_investment);
        recyclerView_investment.setAdapter(new MyAdapter_history(programmingB));
        more_transaction=root.findViewById(R.id.More_transaction);
        more_imt=root.findViewById(R.id.more_imt_Retrn);
        more_project=root.findViewById(R.id.Project_More);

        more_project.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getContext(),Project_Investing.class);
                startActivity(i);
            }
        });
        more_imt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getContext(),Imt_return_more.class);
                startActivity(i);
            }
        });
        more_transaction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getContext(),transaction_more.class);
                startActivity(i);
            }
        });
        return root;
    }
}