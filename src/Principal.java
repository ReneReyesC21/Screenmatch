public class Principal {

    public static void main(String[] args) {
        Pelicula miPelicula = new Pelicula();
        miPelicula.nombre = "Avengers";
        miPelicula.fechaDeLanzamiento = 2010;
        miPelicula.duracionEnMinutos = 90;
//llamada de metodo void
        miPelicula.muestraFichaTecnica();
        miPelicula.evalua(8);
        miPelicula.evalua(10);

        System.out.println(miPelicula.sumaEval);
        System.out.println(miPelicula.totalEval);
        System.out.println(miPelicula.calculaMedia());

        Pelicula otraPeli = new Pelicula();
        otraPeli.nombre = "Batman vs Superman";
        otraPeli.fechaDeLanzamiento = 2024;
        otraPeli.duracionEnMinutos = 90;
//llamada de metodo void
//        otraPeli.muestraFichaTecnica();
//        otraPeli.evalua(7);
//        otraPeli.evalua(9);
//
//        System.out.println(otraPeli.sumaEval);
    }
}
