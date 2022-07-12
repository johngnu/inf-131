package multiplepila;

import java.util.Scanner;

/**
 *
 * @author desktop
 */
public class MPilaL {

    public int max;
    PilaLibro mp[];
    int npilas;

    public MPilaL(int s) {
        max = s;
        mp = new PilaLibro[max];
        for (int i = 0; i < max; i++) {
            mp[i] = new PilaLibro(max);
        }
        npilas = 0;
    }

    public boolean esVacia(int i) {
        return (mp[i].esVacia());
    }

    public boolean esLlena(int i) {
        return (mp[i].esLlena());
    }

    public void adiMpila(Libro x, int i) {
        if (mp[i].esLlena()) {
            System.out.println("Pila posicion " + i + " esta llena");
        } else {
            mp[i].adiPila(x);
        }
    }

    public Libro eliMpila(int i) {
        Libro x = null;
        if (mp[i].esVacia()) {
            System.out.println("Pila posicoon " + i + " esta vacia");
        } else {
            x = mp[i].eliPila();
        }
        return x;
    }
    
    public void mostrarMP() {
        for (int i = 0; i < npilas; i++) {
            System.out.println("-------- Pila " + i + " ----------");
            mp[i].mostrarPila();
        }
    }
    
    public void llenarMP(int n) {
        npilas = n;
        Scanner lee = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            System.out.println("Ingrese tamano pila ");
            int x = lee.nextInt();
            mp[i].llenarPila(x);            
        }
    }
}
