import java.util.*;

public class App {

    public static Scanner Teclado = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
  

        Metflix miMetflix = new Metflix();

        System.out.println("Inicializando catalogo de Metflix");

        miMetflix.inicializarCatalogo();//Estoy llamando al metodo que crea las pelis y series.

        Serie serieBuscada = miMetflix.buscarSerie("How I met your mother");

        if (serieBuscada == null) {
            System.out.println("No se encontro la serie");
            return;
        }
        System.out.println("Ingrese nro temporada: ");

        int nroTemporada = Teclado.nextInt();
        Teclado.nextLine();

        Temporada temporada = serieBuscada.buscarTemporada(nroTemporada);

        System.out.println("Ingrese nro episodio: ");
        int nroEpisodio = Teclado.nextInt();
        Teclado.nextLine();

        Episodio episodio = temporada.buscarEpisodio(nroEpisodio);

        episodio.reproducir();

        if (episodio instanceof Websodio) {
            System.out.println("El episodio era un websodio");
        } else {
            System.out.println("Es un episodio");
        }

        //Ahora quiero que si es un Websodio, imprima el Link del websodio.
        if (episodio instanceof Websodio) {
            //Castear: es el proceso donde "desenmascaramos" a una variable.
            Websodio websodio = (Websodio) episodio;
            System.out.println("El link del websodio es: " + websodio.getLink());
        }

    }
}
