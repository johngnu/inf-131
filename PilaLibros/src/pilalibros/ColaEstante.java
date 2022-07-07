package pilalibros;

/**
 *
 * @author desktop
 */
public class ColaEstante {

    private Estante c[];
    int frente, max, fin;

    public ColaEstante(int max) {
        this.max = max;
        frente = -1;
        fin = -1;
        c = new Estante[max];
    }

    public boolean esVacia() {
        if (frente == -1) {
            return true;
        } else {
            return false;
        }
    }

    public boolean esLlena() {
        if (frente == (max - 1)) {
            return true;
        } else {
            return false;
        }
    }

    public void adiCola(Estante d) {
        if (esLlena()) {
            System.out.println("Cola llena");
        } else {
            fin = fin + 1;
            c[fin] = d;
            if (fin == 0) {
                frente = 0;
            }
        }
    }

    public Estante eliCola() {
        Estante dato = null;
        if (esVacia()) {
            System.out.println("Cola vacia");
        } else {
            dato = c[frente];
            if (fin == frente) {
                frente = -1;
                fin = -1;
            } else {
                frente = frente + 1;
            }
        }
        return dato;
    }

    public int nroElementos() {
        return fin - frente + 1;
    }

    public void mostrarColaSimple() {
        ColaEstante caux = new ColaEstante(max);
        Estante x;
        System.out.println("Los elementos de la cola son:");

        while (!esVacia()) {
            x = eliCola();
            x.mostrar();
            caux.adiCola(x);
        }
        vaciar(caux);
        System.out.println();
    }

    public void vaciar(ColaEstante caux) {
        Estante x;
        while (!caux.esVacia()) {
            x = caux.eliCola();
            adiCola(x);
        }
    }

}
