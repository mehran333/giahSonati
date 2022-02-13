package com.example.giahsonati;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.giahsonati.aoi.People;

import java.util.ArrayList;
import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.CovidViewHolder> {
private List<People>peoples=new ArrayList<>();

    public Adapter(List<People> peoples) {
        this.peoples = peoples;
    }

    @NonNull
    @Override
    public CovidViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.coid_item, parent, false);
        return new CovidViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CovidViewHolder holder, int position) {
holder.onbinf(peoples.get(position));
    }

    @Override
    public int getItemCount() {
return peoples.size();
    }

    public class CovidViewHolder extends RecyclerView.ViewHolder {
        TextView txt_con,txt_Confirmed,txt_dea,txt_death,txt_rec,txt_Recovered;
        public CovidViewHolder(@NonNull View itemView) {
            super(itemView);
            txt_con=itemView.findViewById(R.id.txt_con);
            txt_Confirmed=itemView.findViewById(R.id.txt_Confirmed);
            txt_dea=itemView.findViewById(R.id.txt_de);
            txt_death=itemView.findViewById(R.id.txt_death);
            txt_rec=itemView.findViewById(R.id.txt_rec);
            txt_Recovered=itemView.findViewById(R.id.txt_Recovered);
        }
        public void onbinf(People people){
            txt_Confirmed.setText(people.getConfirmed());
            txt_death.setText(people.getDeaths());
            txt_rec.setText(people.getRecovered());
        }
    }

}
