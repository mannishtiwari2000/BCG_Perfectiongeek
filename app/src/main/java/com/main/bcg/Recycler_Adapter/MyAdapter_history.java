package com.main.bcg.Recycler_Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.main.bcg.R;

import java.util.ArrayList;

public class MyAdapter_history extends RecyclerView.Adapter<MyAdapter_history.MyViewHolder> {

    ArrayList<String> data;

    public MyAdapter_history(ArrayList<String> data) {
        this.data = data;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.tranaction_recycler_design, parent, false);

        return new MyAdapter_history.MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        String datamodel = data.get(position);
        holder.abc.setText(datamodel.toString());
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        TextView abc, def, ghi, jkl;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            abc = itemView.findViewById(R.id.ABC);
            def = itemView.findViewById(R.id.DEF);
            ghi = itemView.findViewById(R.id.GHI);
            jkl = itemView.findViewById(R.id.JKL);

        }
    }
}
