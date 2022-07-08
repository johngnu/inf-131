package biblioteca;

/**
 *
 * @author desktop
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // creando libros
        Libro li1 = new Libro("Programacion", "Joyanes", "sn", 500, 2000, "Programacion");
        Libro li2 = new Libro("Algebra", "A. Rojo", "sn", 200, 1999, "Matematicas");
        Libro li3 = new Libro("Estructura de Datos", "Joyanes", "sn", 500, 2000, "Programacion");
        Libro li4 = new Libro("Calculo", "Chungara", "sn", 500, 1980, "Matematicas");

        PilaLibro pl = new PilaLibro(4);
        pl.adiPila(li1);
        pl.adiPila(li2);
        pl.adiPila(li3);
        pl.adiPila(li4);
        //System.out.println("Mostrarndo la pila de libros");
        //System.out.println("****************************");
        //pl.mostrarPila();
        //System.out.println(".... fin ....");

        Estante e = new Estante(10, "Libros de informatica", pl);
        //e.mostrar();

        //e.getPilaLibro().mostrarPila();
        ColaEstante ce = new ColaEstante(1);
        ce.adiCola(e);
        //ce.mostrarColaSimple();

        // biblioteca
        System.out.println("Crear y mostrar Biblioteca");
        Biblioteca b1 = new Biblioteca("Informatica", "Centro La paz", "Juan perexz", 10, ce);
        //b1.mostrarBiblioteca();

        mostrarAutores(b1);
    }

    public static void mostrarAutores(Biblioteca b) {
        ColaEstante caux = b.getCe();
        Estante x;
        System.out.println("Los elementos de la cola son:");

        while (!caux.esVacia()) {
            x = caux.eliCola();
            PilaLibro paux = x.getPilaLibro();
            //paux.mostrarPila();
            Libro l1;
            while (!paux.esVacia()) {
                l1 = paux.eliPila();
                System.out.println("--> " + l1.getAutor());
                //paux.adiPila(l1);
            }
            //paux.vaciarPila(paux);*/
        }

        caux.vaciar(caux);
        System.out.println();
    }
}
