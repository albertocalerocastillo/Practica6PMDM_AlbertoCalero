package com.example.practica6pmdmalbertocalero;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class PeliculasAdapter extends RecyclerView.Adapter<PeliculasAdapter.PeliculasViewHolder> {
    private List<Peliculas> items;

    public static class PeliculasViewHolder extends RecyclerView.ViewHolder {
        public ImageView imagen;
        public TextView titulo;

        public PeliculasViewHolder(View v) {
            super(v);
            imagen = (ImageView) v.findViewById(R.id.caratula);
            titulo = (TextView) v.findViewById(R.id.txtTitulo);
        }
    }

    public PeliculasAdapter(List<Peliculas> items) {
        this.items = items;
    }

    @Override

    public int getItemCount() {
        return items.size();
    }

    @Override

    public PeliculasViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.fila, viewGroup, false);
        return new PeliculasViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull PeliculasViewHolder peliculasViewHolder, @SuppressLint("RecyclerView") int i) {
        peliculasViewHolder.imagen.setImageResource(items.get(i).getImagen());
        peliculasViewHolder.titulo.setText(items.get(i).getTitulo());
        peliculasViewHolder.titulo.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), Detalles.class);
                intent.putExtra("id", items.get(i).getImagen());
                intent.putExtra("titulo", items.get(i).getTitulo());
                intent.putExtra("director", items.get(i).getDirector());
                intent.putExtra("reparto", items.get(i).getReparto());
                intent.putExtra("clasificacion", items.get(i).getClasificacion());
                intent.putExtra("sinopsis", items.get(i).getSinopsis());
                intent.putExtra("temporadas", items.get(i).getTemporadas());
                view.getContext().startActivity(intent);
            }
        });
        peliculasViewHolder.imagen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), ImagenAmplia.class);
                intent.putExtra("id", items.get(i).getImagen());
                view.getContext().startActivity(intent);
            }
        });
    }
}