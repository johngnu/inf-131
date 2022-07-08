package biblioteca;

public class ColaCircular {

    Biblioteca cbi[];
    int frente, fin;
    int max;

    public ColaCircular(int z) {
        frente = fin = 0;
        max = z;
        cbi = new Biblioteca[max];
    }

    public boolean esVacia() {
        if (frente == fin) {
            return true;
        } else {
            return false;
        }
    }

    public int nroElem() {
        return ((fin - frente + max) % max);
    }

    public boolean esLlena() {
        if (nroElem() == (max - 1)) {
            return true;
        } else {
            return false;
        }
    }

    public void adicionar(Biblioteca b) {
        if (!esLlena()) {
            fin = (fin + 1) % max;
            cbi[fin] = b;
        } else {
            System.out.println("COLA CIRCULAR LLENA");
        }
    }

    public Biblioteca eliminarCola() {
        Biblioteca x = new Biblioteca();
        if (esVacia()) {
            System.out.println("COLA VACIA");
        } else {
            frente = (frente + 1) % max;
            x = cbi[frente];
        }
        return x;
    }

    public void mostrarC() {
        for (int i = 0; i < nroElem(); i++) {
            Biblioteca b = eliminarCola();
            b.mostrarBiblioteca();
            adicionar(b);
        }
    }
}
