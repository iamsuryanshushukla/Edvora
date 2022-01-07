package com.example.edvora;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;
import java.util.List;

public class EdvoraAdapter extends RecyclerView.Adapter<EdvoraAdapter.Viewholder>{
    List<EdvoraModekl> list;
    Context context;

    public EdvoraAdapter(List<EdvoraModekl> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @NonNull
    @Override
    public Viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.edvora_design,parent,false);
        return new Viewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Viewholder holder, int position) {
        holder.product.setText(list.get(position).getProduct_name());
        holder.brand.setText(list.get(position).getBrand_name());
        holder.date.setText(list.get(position).getDate());
        holder.location.setText(list.get(position).getTime());
        holder.description.setText(list.get(position).getDiscription());
        holder.name.setText(list.get(position).getProduct_name());
        holder.price.setText(list.get(position).getPrice());

        Glide.with(context).load(list.get(position).getImage()).into(holder.profile);


    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class Viewholder extends RecyclerView.ViewHolder{
        TextView product,brand,price,date,location,description,name;
        ImageView profile;

        public Viewholder(@NonNull View itemView) {
            super(itemView);
            product = itemView.findViewById(R.id.tv_productname);
            brand = itemView.findViewById(R.id.tv_brand);
            price = itemView.findViewById(R.id.tv_price);
            date = itemView.findViewById(R.id.tv_date);
            location = itemView.findViewById(R.id.tv_location);
            description = itemView.findViewById(R.id.tv_description);
            profile = itemView.findViewById(R.id.iv_profile);
            name = itemView.findViewById(R.id.tv_name);
        }
    }
}
