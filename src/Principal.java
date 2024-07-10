import com.reyeda.screenmatch.calculos.CalculadoraTiempo;
import com.reyeda.screenmatch.modelos.Pelicula;
import com.reyeda.screenmatch.modelos.Serie;

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

        Serie casaDragon = new Serie();
        casaDragon.setNombre("Suits");
        casaDragon.setFechaDeLanzamiento(2010);
        casaDragon.setTemporada(7);
        casaDragon.setMinutisPorEp(50);
        casaDragon.setEpisodioPorTemp(12);
        casaDragon.muestraFichaTecnica();
        System.out.println(casaDragon.getDuracionEnMinutos());

        Pelicula otraPeli = new Pelicula();
        otraPeli.setNombre("Batman vs Superman");
        otraPeli.setFechaDeLanzamiento(2017);
        otraPeli.setDuracionEnMinutos(90);

        CalculadoraTiempo calculadora = new CalculadoraTiempo();
        calculadora.incluye(miPelicula);
        calculadora.incluye(casaDragon);
        calculadora.incluye(otraPeli);
        System.out.println("Tiempo necesario para ver tus titulos favoritos son: " + calculadora.getTiempoTotal() + " min");

    }
}
