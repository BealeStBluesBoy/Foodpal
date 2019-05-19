package com.grupotres.foodpal.classes;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.grupotres.foodpal.R;

import java.util.ArrayList;

public class ListaAdapter extends RecyclerView.Adapter {
    private Context context;
    private ArrayList<Item> itemsList;

    public ListaAdapter(Context context, ArrayList<Item> itemsList) {
        this.context = context;
        this.itemsList = itemsList;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View contentView = LayoutInflater.from(context).inflate(R.layout.item_lista, null);
        return new Holder(contentView);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int i) {
        Item item = itemsList.get(i);
        Holder holder = (Holder)viewHolder;
        holder.nombre.setText(item.getNombre());
        holder.calorias.setText(item.getCalorias().toString());
        holder.hidratos.setText(item.getHidratosCarbono().toString());
        holder.proteinas.setText(item.getProteinas().toString());
        holder.grasas.setText(item.getGrasas().toString());
    }

    @Override
    public int getItemCount() {
        return itemsList.size();
    }

    public static class Holder extends RecyclerView.ViewHolder {
        TextView nombre, calorias, hidratos, proteinas, grasas;

        public Holder(@NonNull View itemView) {
            super(itemView);
            nombre = itemView.findViewById(R.id.info_nombre);
            calorias = itemView.findViewById(R.id.info_calorias);
            hidratos = itemView.findViewById(R.id.info_hidratos);
            proteinas = itemView.findViewById(R.id.info_proteinas);
            grasas = itemView.findViewById(R.id.info_grasas);
        }
    }
}
