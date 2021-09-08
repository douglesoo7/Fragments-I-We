package com.example.fragmenti;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AnimalAdapter extends RecyclerView.Adapter<AnimalViewHolder> {

    private ArrayList<Animal> animalArrayList;

    public AnimalAdapter(ArrayList<Animal> animalArrayList) {
        this.animalArrayList = animalArrayList;
    }

    @NonNull
    @Override
    public AnimalViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout, parent, false);
        return new AnimalViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AnimalViewHolder holder, int position) {
        Animal animal = animalArrayList.get(position);
        holder.setDataAnimal(animal);
    }

    @Override
    public int getItemCount() {
        return animalArrayList.size();
    }
}
