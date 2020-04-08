package com.example.spinner;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class PlanetaAdapter extends BaseAdapter {
    LayoutInflater inflater;
    List<Planeta> planetas;

    public PlanetaAdapter(Context context, List<Planeta> planetas){
        this.inflater = LayoutInflater.from(context);
        this.planetas = planetas;
    }

    @Override
    public int getCount() {
        return planetas.size();
    }

    @Override
    public Object getItem(int position) {
        return planetas.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Planeta planeta = planetas.get(position);
        convertView = inflater.inflate(R.layout.activity_main, null);
        //((TextView)convertView.findViewById(R.id.txtnome)).setText(planeta.getNome());
        ((ImageView)convertView.findViewById(R.id.imageView)).setImageResource(planeta.getImgplaneta());

        return convertView;
    }
}
