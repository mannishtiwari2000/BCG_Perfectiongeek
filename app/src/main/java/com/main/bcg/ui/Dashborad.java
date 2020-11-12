package com.main.bcg.ui;

import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.github.mikephil.charting.charts.PieChart;
import com.github.mikephil.charting.data.PieData;
import com.github.mikephil.charting.data.PieDataSet;
import com.github.mikephil.charting.data.PieEntry;
import com.github.mikephil.charting.utils.ColorTemplate;
import com.main.bcg.R;

import java.util.ArrayList;

public class Dashborad extends Fragment {


    public View onCreateView(@NonNull LayoutInflater inflater,
            ViewGroup container, Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.dashboard, container, false);
        PieChart pieChart = root.findViewById(R.id.piechart);


        ArrayList<PieEntry> entries =new ArrayList<>();
        entries.add(new PieEntry(1000,"2017"));
        entries.add(new PieEntry(900,"2018"));
        entries.add(new PieEntry(800,"2019"));
        entries.add(new PieEntry(700,"2020"));


        PieDataSet pieDataSet=new PieDataSet(entries,"visitor");
        pieDataSet.setColors(ColorTemplate.COLORFUL_COLORS);
        pieDataSet.setValueTextColor(Color.BLACK);
        pieDataSet.setValueTextSize(10f);

        PieData pieData=new PieData(pieDataSet);
        pieChart.setData(pieData);
        pieChart.getDescription().setEnabled(false);
        pieChart.setCenterText("Pie Chat");
        pieChart.animate();
        pieChart.animateXY(5000, 5000);
        return root;
    }
}