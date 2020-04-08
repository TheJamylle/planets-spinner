package com.example.spinner;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    Spinner spinner;
    ArrayAdapter adapter;
    ImageView iv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inicia();
    }

    private void inicia()
    {
        spinner = (Spinner) findViewById(R.id.spinner);

        final List<Planeta> pls = new ArrayList();
        Planeta p = new Planeta("Mercúrio", R.mipmap.mercurio);
        pls.add(p);
        Planeta p1 = new Planeta("Vênus", R.mipmap.venus);
        pls.add(p1);
        Planeta p2 = new Planeta("Terra", R.mipmap.terra);
        pls.add(p2);
        Planeta p3 = new Planeta("Marte", R.mipmap.marte);
        pls.add(p3);
        Planeta p4 = new Planeta("Júpiter", R.mipmap.jupiter);
        pls.add(p4);
        Planeta p5 = new Planeta("Saturno", R.mipmap.saturno);
        pls.add(p5);
        Planeta p6 = new Planeta("Netuno", R.mipmap.netuno);
        pls.add(p6);
        Planeta p7 = new Planeta("Urano", R.mipmap.urano);
        pls.add(p7);

        List<String> plsn = new ArrayList();
        plsn.add("Mercúrio");
        plsn.add("Vênus");
        plsn.add("Terra");
        plsn.add("Marte");
        plsn.add("Júpiter");
        plsn.add("Saturno");
        plsn.add("Netuno");
        plsn.add("Urano");

        iv = findViewById(R.id.imageView);

        //ArrayAdapter<Planeta> adapter =
                //new ArrayAdapter<Planeta>(getApplicationContext(),  android.R.layout.simple_spinner_dropdown_item, plsn);
        adapter = new ArrayAdapter(this,android.R.layout.simple_spinner_item,plsn);
        adapter.setDropDownViewResource( android.R.layout.simple_spinner_dropdown_item);

        spinner.setAdapter(adapter);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parentView, View selectedItemView, int position, long id) {

                iv.setImageResource(pls.get(position).getImgplaneta());
            }

            @Override
            public void onNothingSelected(AdapterView<?> parentView) {

            }

        });
    }

}
