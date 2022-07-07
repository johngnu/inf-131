package pilaprimos;

/**
 *
 * @author desktop
 */
public class Pila {

    int p[];
    int max, tope;

    public Pila(int m) {
        max = m;
        p = new int[max];
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

    public void adiPila(int x) {
        if (esLlena()) {
            System.out.println("Pila llena");
        } else {
            tope = tope + 1;
            p[tope] = x;
        }
    }

    public int eliPila() {
        int x = 0;
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
        int x;
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
            int x = paux.eliPila();
            adiPila(x);
        }
    }

}
