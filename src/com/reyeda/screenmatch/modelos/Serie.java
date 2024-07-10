package com.reyeda.screenmatch.modelos;

public class Serie  extends Titulo{
    //variables
    int temporada;
    int episodioPorTemp;
    int minutisPorEp;


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
}
