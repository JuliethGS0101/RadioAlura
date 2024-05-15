package com.aluracursos.radiosalura.modelos;

public class Audio {
    private String titulo;
    private int totalDeReproducciones;
    private int totalDeMeGusta;
    private int clasificable;

    public void meGusta(){
        this.totalDeMeGusta++;
    }

    public void reproduce(){
        this.totalDeReproducciones++;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getTotalDeReproducciones() {
        return totalDeReproducciones;
    }

    public void setTotalDeReproducciones(int totalDeReproducciones) {
        this.totalDeReproducciones = totalDeReproducciones;
    }

    public int getTotalDeMeGusta() {
        return totalDeMeGusta;
    }

    public void setTotalDeMeGusta(int totalDeMeGusta) {
        this.totalDeMeGusta = totalDeMeGusta;
    }

    public int getClasificable() {
        return clasificable;
    }

    public void setClasificable(int clasificable) {
        this.clasificable = clasificable;
    }
}
