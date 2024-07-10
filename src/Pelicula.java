public class Pelicula {
    //variables
    String nombre ;
    int fechaDeLanzamiento;
    int duracionEnMinutos;
    boolean inluidoPlan;
    double sumaEval;
    int totalEval;

    //funcionalidades
   void muestraFichaTecnica(){
       System.out.println("El nombre de la pelicula pelicula es: " + nombre);
       System.out.println("Se estreno en el año: " + fechaDeLanzamiento);
       System.out.println("dura: " + duracionEnMinutos + " min");
   }

   void evalua(double nota){
       sumaEval += nota;
       //se suman las evaluaciones dadas
       totalEval++;

   }

   double calculaMedia(){
       return sumaEval / totalEval;
   }
}
