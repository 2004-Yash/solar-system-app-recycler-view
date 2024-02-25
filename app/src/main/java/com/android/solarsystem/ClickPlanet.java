package com.android.solarsystem;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.os.Bundle;

import java.util.ArrayList;

public class ClickPlanet extends AppCompatActivity {

    RecyclerView recyclerView;
    ClickedPlanetAdapter adapter;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_click_planet);
        ArrayList<ClickedModel> selected = new ArrayList<>();
        int img = getIntent().getIntExtra("img", R.drawable.earth);
        ArrayList<String> dataReceive = (ArrayList<String>)getIntent().getSerializableExtra("data");
        selected.add(new ClickedModel(img,dataReceive.get(0),dataReceive.get(1),dataReceive.get(2),dataReceive.get(3),dataReceive.get(4)));
        recyclerView = findViewById(R.id.recyclerViewClicked);
        adapter = new ClickedPlanetAdapter(selected,getApplicationContext());
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false));
        recyclerView.setAdapter(adapter);

    }
}