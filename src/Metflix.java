import java.util.ArrayList;
import java.util.List;

public class Metflix {

    public List<Pelicula> peliculas = new ArrayList<>();
    public List<Serie> series = new ArrayList<>();

    //Metodo que inicializa el catalogo cno las pelis/series qeu querramos
    public void inicializarCatalogo() {

        
        Pelicula titanic = new Pelicula("Titanic", 1997, 210); //Estas ultimoas 2 lineas: Pelicula titanic = new Pelicula();

        Actor actor = new Actor("Leo DiCaprio");
     
        titanic.getActores().add(actor);

        this.peliculas.add(titanic);

      

        Pelicula batman = new Pelicula("Batman: el caballero de la nohe", 2008, 152);
      
        actor = new Actor("Christian Bale"); //Creo un nuevo actor, pero referenciado con la variable actor
      
        batman.getActores().add(actor);

        this.peliculas.add(batman);

        

        Pelicula elResplandor = new Pelicula("El Resplandor");
       
        elResplandor.setDirector(new Director("Stanley Kubrick"));
       


        Serie howIMetYM = new Serie("How I met your mother", 2005);


        actor = new Actor("Neil Patrick Harris");
  

        howIMetYM.getActores().add(actor);

        actor = new Actor("Cobie Smulders");
      

        howIMetYM.getActores().add(actor);



        Temporada temporada = new Temporada(5);
    

        Episodio episodio = new Episodio(11, "The last cigarrette");
        episodio.setDuracion(43);

  
        temporada.getEpisodios().add(episodio);

        episodio = new Episodio(1, "Definitions", 41);

        temporada.getEpisodios().add(episodio);

        Websodio ws = new Websodio(35, "Nombre wesodio en internet", "http://miepisodios.com/websodio.avi");
      
        ws.setDuracion(42);
      

        temporada.getEpisodios().add(ws);

        howIMetYM.getTemporadas().add(temporada);


        temporada = new Temporada(3);
        


        episodio = new Episodio(1, "Wait for it", 40);



        temporada.getEpisodios().add(episodio);

        episodio = new Episodio(4, "Little Boys");

        episodio.setDuracion(44);

        temporada.getEpisodios().add(episodio);


        howIMetYM.getTemporadas().add(temporada);


        this.series.add(howIMetYM);

        Serie bbt = new Serie("The BigBang Theory", 2007);


        actor = new Actor("Kaley Cuoco");


        bbt.getActores().add(actor);


        temporada = new Temporada(1);
  


        episodio = new Episodio(1, "Pilot", 41);



        temporada.getEpisodios().add(episodio);

        episodio = new Episodio(13, "The Cooper-Hofstadter Polarization");


        temporada.getEpisodios().add(episodio);

        bbt.getTemporadas().add(temporada);

        this.series.add(bbt);

    }


    public Serie buscarSerie(String nombreABuscar) {

        // series = | serie1 | serie2 | serie25 | serie40 |
        //vamos a usar el foreach: que sirve para recorrer listas
        //este ciclo, tiene una variable, qeu apunta en cada vuelta
        //a cada elemento de la lista
        //o sea la primer vez, va a apuntar a serie1, despues a serie2 ddesp
        //serie25 hasta que termina.
        for (Serie serie : this.series) {
            //pregunto si el nombre de la serie actual
            //que estoy recorriendo es la que necesito
            if (serie.getNombre().equals(nombreABuscar))
                return serie; //devuelvo esta serie.
        }
        //si llego hasta aca, es porque no encontro la serie.
        return null;

    }

    public Serie buscarSerieV2(String nombreABuscar) {
        Serie serieBuscada = null;
        //En este caso se recorre TODO(aunque haya 1000 series)
        //y al final se devuelve si encontr una serie.
        //en el caso anterior, se devuelve una vez encontrada.
        //ej si hay 1000 series pero esta en la posicion 3, hace 3 vueltas
        for (Serie serie : this.series) {
            if (serie.getNombre().equals(nombreABuscar))
                serieBuscada = serie;
        }
        return serieBuscada;
        /*if (serieBuscada == null)
            return null;
        else
            return serieBuscada;*/

    }

    //buscar un director
    //
}
