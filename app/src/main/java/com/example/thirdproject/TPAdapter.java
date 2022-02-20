package com.example.thirdproject;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.helper.widget.Layer;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class TPAdapter extends RecyclerView.Adapter<TPAdapter.TPViewHolder> {

    private ArrayList<String> data;

    public TPAdapter(ArrayList<String> data) {
        this.data = data;
    }

    @NonNull
    @Override
    public TPViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new TPViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull TPViewHolder holder, int position) {
    holder.bind(data.get(position));
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    class TPViewHolder extends RecyclerView.ViewHolder{

        private TextView item;

        public TPViewHolder(@NonNull View itemView) {
            super(itemView);
            item= itemView.findViewById(R.id.tv_language);
        }

        public void bind(String s) {
            item.setText(s);
        }
    }
}
