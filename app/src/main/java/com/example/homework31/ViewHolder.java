package com.example.homework31;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ViewHolder extends RecyclerView.ViewHolder {

    private TextView viewholder_tv;

    public ViewHolder(@NonNull View itemView) {

        super(itemView);
        viewholder_tv = itemView.findViewById(R.id.viewholder_tv);


    }


    public void setText(String text ){
        viewholder_tv.setText(text);

    }
}
