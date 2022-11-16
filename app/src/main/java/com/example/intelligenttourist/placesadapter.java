package com.example.test;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class placesadapter extends RecyclerView.Adapter<placesadapter.placesviewholder> {
    Context context;
    List<placesdata> placelist;

    public placesadapter(Context context, List<placesdata> placelist) {
        this.context = context;
        this.placelist = placelist;
    }

    @NonNull
    @Override
    public placesviewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
       View view= LayoutInflater.from(context).inflate(R.layout.places_row_item,parent,false);
        return new placesviewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull placesviewholder holder, int position) {
        holder.place_name.setText(placelist.get(position).getPlace_name());
        holder.place_price.setText(placelist.get(position).getPrice());
        holder.place_image.setImageResource(placelist.get(position).getImageurl());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(context,PlaceDetails.class);

                context.startActivity(i);
            }
        });
    }

    @Override
    public int getItemCount() {
        return placelist.size();
    }

    public static final class placesviewholder extends RecyclerView.ViewHolder
    {
        ImageView place_image;
        TextView place_name,place_price;

        public placesviewholder(@NonNull View itemView) {

            super(itemView);
            place_image=itemView.findViewById(R.id.place_image);
            place_name=itemView.findViewById(R.id.place_name);
            place_price=itemView.findViewById(R.id.place_price);

        }
    }
}
