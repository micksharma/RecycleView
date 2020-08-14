package com.example.favlistapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class CategoryAdapter extends RecyclerView.Adapter<CategoryViewHolder> {
    String [] categories = { "Hobbies", "Games","Electronics Gadgets" , "Foods" , "countries"};



    @NonNull
    @Override
    public CategoryViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.category_viewholder,parent,false);

        CategoryViewHolder categoryViewHolder = new CategoryViewHolder(view);
        return categoryViewHolder;




    }

    @Override
    public void onBindViewHolder(@NonNull CategoryViewHolder holder, int position) {

        holder.getTxtCategoryNumber().setText(Integer.toString(position + 1));
        holder.getGetTxtCategoryName().setText(categories[position]);
    }

    @Override
    public int getItemCount() {
        return categories.length;
    }
}
