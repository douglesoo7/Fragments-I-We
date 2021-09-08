package com.example.fragmenti;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridLayout;

import java.util.ArrayList;


public class AnimalFragment extends Fragment {

    private RecyclerView recyclerView;
    private ArrayList<Animal> animalArrayList = new ArrayList<>();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_animal, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initViews(view);
        buildList();
        setRecyclerView();
    }

    private void setRecyclerView() {
        AnimalAdapter animalAdapter=new AnimalAdapter(animalArrayList);
        GridLayoutManager gridLayoutManager=new GridLayoutManager(getContext(),2);
        recyclerView.setLayoutManager(gridLayoutManager);
        recyclerView.setAdapter(animalAdapter);
    }

    private void buildList() {
        for (int i = 0; i < 100; i++) {
            Animal animal=new Animal("Ananya",R.drawable.ananya);
            animalArrayList.add(animal);
        }
    }

    private void initViews(View view) {
        recyclerView = view.findViewById(R.id.recyclerAnimal);
    }
}