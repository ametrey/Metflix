import java.util.ArrayList;
import java.util.List;

public class Temporada {

    //CONSTRUCTOR

    public Temporada(int numero){
        this.numero = numero;
    }
    
    private int numero;
    private String nombre; 
    private List<Episodio> episodios = new ArrayList<>();

    public int getNumero() {
        return this.numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Episodio> getEpisodios() {
        return this.episodios;
    }

    public void setEpisodios(List<Episodio> episodios) {
        this.episodios = episodios;
    }

    public Episodio buscarEpisodio(int numeroEpisodio) {
        for (Episodio episodio : this.episodios) {
            if (episodio.getNumero() == numeroEpisodio)
                return episodio;
        }
        return null;
    }
}
