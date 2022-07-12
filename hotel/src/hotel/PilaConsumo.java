package hotel;

/**
 *
 * @author desktop
 */
public class PilaConsumo {

    Consumo p[];
    int max, tope;

    public PilaConsumo(int m) {
        max = m;
        p = new Consumo[max];
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

    public void adiPila(Consumo x) {
        if (esLlena()) {
            System.out.println("Pila llena");
        } else {
            tope = tope + 1;
            p[tope] = x;
        }
    }

    public Consumo eliPila() {
        Consumo x = null;
        if (esVacia()) {
            System.out.println("Pila vacia");
        } else {
            x = p[tope];
            tope = tope - 1;
        }
        return x;
    }

    public void mostrarPila() {
        PilaConsumo paux = new PilaConsumo(max);
        Consumo x;
        while (!esVacia()) {
            x = eliPila();
            x.mostrar();
            paux.adiPila(x);
        }
        vaciarPila(paux);
        System.out.println();
    }

    public void vaciarPila(PilaConsumo paux) {
        while (!paux.esVacia()) {
            Consumo x = paux.eliPila();
            adiPila(x);
        }
    }
}
