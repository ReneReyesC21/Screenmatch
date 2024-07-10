package com.reyeda.screenmatch.calculos;

import com.reyeda.screenmatch.modelos.Titulo;

public class CalculadoraTiempo {
    //variables
    private int tiempoTotal;
    //getter
    public int getTiempoTotal() {
        return tiempoTotal;
    }
    //metodo
    public void incluye(Titulo titulo){
        this.tiempoTotal += titulo.getDuracionEnMinutos();
    }

}
