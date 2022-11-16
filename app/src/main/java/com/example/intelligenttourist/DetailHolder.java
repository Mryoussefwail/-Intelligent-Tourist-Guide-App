package com.example.intelligenttourist;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class DetailHolder extends RecyclerView.Adapter<DetailHolder.ViewHold> {
    ArrayList<String> List;
    private ItemClickListener mItemListener;

    public DetailHolder(ArrayList<String> List) {
        this.List = List;
    }

    @NonNull
    @Override
    public ViewHold onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.trip, parent, false);
        return new ViewHold(view);
    }

    @Override
    public void onBindViewHolder(ViewHold holder, int position) {
        holder.triptilte.setText(List.get(position));
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int position=holder.getAdapterPosition();
            }
        });
    }

    @Override
    public int getItemCount() {
        return List.size();
    }
    public interface ItemClickListener{
        void onItemClick(View view,int position);
    }
    public Object getItem(int position)
    {
        return List.get(position);
    }
    public class ViewHold extends RecyclerView.ViewHolder{
        TextView triptilte;
        CardView cardView;
        public ViewHold( View itemView) {
            super(itemView);
            triptilte = itemView.findViewById(R.id.Trip2);
            cardView=itemView.findViewById(R.id.cardview2);
        }
    }
}
