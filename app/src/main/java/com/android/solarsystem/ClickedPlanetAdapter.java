package com.android.solarsystem;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ClickedPlanetAdapter extends RecyclerView.Adapter<ClickedPlanetAdapter.viewHolderClicked>{

    private Context context;
    private ArrayList<ClickedModel> datasrc;

    public ClickedPlanetAdapter(ArrayList<ClickedModel> data,Context con) {
        context = con;
        datasrc = data;
    }

    @NonNull
    @Override
    public viewHolderClicked onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view  = LayoutInflater.from(parent.getContext()).inflate(R.layout.clickedplanet,parent,false);
        return new viewHolderClicked(view);
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolderClicked holder, int position)
    {
        final ClickedModel data = datasrc.get(position);
        holder.core.setImageResource(data.getCore());

        holder.distance.setText(data.getDistance());
        holder.diameter.setText(data.getDiameter());
        holder.mass.setText(data.getMass());
        holder.revolution.setText(data.getRevolution());
        holder.temperature.setText(data.getTemperature());

    }

    @Override
    public int getItemCount() {
        return datasrc.size();
    }

    public class viewHolderClicked extends RecyclerView.ViewHolder
    {
        private ImageView core;
        private TextView mass;
        private TextView distance;
        private TextView revolution;
        private TextView temperature;
        private TextView diameter;

        public viewHolderClicked(@NonNull View itemView) {
            super(itemView);
            this.core = itemView.findViewById(R.id.core);
            this.mass = itemView.findViewById(R.id.mass);
            this.distance = itemView.findViewById(R.id.dist);
            this.revolution = itemView.findViewById(R.id.revolution);
            this.temperature = itemView.findViewById(R.id.temperature);
            this.diameter = itemView.findViewById(R.id.diameter);

        }
    }
}
