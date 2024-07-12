package com.reyeda.screenmatch.Principal;

import com.reyeda.screenmatch.modelos.Pelicula;
import com.reyeda.screenmatch.modelos.Serie;
import com.reyeda.screenmatch.modelos.Titulo;

import java.util.*;

public class PrincipalListas {
    public static void main(String[] args) {

        Pelicula miPelicula = new Pelicula("Avengers", 2010);
        miPelicula.evalua(9);
        Pelicula otraPeli = new Pelicula("Batman vs Superman", 2017);
        otraPeli.evalua(8);
        var peliculaRena = new Pelicula("Titanic", 1989);
        peliculaRena.evalua(9);

        Serie casaDragon = new Serie("Suits", 2010);

        Pelicula p1 = peliculaRena;

        //arrayList
        List<Titulo> lista = new LinkedList<>();
        lista.add(miPelicula);
        lista.add(otraPeli);
        lista.add(peliculaRena);
        lista.add(casaDragon);

        for (Titulo item : lista){
            System.out.println(item.getNombre());
            if (item instanceof Pelicula pelicula && pelicula.getClasificable() > 2){
                System.out.println(pelicula.getClasificable());
            }
        }
        //ordenar lista
        ArrayList<String> listaDeArtistas = new ArrayList<>();
        listaDeArtistas.add("Robert Downy Jr.");
        listaDeArtistas.add("Cris Evans");
        listaDeArtistas.add("Silvestrer Stalone");
        System.out.println(listaDeArtistas);

        Collections.sort(listaDeArtistas);
        System.out.println("Lista de Artistas ordenada: " + listaDeArtistas);

        Collections.sort(lista);
        System.out.println("Lista de titulo ordenado: " + lista);

        lista.sort(Comparator.comparing(Titulo::getFechaDeLanzamiento));
        System.out.println("Lista ordenada por fecha: " + lista);
    }
}
