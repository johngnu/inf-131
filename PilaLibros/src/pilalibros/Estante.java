package pilalibros;

/**
 *
 * @author desktop
 */
public class Estante {
    int nro;
    String nombre;
    PilaLibro pilaLibro;

    public Estante(int nro, String nombre, PilaLibro pilaLibro) {
        this.nro = nro;
        this.nombre = nombre;
        this.pilaLibro = pilaLibro;
    }

    public int getNro() {
        return nro;
    }

    public void setNro(int nro) {
        this.nro = nro;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void mostrar() {
        System.out.println("Estante: " + nombre);
        System.out.println("Nro: " + nro);
        System.out.println("Lista de libros");
        System.out.println("***************");
        pilaLibro.mostrarPila();
    }

    public PilaLibro getPilaLibro() {
        return pilaLibro;
    }

    public void setPilaLibro(PilaLibro pilaLibro) {
        this.pilaLibro = pilaLibro;
    }
        
}
