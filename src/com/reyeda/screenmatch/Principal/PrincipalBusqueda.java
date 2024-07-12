package com.reyeda.screenmatch.Principal;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.reyeda.screenmatch.modelos.Titulo;
import com.reyeda.screenmatch.modelos.TituloOmdb;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class PrincipalBusqueda {
    public static void main(String[] args) throws IOException, InterruptedException {
//conexion de api
        Scanner lectura = new Scanner(System.in);
        System.out.println("Escriba la pelicula que quieres buscar: ");
        var busqueda = lectura.nextLine();

        String dir = "http://www.omdbapi.com/?t=" + busqueda + "&apikey=6191b46";

        try{
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(dir))
                    .build();

            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());

            String json = response.body();
            System.out.println(json);

            Gson gson = new GsonBuilder().setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE).create();;
            TituloOmdb miTituloOmdb =gson.fromJson(json, TituloOmdb.class);
            System.out.println(miTituloOmdb);

            Titulo mititulo = new Titulo(miTituloOmdb);
            System.out.println("Titulo ya convertido: " + mititulo);
        }catch (NumberFormatException e){
            System.out.println("Ocurrio un error: ");
            System.out.println(e.getMessage());
        }catch (IllegalArgumentException e){
            System.out.println("Error en l URI verifique la direccion");
        }
        System.out.println("Finalizo la ejecucion del programa");
    }
}
