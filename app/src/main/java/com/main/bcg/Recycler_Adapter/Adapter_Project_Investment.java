package com.main.bcg.Recycler_Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.main.bcg.R;

import java.util.zip.Inflater;

public class Adapter_Project_Investment extends RecyclerView.Adapter<Adapter_Project_Investment.MyHolderView> {
    String[] data;

    public Adapter_Project_Investment(String[] data) {
        this.data = data;
    }

    @NonNull
    @Override
    public MyHolderView onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.project_investment_recycler_layout, parent, false);
        return new MyHolderView(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyHolderView holder, int position) {
        holder.txty.setText(data[position]);
    }

    @Override
    public int getItemCount() {
        return data.length;
    }

    public class MyHolderView extends RecyclerView.ViewHolder {
        TextView txty;

        public MyHolderView(@NonNull View itemView) {
            super(itemView);
            txty = itemView.findViewById(R.id.Amount_more_Project);
        }
    }
}
