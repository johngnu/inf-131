package pilacadenas;

/**
 *
 * @author desktop
 */
public class Pila {

    String p[];
    int max, tope;

    public Pila(int m) {
        max = m;
        p = new String[max];
        tope = -1;
    }

    public boolean esVacia() {
        if (tope == -1) {
            return true;
        } else {
            return false;
        }
    }

    public boolean esLlena() {
        if (tope == (max - 1)) {
            return true;
        } else {
            return false;
        }
    }

    public void adiPila(String x) {
        if (esLlena()) {
            System.out.println("Pila llena");
        } else {
            tope = tope + 1;
            p[tope] = x;
        }
    }

    public String eliPila() {
        String x = "";
        if (esVacia()) {
            System.out.println("Pila vacia");
        } else {
            x = p[tope];
            tope = tope - 1;
        }
        return x;
    }

    public void mostrarPila() {
        Pila paux = new Pila(max);
        String x;
        while (!esVacia()) {
            x = eliPila();
            System.out.print(" " + x);
            paux.adiPila(x);
        }
        vaciarPila(paux);
        System.out.println();
    }

    public void vaciarPila(Pila paux) {
        while (!paux.esVacia()) {
            String x = paux.eliPila();
            adiPila(x);
        }
    }
}
