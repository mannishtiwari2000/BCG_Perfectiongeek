package com.main.bcg.ui;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.main.bcg.MyAdapter;
import com.main.bcg.R;

public class My_wallet extends Fragment {

    public View onCreateView(@NonNull LayoutInflater inflater,
            ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.my_wallet, container, false);

        RecyclerView recyclerView =root.findViewById(R.id.recycler_wallet);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        String[] programming={"C","C++","JAVA","VB.NET","ANDROID STUDIO","C","C++","JAVA","VB.NET","ANDROID STUDIO"};
        recyclerView.setAdapter(new MyAdapter(programming));
        return root;
    }
}