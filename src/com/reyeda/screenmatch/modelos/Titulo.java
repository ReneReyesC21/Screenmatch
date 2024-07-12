package com.reyeda.screenmatch.modelos;

import com.google.gson.annotations.SerializedName;

public class Titulo implements Comparable<Titulo>{
    //anotaciones
    //private modificador de variables
    //variables
    @SerializedName("Title")
    private String nombre ;
    @SerializedName("Year")
    private int fechaDeLanzamiento;
    @SerializedName("RunTime")
    private int duracionEnMinutos;
    private boolean inluidoPlan;
    private double sumaEval;
    private int totalEval;

    //constructor
    public Titulo(String nombre, int fechaDeLanzamiento) {
        this.nombre = nombre;
        this.fechaDeLanzamiento = fechaDeLanzamiento;
    }

    public Titulo(TituloOmdb miTituloOmdb) {
        this.nombre = miTituloOmdb.title();
        this.fechaDeLanzamiento = Integer.valueOf(miTituloOmdb.year());
        this.duracionEnMinutos = Integer.valueOf(miTituloOmdb.runtime().substring(0,5));
    }

    // setter's
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setFechaDeLanzamiento(int fechaDeLanzamiento) {
        this.fechaDeLanzamiento = fechaDeLanzamiento;
    }

    public void setDuracionEnMinutos(int duracionEnMinutos) {
        this.duracionEnMinutos = duracionEnMinutos;
    }

    public void setInluidoPlan(boolean inluidoPlan) {
        this.inluidoPlan = inluidoPlan;
    }
//getter's

    public String getNombre() {
        return nombre;
    }

    public int getFechaDeLanzamiento() {
        return fechaDeLanzamiento;
    }

    public int getDuracionEnMinutos() {
        return duracionEnMinutos;
    }

    public boolean isInluidoPlan() {
        return inluidoPlan;
    }

    public int getTotalEval(){
        return totalEval;
    }
    //metodo void
    public void muestraFichaTecnica(){
        System.out.println("El nombre del titulo es: " + nombre);
        System.out.println("Se estreno en el año: " + fechaDeLanzamiento);
        System.out.println("dura: " + getDuracionEnMinutos() + " min");
    }
    public void evalua(double nota){
        sumaEval += nota;
        //se suman las evaluaciones dadas
        totalEval++;
    }
    //metodo double
    public double calculaMedia(){
        return sumaEval / totalEval;
    }

    @Override
    public int compareTo(Titulo otroTit) {
        return this.getNombre().compareTo(otroTit.getNombre());
    }

    @Override
    public String toString() {
        return "nombre='" + nombre + '\'' +
                ", fechaDeLanzamiento=" + fechaDeLanzamiento +
                ", duracion = " + duracionEnMinutos;
    }


}
