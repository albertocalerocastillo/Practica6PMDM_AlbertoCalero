package com.example.practica6pmdmalbertocalero;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.RatingBar;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;
import java.util.List;

public class Detalles extends AppCompatActivity {
    ImageView imagenDetalles;
    TextView txtTitulo, txtDirector, txtSinopsis, txtTemporadas, txtNumTemporadas;
    ListView reparto;
    RatingBar rbClasificacion;
    List<String> elementos = new ArrayList();
    ArrayAdapter<String> adapter;

    @SuppressLint("WrongConstant")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detalles);
        Bundle extra = getIntent().getExtras();
        imagenDetalles = findViewById(R.id.imagenDetalles);
        txtTitulo = findViewById(R.id.txtTituloDetalles);
        txtDirector = findViewById(R.id.txtDirectorDetalles);
        reparto = findViewById(R.id.listaReparto);
        elementos = new ArrayList<>();
        adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, elementos);
        reparto.setAdapter(adapter);

        rbClasificacion = findViewById(R.id.clasificacion);
        txtSinopsis = findViewById(R.id.txtSinopsisDetalles);
        txtTemporadas = findViewById(R.id.txtTemporadaDetalles);
        txtNumTemporadas = findViewById(R.id.txtNumTemporadaDetalles);

        imagenDetalles.setImageResource(extra.getInt("id"));
        txtTitulo.setText(extra.getString("titulo"));
        txtDirector.setText(extra.getString("director"));
        txtSinopsis.setText(extra.getString("sinopsis"));
        rbClasificacion.setRating(extra.getInt("clasificacion"));
        rbClasificacion.setEnabled(false);

        String[] actor = extra.getString("reparto").split(",");
        elementos.add(actor[0]);
        elementos.add(actor[1]);

        if (extra.getInt("temporadas") == 0) {
            txtTemporadas.setVisibility(View.INVISIBLE);
            txtNumTemporadas.setVisibility(View.INVISIBLE);
        } else {
            txtNumTemporadas.setText("" + extra.getInt("temporadas"));
        }
    }
}