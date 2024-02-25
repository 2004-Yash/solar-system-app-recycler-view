package com.android.solarsystem;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements ItemClickListener {

    RecyclerView recyclerView;
    ArrayList<SolarSystem>  milkyway;
    SolarAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recyclerView);

        milkyway = new ArrayList<>();
        milkyway.add(new SolarSystem("MERCURY","0 Moons",R.drawable.mercury));
        milkyway.add(new SolarSystem("VENUS","0 Moons",R.drawable.venus));
        milkyway.add(new SolarSystem("EARTH","1 Moons",R.drawable.earth));
        milkyway.add(new SolarSystem("MARS","2 Moons",R.drawable.mars));
        milkyway.add(new SolarSystem("JUPITER","79 Moons",R.drawable.jupiter));
        milkyway.add(new SolarSystem("SATURN","62 Moons",R.drawable.saturn));
        milkyway.add(new SolarSystem("URANUS","27 Moons",R.drawable.uranus));
        milkyway.add(new SolarSystem("NEPTUNE","14 Moons",R.drawable.neptune));

        adapter = new SolarAdapter(milkyway,getApplicationContext());
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false));
        recyclerView.setAdapter(adapter);

        adapter.setClickListener(this);



    }

    @Override
    public void onClick(View view, int pos)
    {

        Toast.makeText(this,milkyway.get(pos).getPlanet(),Toast.LENGTH_SHORT).show();
        String clicked_planet = milkyway.get(pos).getPlanet();
        Intent intent = new Intent(MainActivity.this,ClickPlanet.class);
        ArrayList<String> selected = new ArrayList<>();
        switch (clicked_planet) {
            case "MERCURY":
                selected.add("Distance: 48 Million Miles");
                selected.add("Mass: 1/2 of Earth mass");
                selected.add("Temperature: 430°C");
                selected.add("Revolution Time:  88 Days");
                selected.add("Diameter: 4880 KM");
                intent.putExtra("img", R.drawable.mercury_core);
                intent.putExtra("data", selected);
                startActivity(intent);
                break;
            case "VENUS":
                selected.add("Distance: 38 Million Miles");
                selected.add("Mass: 0.815 of Earth mass");
                selected.add("Temperature: 430°C");
                selected.add("Revolution Time:  225 Days");
                selected.add("Diameter: 4880 KM");
                intent.putExtra("img", R.drawable.venus_core);
                intent.putExtra("data", selected);
                startActivity(intent);
                break;
            case "EARTH":
                selected.add("Distance: 0 Miles");
                selected.add("Mass: 6 × 10^24 kg ");
                selected.add("Temperature: 15°C");
                selected.add("Revolution Time:  365 Days");
                selected.add("Diameter: 6400 KM");
                intent.putExtra("img", R.drawable.earth_core);
                intent.putExtra("data", selected);
                startActivity(intent);
                break;
            case "MARS":
                selected.add("Distance: 140 Million Miles");
                selected.add("Mass: 0.1 of Earth mass");
                selected.add("Temperature: -64°C");
                selected.add("Revolution Time:  684 Days");
                selected.add("Diameter: 3890 KM");
                intent.putExtra("img", R.drawable.mars_core);
                intent.putExtra("data", selected);
                startActivity(intent);
                break;
            case "JUPITER":
                selected.add("Distance: 645.9 Million Miles");
                selected.add("Mass: 317.8 of Earth mass");
                selected.add("Temperature: -185°C");
                selected.add("Revolution Time:  12 years");
                selected.add("Diameter: 71492 KM");
                intent.putExtra("img", R.drawable.jupiter_core);
                intent.putExtra("data", selected);
                startActivity(intent);
                break;
            case "SATURN":
                selected.add("Distance: 887 Million Miles");
                selected.add("Mass: 95.16 of Earth mass");
                selected.add("Temperature: -176.15°C");
                selected.add("Revolution Time:  29.4 years");
                selected.add("Diameter: 60268 KM");
                intent.putExtra("img", R.drawable.saturn_core);
                intent.putExtra("data", selected);
                startActivity(intent);
                break;
            case "URANUS":
                selected.add("Distance: 1.6 Billion Miles");
                selected.add("Mass: 14.536 of Earth mass");
                selected.add("Temperature: -197.2°C");
                selected.add("Revolution Time:  84 years");
                selected.add("Diameter: 25362 KM");
                intent.putExtra("img", R.drawable.uranus_core);
                intent.putExtra("data", selected);
                startActivity(intent);
                break;
            default:
                selected.add("Distance: 2.7 Billion Miles");
                selected.add("Mass: 17.147 of Earth mass");
                selected.add("Temperature: -201°C");
                selected.add("Revolution Time:  165 years");
                selected.add("Diameter: 24622 KM");
                intent.putExtra("img", R.drawable.neptune_core);
                intent.putExtra("data", selected);
                startActivity(intent);
                break;
        }

    }
}