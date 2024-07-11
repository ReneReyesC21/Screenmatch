package com.reyeda.screenmatch.calculos;

import com.reyeda.screenmatch.modelos.Titulo;

public class CalculadoraTiempo {
    //variables
    private int tiempoTotal;
    //getter
    public int getTiempoTotal() {
        return tiempoTotal;
    }

//    public void incluido(Filme f){
//        this.tiempoTotal += f.getDuracionMin();
//    }
//    public void incluido(serie s){
//        this.tiempoTotal += s.getDuracionMin();
//    }

    //metodo
    public void incluye(Titulo titulo){
        this.tiempoTotal += titulo.getDuracionEnMinutos();
    }

}
