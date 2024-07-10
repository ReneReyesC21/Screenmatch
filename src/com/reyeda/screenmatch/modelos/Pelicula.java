package com.reyeda.screenmatch.modelos;

import com.reyeda.screenmatch.calculos.Clasificable;

public class Pelicula extends Titulo implements Clasificable {
//variable
    private String director;
    //setter
    public void setDirector(String director) {
        this.director = director;
    }
//getter
    public String getDirector() {
        return director;
    }

    @Override
    public int getClasificable() {
        return (int) (calculaMedia() / 2);
    }
}
