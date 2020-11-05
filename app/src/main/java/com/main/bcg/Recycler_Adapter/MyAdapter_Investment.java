package com.main.bcg.Recycler_Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.main.bcg.R;

import java.util.ArrayList;

public class MyAdapter_Investment extends RecyclerView.Adapter<MyAdapter_Investment.myviewHolder> {
    ArrayList<String> data;
    public MyAdapter_Investment(ArrayList<String> data) {
        this.data = data;
    }

    @NonNull
    @Override
    public myviewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater=LayoutInflater.from(parent.getContext());
        View view=inflater.inflate(R.layout.investment_layout_recyclre,parent,false);

        return new MyAdapter_Investment.myviewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull myviewHolder holder, int position) {
        String datamodel=data.get(position);
        holder.ABC.setText(datamodel.toString());
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public class myviewHolder extends RecyclerView.ViewHolder {
        TextView ABC, CDE, FGH, HIK;

        public myviewHolder(@NonNull View itemView) {
            super(itemView);
            ABC = itemView.findViewById(R.id.abc);
            CDE = itemView.findViewById(R.id.def);
            FGH = itemView.findViewById(R.id.ghi);
            HIK = itemView.findViewById(R.id.jkl);
        }
    }
}
