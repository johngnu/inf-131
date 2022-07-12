package hotel;

/**
 *
 * @author desktop
 */
public class ColaHuesped {
    
    private Huesped c[];
    int frente, max, fin;

    public ColaHuesped(int max) {
        this.max = max;
        frente = -1;
        fin = -1;
        c = new Huesped[max];
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

    public void adiCola(Huesped d) {
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

    public Huesped eliCola() {
        Huesped dato = null;
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
        ColaHuesped caux = new ColaHuesped(max);
        Huesped x;
        System.out.println("Los elementos de la cola son:");

        while (!esVacia()) {
            x = eliCola();
            x.mostrar();
            caux.adiCola(x);
        }
        vaciar(caux);
        System.out.println();
    }

    public void vaciar(ColaHuesped caux) {
        Huesped x;
        while (!caux.esVacia()) {
            x = caux.eliCola();
            adiCola(x);
        }
    }

}
