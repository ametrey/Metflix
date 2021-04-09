import java.util.ArrayList;
import java.util.List;

public class Contenido {

    //CONSTRUCTOR

    public Contenido (String nombre){
        this.nombre = nombre;
    }
    public Contenido (String nombre, int añoLanzamiento){
        this(nombre);
        this.añoLanzamiento = añoLanzamiento;
        
    }


    protected String nombre;
    private Genero genero;
    //Idioma Origne
    private Idioma idiomaOrigen;
    private int añoLanzamiento;
    private List<Actor> actores = new ArrayList<>();

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Genero getGenero() {
        return this.genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public Idioma getIdiomaOrigen() {
        return this.idiomaOrigen;
    }

    public void setIdiomaOrigen(Idioma idiomaOrigen) {
        this.idiomaOrigen = idiomaOrigen;
    }

    public int getAñoLanzamiento() {
        return this.añoLanzamiento;
    }

    public void setAñoLanzamiento(int añoLanzamiento) {
        this.añoLanzamiento = añoLanzamiento;
    }

    public List<Actor> getActores() {
        return this.actores;
    }

    public void setActores(List<Actor> actores) {
        this.actores = actores;
    }
}
