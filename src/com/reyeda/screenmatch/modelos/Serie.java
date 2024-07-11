package com.reyeda.screenmatch.modelos;

public class Serie  extends Titulo{
    //variables
    int temporada;
    int episodioPorTemp;
    int minutisPorEp;

    public Serie(String nombre, int fechaDeLanzamiento) {
        super(nombre, fechaDeLanzamiento);
    }


    //metodos

    @Override
    public int getDuracionEnMinutos() {
        return temporada * episodioPorTemp * minutisPorEp;
    }

    //setter
    public void setTemporada(int temporada) {
        this.temporada = temporada;
    }

    public void setEpisodioPorTemp(int episodioPorTemp) {
        this.episodioPorTemp = episodioPorTemp;
    }

    public void setMinutisPorEp(int minutisPorEp) {
        this.minutisPorEp = minutisPorEp;
    }

    //getter
    public int getTemporada() {
        return temporada;
    }

    public int getEpisodioPorTemp() {
        return episodioPorTemp;
    }

    public int getMinutisPorEp() {
        return minutisPorEp;
    }

    @Override
    public String toString() {
        return "Serie:" + this.getNombre() + " (" + this.getFechaDeLanzamiento()+")";
    }
}
