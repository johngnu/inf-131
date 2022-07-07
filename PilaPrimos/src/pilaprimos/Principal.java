package pilaprimos;

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
        p.adiPila(4);
        p.adiPila(7);
        p.adiPila(10);
        p.adiPila(13);
        p.adiPila(21);
        System.out.println("Mostrar datos de la pila:");
        p.mostrarPila();
        
        
        //System.out.println("Mostrar primos de la pila:");
        //mostrarPrimos(p);
    }

    public static void mostrarPrimos(Pila A) {
        Pila paux = new Pila(A.max);
        int x;
        while (!A.esVacia()) {
            x = A.eliPila();
            if (esPrimo(x)) {
                System.out.print(" " + x);
            }
            paux.adiPila(x);
        }
        A.vaciarPila(paux);
        System.out.println();
    }

    public static boolean esPrimo(int x) {
        int cd = 0;
        for (int i = 1; i <= x; i++) {
            if (x % i == 0) {
                cd = cd + 1;
            }
        }
        if (cd == 2) {
            return true;
        } else {
            return false;
        }
    }

}
