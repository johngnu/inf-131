package mascotas;

/**
 *
 * @author desktop
 */
public class CCircularM {

    int max;
    private Mascota v[];
    private int ini, fin;

    CCircularM(int z) {
        ini = fin = 0;
        max = z;
        v = new Mascota[max + 1];
    }

    boolean esvacia() {
        if (ini == 0 && fin == 0) {
            return (true);
        }
        return (false);
    }

    boolean esllena() {
        if (fin == max) {
            return (true);
        }
        return (false);
    }

    int nroelem() {
        return (fin - ini);
    }

    void adicionar(Mascota x) {
        if (esllena()) {
            System.out.println("Cola Circular llena...!!!");
        } else {
            fin++;
            v[fin] = x;
        }
    }

    Mascota eliminar() {
        Mascota elem = null;
        if (esvacia()) {
            System.out.println("Cola Simple vacia");
        } else {
            ini++;
            elem = v[ini];
            if (ini == fin) {
                ini = fin = 0;
            }
        }
        return (elem);
    }

    void mostrar() {
        //String elem;
        if (esvacia()) {
            System.out.println("Cola vacia");
        } else {
            System.out.println("\n Cola Mascotas \n");
            CCircularM aux = new CCircularM(max);
            while (!esvacia()) {
                Mascota elem = eliminar();
                aux.adicionar(elem);
                elem.mostrar();
            }
            vaciar(aux);
        }
    }

    void vaciar(CCircularM a) {
        while (!a.esvacia()) {
            adicionar(a.eliminar());
        }
    }
}
