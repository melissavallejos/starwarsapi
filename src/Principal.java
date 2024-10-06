import com.vallejos.screenmatch.calculos.CalculadoraDeTiempo;
import com.vallejos.screenmatch.calculos.FiltroRecomendacion;
import com.vallejos.screenmatch.modelos.Episodio;
import com.vallejos.screenmatch.modelos.Pelicula;
import com.vallejos.screenmatch.modelos.Serie;

public class Principal {
    public static void main(String[] args) {
        Pelicula miPelicula = new Pelicula();
        miPelicula.setNombre("Encanto");
        miPelicula.setFechaDeLanzamiento(2021);
        miPelicula.setDuracionEnMinutos(120);
        miPelicula.setIncluidoEnElPlan(true);

        miPelicula.muestraFichaTecnica();
        miPelicula.evalua(8.5);
        miPelicula.evalua(9.3);
        miPelicula.evalua(9.8);

        System.out.println(miPelicula.getTotalDeLasEvaluaciones());
        System.out.println("Media de evaluaciones de la película: " + miPelicula.calculaMedia());

        Serie casaDragon = new Serie();
        casaDragon.setNombre("La casa del dragón");
        casaDragon.setFechaDeLanzamiento(2022);
        casaDragon.setTemporadas(1);
        casaDragon.setMinutosPorEpisodio(50);
        casaDragon.setEpisodiosPorTemporada(10);
        casaDragon.muestraFichaTecnica();
        System.out.println(casaDragon.getDuracionEnMinutos());


        Pelicula otraPelicula = new Pelicula();
        otraPelicula.setNombre("Titanic");
        otraPelicula.setFechaDeLanzamiento(2000); ;
        otraPelicula.setDuracionEnMinutos(190);


        CalculadoraDeTiempo calculadora = new CalculadoraDeTiempo();
        calculadora.incluye(miPelicula);
        calculadora.incluye(casaDragon);
        calculadora.incluye(otraPelicula);
        System.out.println("Tiempo necesario para ver tus títulos favoritos estas vacaciones: " + calculadora.getTiempoTotal() + " minutos");

        FiltroRecomendacion filtroRecomendacion = new FiltroRecomendacion();
        filtroRecomendacion.filtra(miPelicula);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setNombre("La casa Targaryen");
        episodio.setSerie(casaDragon);
        episodio.setTotalVisualizaciones(90);

        filtroRecomendacion.filtra(episodio);






    }
}
