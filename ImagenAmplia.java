package com.example.practica6pmdmalbertocalero;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

public class ImagenAmplia extends AppCompatActivity {
    ImageView imagenGrande;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.imagenamplia);
        Bundle extra = getIntent().getExtras();
        imagenGrande = findViewById(R.id.imgGrande);
        imagenGrande.setImageResource(extra.getInt("id"));
    }
}