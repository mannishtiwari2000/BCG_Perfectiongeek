package com.main.bcg;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {
    private String[] data;

    public MyAdapter(String[] data) {
        this.data = data;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.my_text_view, parent, false);

        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        String tit = data[position];
        holder.h1.setText(tit);
    }

    @Override
    public int getItemCount() {
        return data.length;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView h1, h2, h3, h4;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            h1 = itemView.findViewById(R.id.heading);
            h2 = itemView.findViewById(R.id.Amount);
            h3 = itemView.findViewById(R.id.usd);
            h4 = itemView.findViewById(R.id.usd2);
        }
    }
}
