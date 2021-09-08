package com.example.fragmenti;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class AnimalViewHolder extends RecyclerView.ViewHolder {

    private TextView mTvName;
    private ImageView mIvPic;

    public AnimalViewHolder(@NonNull View itemView) {
        super(itemView);
        initViews();
    }

    private void initViews() {
        mTvName=itemView.findViewById(R.id.tvName);
        mIvPic=itemView.findViewById(R.id.ivImage);
    }

    public void setDataAnimal(Animal animal){
        mTvName.setText(animal.getName());
        mIvPic.setImageResource(animal.getImageId());
    }
}
