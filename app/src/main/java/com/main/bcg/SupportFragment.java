package com.main.bcg;

import android.app.AlertDialog;
import android.app.Dialog;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class SupportFragment extends Fragment {
Button btn_create;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_support, container, false);
        btn_create = root.findViewById(R.id.Add_ticket);
        btn_create.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Dialog openDialog = new Dialog(getContext());
                openDialog.setContentView(R.layout.createticket);
                openDialog.setTitle("Custom Dialog Box");
               openDialog.show();
            }
        });
        return root;
    }
}