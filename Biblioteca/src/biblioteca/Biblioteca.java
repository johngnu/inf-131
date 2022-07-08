package biblioteca;

/**
 *
 * @author desktop
 */
public class Biblioteca {

    private String carrera;
    private String zona;
    private String encargado;
    private int aniosServicio;
    private ColaEstante ce;

    public Biblioteca() {
    }

    public Biblioteca(String carrera, String zona, String encargado, int aniosServicio, ColaEstante ce) {
        this.carrera = carrera;
        this.zona = zona;
        this.encargado = encargado;
        this.aniosServicio = aniosServicio;
        this.ce = ce;
    }

    public void mostrarBiblioteca() {
        System.out.println("Carrera " + this.carrera + "" + this.zona + " " + this.encargado + " " + this.aniosServicio);
        //ce.mostrarColaSimple();
        
    }

    public ColaEstante getCe() {
        return ce;
    }

    public void setCe(ColaEstante ce) {
        this.ce = ce;
    }
    
    
}
