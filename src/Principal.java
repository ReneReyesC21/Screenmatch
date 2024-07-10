import com.reyeda.screenmatch.modelos.Pelicula;

public class Principal {
    //private es una restriccion que se puede usar para que otro usuario no pueda modificar un dato

    public static void main(String[] args) {
        Pelicula miPelicula = new Pelicula();
        miPelicula.setNombre("Avengers");
        miPelicula.setFechaDeLanzamiento(2010);
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









        //otro valor
//        com.reyeda.screenmatch.modelos.Pelicula otraPeli = new com.reyeda.screenmatch.modelos.Pelicula();
//        otraPeli.nombre = "Batman vs Superman";
//        otraPeli.fechaDeLanzamiento = 2024;
//        otraPeli.duracionEnMinutos = 90;
//llamada de metodo void
//        otraPeli.muestraFichaTecnica();
//        otraPeli.evalua(7);
//        otraPeli.evalua(9);
//
//        System.out.println(otraPeli.sumaEval);
    }
}
