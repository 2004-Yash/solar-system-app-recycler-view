package com.android.solarsystem;

import static androidx.core.content.ContextCompat.startActivity;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class SolarAdapter extends RecyclerView.Adapter<SolarAdapter.viewHolder> {

    private ItemClickListener clickListener;
    private Context context;
    private ArrayList<SolarSystem> datasrc;

    public SolarAdapter(ArrayList<SolarSystem> data,Context con) {
        context = con;
        datasrc = data;
    }

    public void setClickListener(ItemClickListener clickListener) {
        this.clickListener = clickListener;
    }

    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view  = LayoutInflater.from(parent.getContext()).inflate(R.layout.planet,parent,false);
        return new viewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolder holder, int position) {
        final SolarSystem data = datasrc.get(position);
        holder.planetImg.setImageResource(data.getPlanetImg());
        holder.planet.setText(data.getPlanet());
        holder.moons.setText(data.getMoons());
    }

    @Override
    public int getItemCount() {
        return datasrc.size();
    }

    public class viewHolder extends RecyclerView.ViewHolder implements View.OnClickListener
    {
        private ImageView planetImg;
        private TextView planet;
        private TextView moons;

        public viewHolder(@NonNull View itemView) {
            super(itemView);
            this.planetImg = itemView.findViewById(R.id.planetImg);
            this.planet = itemView.findViewById(R.id.planet);
            this.moons = itemView.findViewById(R.id.moons);
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v)
        {
            if(clickListener != null){
                clickListener.onClick(v,getAdapterPosition());
            }
        }
    }
}
