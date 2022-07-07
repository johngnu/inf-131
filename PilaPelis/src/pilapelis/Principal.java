package pilapelis;

/**
 *
 * @author desktop
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Pila p = new Pila(5);
        p.adiPila(new Pelicula());
        p.adiPila(new Pelicula());
        p.adiPila(new Pelicula());
        p.adiPila(new Pelicula());
        p.adiPila(new Pelicula());
        System.out.println("Mostrar datos de la pila:");
        p.mostrarPila();
    }
    
}
