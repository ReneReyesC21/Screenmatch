package com.reyeda.screenmatch.Principal;

import com.reyeda.screenmatch.calculos.CalculadoraTiempo;
import com.reyeda.screenmatch.calculos.FiltroRec;
import com.reyeda.screenmatch.modelos.Episodio;
import com.reyeda.screenmatch.modelos.Pelicula;
import com.reyeda.screenmatch.modelos.Serie;

import java.util.ArrayList;

public class Principal {
    //private es una restriccion que se puede usar para que otro usuario no pueda modificar un dato

    public static void main(String[] args) {
        Pelicula miPelicula = new Pelicula("Avengers", 2010);
        miPelicula.setDuracionEnMinutos(90);
        miPelicula.setInluidoPlan(true);
        //llamada de metodo void
        miPelicula.muestraFichaTecnica();
        miPelicula.evalua(8);
        miPelicula.evalua(10);
        miPelicula.evalua(7.5);
        //print
        System.out.println(miPelicula.getTotalEval());
        System.out.println(miPelicula.calculaMedia());

        Serie casaDragon = new Serie("Suits", 2010);
        casaDragon.setTemporada(7);
        casaDragon.setMinutisPorEp(50);
        casaDragon.setEpisodioPorTemp(12);
        casaDragon.muestraFichaTecnica();
        System.out.println(casaDragon.getDuracionEnMinutos());

        Pelicula otraPeli = new Pelicula("Batman vs Superman", 2017);
        otraPeli.setDuracionEnMinutos(90);

        //calculadora para poder saber el tiempo que necesitamos
        CalculadoraTiempo calculadora = new CalculadoraTiempo();
        calculadora.incluye(miPelicula);
        calculadora.incluye(casaDragon);
        calculadora.incluye(otraPeli);
        System.out.println("Tiempo necesario para ver tus titulos favoritos son: " + calculadora.getTiempoTotal() + " min");

        //filtrado
        FiltroRec filtroRec = new FiltroRec();
        filtroRec.filtrar(miPelicula);

        Episodio episodio = new Episodio();
        episodio.setNumeroEp(1);
        episodio.setNombre("Piloto");
        episodio.setSerie(casaDragon);
        episodio.setTotalvil(2);
        filtroRec.filtrar(episodio);

        //var para mostrar mejor el programa
        var peliculaRena = new Pelicula("Titanic", 1989);
        peliculaRena.setDuracionEnMinutos(120);

        //arrayList
        ArrayList<Pelicula> listaDePeliculas = new ArrayList<>();
        listaDePeliculas.add(peliculaRena);
        listaDePeliculas.add(miPelicula);
        listaDePeliculas.add(otraPeli);

        System.out.println("Tamaño de lista: " + listaDePeliculas.size());
        System.out.println("La primera pelicula es: " + listaDePeliculas.get(0).getNombre());
        System.out.println(listaDePeliculas.toString());
        System.out.println("toString de la paelicula: " + listaDePeliculas.get(0).toString());
    }
}
