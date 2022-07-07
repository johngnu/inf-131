/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pilalibros;

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
        // e.mostrar();
        
        ColaEstante ce = new ColaEstante(1);
        ce.adiCola(e);        
        
        ce.mostrarColaSimple();
    }
    
}
