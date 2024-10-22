package com.vallejos.screenmatch.principal;

import com.vallejos.screenmatch.modelos.Pelicula;
import com.vallejos.screenmatch.modelos.Serie;
import com.vallejos.screenmatch.modelos.Titulo;

import java.util.*;

public class PrincipalConListas {
    public static void main(String[] args) {

        Pelicula miPelicula = new Pelicula("Encanto", 2021);
        miPelicula.evalua(10);
        Pelicula otraPelicula = new Pelicula("Avatar", 2023);
        otraPelicula.evalua(8);
        var peliculaDeBruno = new Pelicula("El señor de los anillos", 2001);
        peliculaDeBruno.evalua(9);
        Serie lost = new Serie("Lost", 2000);

        Pelicula p1 = peliculaDeBruno;


        List<Titulo> lista = new LinkedList<>();

        lista.add(miPelicula);
        lista.add(otraPelicula);
        lista.add(peliculaDeBruno);
        lista.add(lost);

        for (Titulo item : lista) {
            System.out.println(item.getNombre());
            if (item instanceof Pelicula pelicula && pelicula.getClasificacion() > 3 ) {
            System.out.println("Clasificación: " + pelicula.getClasificacion());
            }
        }

        ArrayList<String> listaDeArtistas = new ArrayList<>();
        listaDeArtistas.add("Jenifer López");
        listaDeArtistas.add("Ricardo Montaner");
        listaDeArtistas.add("Río Roma");

        Collections.sort(listaDeArtistas);
        System.out.println("Lista de artistas ordenada: " + listaDeArtistas);

        Collections.sort(lista);
        System.out.println("Lista de títulos ordenada: " + lista);

        lista.sort(Comparator.comparing(Titulo::getFechaDeLanzamiento));
        System.out.println("Lista ordenada por fecha: " + lista);



    }
}