package biblioteca;

/**
 *
 * @author desktop
 */
public class PilaLibro {

    Libro p[];
    int max, tope;

    public PilaLibro(int m) {
        max = m;
        p = new Libro[max];
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

    public void adiPila(Libro x) {
        if (esLlena()) {
            System.out.println("Pila llena");
        } else {
            tope = tope + 1;
            p[tope] = x;
        }
    }

    public Libro eliPila() {
        Libro x = null;
        if (esVacia()) {
            System.out.println("Pila vacia");
        } else {
            x = p[tope];
            tope = tope - 1;
        }
        return x;
    }

    public void mostrarPila() {
        PilaLibro paux = new PilaLibro(max);
        Libro x;
        while (!esVacia()) {
            x = eliPila();
            x.mostrarLibro();
            paux.adiPila(x);
        }
        vaciarPila(paux);
        System.out.println();
    }

    public void vaciarPila(PilaLibro paux) {
        while (!paux.esVacia()) {
            Libro x = paux.eliPila();
            adiPila(x);
        }
    }
}
