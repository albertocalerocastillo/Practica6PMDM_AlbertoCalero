package com.example.practica6pmdmalbertocalero;

public class Peliculas {
    public int imagen;
    public String titulo;
    public String director;
    public String reparto;
    public int clasificacion;
    public String sinopsis;
    public int temporadas;

    public Peliculas(int imagen, String titulo, String director, String reparto, int clasificacion, String sinopsis, int temporadas) {
        this.imagen = imagen;
        this.titulo = titulo;
        this.director = director;
        this.reparto = reparto;
        this.clasificacion = clasificacion;
        this.sinopsis = sinopsis;
        this.temporadas = temporadas;
    }

    public void setImagen(int imagen) {
        this.imagen = imagen;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public void setReparto(String reparto) {
        this.reparto = reparto;
    }

    public void setClasificacion(int clasificacion) {
        this.clasificacion = clasificacion;
    }

    public void setSinopsis(String sinopsis) {
        this.sinopsis = sinopsis;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public int getImagen() {
        return imagen;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDirector() {
        return director;
    }

    public String getReparto() {
        return reparto;
    }

    public int getClasificacion() {
        return clasificacion;
    }

    public String getSinopsis() {
        return sinopsis;
    }

    public int getTemporadas() {
        return temporadas;
    }
}