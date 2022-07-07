package pilacadenas;

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
        p.adiPila("info");
        p.adiPila("oro");
        p.adiPila("estructura");
        p.adiPila("datos");
        p.adiPila("oso");
        System.out.println("Mostrar datos de la pila:");
        p.mostrarPila();
        System.out.println("Mostrar palindromos:");
        mostrarPalindromos(p);
    }

    public static void mostrarPalindromos(Pila B) {
        Pila paux = new Pila(B.max);
        String x;
        while (!B.esVacia()) {
            x = B.eliPila();
            if (esPalindromo(x)) {
                System.out.print(" " + x);
            }
            paux.adiPila(x);
        }
        B.vaciarPila(paux);
        System.out.println();
    }

    public static boolean esPalindromo(String s) {
        String inv = "";
        for (int i = 0; i < s.length(); i++) {
            inv = s.charAt(i) + inv;
        }
        if (inv.equals(s)) {
            return true;
        } else {
            return false;
        }
    }

}
