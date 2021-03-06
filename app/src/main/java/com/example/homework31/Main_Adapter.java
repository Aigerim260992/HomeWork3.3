package com.example.homework31;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Main_Adapter extends RecyclerView.Adapter <ViewHolder> {

    ArrayList<String> list;

    public Main_Adapter(){
         list = new ArrayList<>();
    }



    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater inflater = LayoutInflater.from(parent.getContext());

        View v = inflater.inflate(R.layout.viewholder_item, parent, false);

        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.setText(list.get(position));

    }

    @Override
    public int getItemCount() {
        return list.size();
    }


    public void addText(String text){
        list.add(text);
        notifyDataSetChanged();
    }
}
