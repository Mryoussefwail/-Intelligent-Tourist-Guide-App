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

public class tripadapter extends RecyclerView.Adapter<tripadapter.tripviewholder> {
    Context context;
    List<tripdata> triplist;

    public tripadapter(Context context, List<tripdata> triplist) {
        this.context = context;
        this.triplist = triplist;
    }

    @NonNull
    @Override
    public tripadapter.tripviewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(context).inflate(R.layout.places_row_item,parent,false);
        return new tripadapter.tripviewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull tripviewholder holder, int position) {
        holder.trip_name.setText(triplist.get(position).getTrip_name());
        holder.trip_price.setText(triplist.get(position).getPrice());
        holder.trip_image.setImageResource(triplist.get(position).getImageurl());

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
        return triplist.size();
    }
    public static final class tripviewholder extends RecyclerView.ViewHolder
    {
        ImageView trip_image;
        TextView trip_name,trip_price;

        public tripviewholder(@NonNull View itemView) {

            super(itemView);
            trip_image=itemView.findViewById(R.id.place_image);
            trip_name=itemView.findViewById(R.id.place_name);
            trip_price=itemView.findViewById(R.id.place_price);

        }


    }
}
