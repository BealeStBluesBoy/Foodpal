package com.grupotres.foodpal.classes;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.design.widget.Snackbar;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.grupotres.foodpal.R;

import java.util.ArrayList;

public class PiramideAdapter extends RecyclerView.Adapter {

    private Context context;
    private ArrayList<Item> itemsList;

    public class Holder extends RecyclerView.ViewHolder {
        TextView item;
        CardView card;

        public Holder(@NonNull final View itemView) {
            super(itemView);
            item = itemView.findViewById(R.id.info_nombre);
            card = itemView.findViewById(R.id.card_view);

            card.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Snackbar.make(v, v.getTag().toString(), Snackbar.LENGTH_SHORT).show();
                }
            });
        }
    }

    public PiramideAdapter(Context context, ArrayList<Item> itemsList) {
        this.context = context;
        this.itemsList = itemsList;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View contentView = LayoutInflater.from(context).inflate(R.layout.item_piramide, null);
        return new Holder(contentView);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int i) {
        Item item = itemsList.get(i);
        Holder holder = (Holder)viewHolder;
        holder.item.setText(item.getNombre());
        holder.card.setTag(item.getClasificacion());
    }

    @Override
    public int getItemCount() {
        return itemsList.size();
    }
}
