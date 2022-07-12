package multiplepila;

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
        Libro li1 = new Libro("Programacion", "Joyanes", "sn", 500, 2000, "Programacion");
        Libro li2 = new Libro("Algebra", "A. Rojo", "sn", 200, 1999, "Matematicas");
        Libro li3 = new Libro("Estructura de Datos", "Joyanes", "sn", 500, 2000, "Programacion");
        Libro li4 = new Libro("Calculo", "Chungara", "sn", 500, 1980, "Matematicas");
        Libro li5 = new Libro("Calculo II", "Chungara", "sn", 520, 1990, "Matematicas");
        
        /*PilaLibro pl = new PilaLibro(4);
        pl.adiPila(li1);
        pl.adiPila(li2);
        pl.adiPila(li3);
        pl.adiPila(li4);
        //System.out.println("Mostrarndo la pila de libros");
        //System.out.println("****************************");
        pl.mostrarPila();*/
        
        MPilaL MP = new MPilaL(3);
        MP.npilas=3;
        MP.adiMpila(li1, 0);
        MP.adiMpila(li2, 0);
        MP.adiMpila(li3, 1);
        MP.adiMpila(li4, 2);
        MP.adiMpila(li5, 2);
        MP.mostrarMP();
        
        //mostrarAutor(MP, "Joyanes");        
    }

    private static void mostrarAutor(MPilaL MP, String joyanes) {
        for (int i = 0; i < MP.npilas; i++) {
            System.out.println("-------- Pila " + i + " ----------");
            
        }
    }


    
}
