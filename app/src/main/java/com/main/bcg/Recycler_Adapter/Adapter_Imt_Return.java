package com.main.bcg.Recycler_Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.main.bcg.R;

public class Adapter_Imt_Return extends RecyclerView.Adapter<Adapter_Imt_Return.myviewholder_imt> {
    String[] data;

    public Adapter_Imt_Return(String[] data) {
        this.data = data;
    }

    @NonNull
    @Override
    public myviewholder_imt onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.imt_return_more_recycler_layout,parent,false);

        return new myviewholder_imt(view);
    }

    @Override
    public void onBindViewHolder(@NonNull myviewholder_imt holder, int position) {
        holder.textb.setText(data[position]);
    }

    @Override
    public int getItemCount() {
        return data.length;
    }

    public class myviewholder_imt extends RecyclerView.ViewHolder {
        TextView textb;

        public myviewholder_imt(@NonNull View itemView) {
            super(itemView);
            textb = itemView.findViewById(R.id.heading_more_imt);
        }
    }
}
