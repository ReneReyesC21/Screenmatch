package com.reyeda.screenmatch.modelos;

import com.reyeda.screenmatch.calculos.Clasificable;

public class Episodio implements Clasificable {
    //variable
    private int numeroEp;
    private String nombre;
    private Serie serie;
    private int totalvil;

    //getter
    public int getNumeroEp() {
        return numeroEp;
    }

    public String getNombre() {
        return nombre;
    }

    public Serie getSerie() {
        return serie;
    }

    public int getTotalvil() {
        return totalvil;
    }

    //setter
    public void setNumeroEp(int numeroEp) {
        this.numeroEp = numeroEp;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setSerie(Serie serie) {
        this.serie = serie;
    }
    public void setTotalvil(int totalvil) {
        this.totalvil = totalvil;
    }
//muestra el mejor episodio
    @Override
    public int getClasificable() {
        if (totalvil >100){
            return 4;
        }else{
            return 2;
        }
    }
}
