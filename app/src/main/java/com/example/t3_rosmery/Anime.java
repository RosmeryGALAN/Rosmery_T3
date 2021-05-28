package com.example.t3_rosmery;

public class Anime {
    private String image;
    private String titulo;
    private String descripcion;

    public Anime(String image, String titulo, String descripcion) {
        this.image = image;
        this.titulo = titulo;
        this.descripcion = descripcion;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
