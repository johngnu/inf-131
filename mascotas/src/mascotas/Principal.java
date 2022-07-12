package mascotas;

/**
 *
 * @author desktop
 */
public class Principal {

    public static void main(String[] args) {
        
        Mascota m1 = new Mascota("yango", "bettoben", 3, "SI");
        Mascota m2 = new Mascota("hachi", "beagle", 4, "NO");
        Mascota m3 = new Mascota("negro", "chachuchin", 1, "NO");
        Mascota m4 = new Mascota("pelusa", "gran danes", 9, "SI");
        Mascota m5 = new Mascota("stuart", "pitbull", 2, "NO");
        Mascota m6 = new Mascota("negro", "bettoben", 1, "NO");
        Mascota m7 = new Mascota("blanca", "beagle", 2, "NO");
        Mascota m8 = new Mascota("mechon", "gato", 1, "NO");
        Mascota m9 = new Mascota("rocky", "pitbull", 3, "NO");
        Mascota m10 = new Mascota("joter", "beagle", 6, "SI");

        CCircularM M1 = new CCircularM(10);
        M1.adicionar(m1);
        M1.adicionar(m2);
        M1.adicionar(m3);
        M1.adicionar(m4);
        M1.adicionar(m5);
        M1.adicionar(m6);
        M1.adicionar(m7);
        M1.adicionar(m8);
        M1.adicionar(m9);
        M1.adicionar(m10);
        M1.mostrar();
        System.out.println("*********** EJERCICIO 1 ***********");
        Ejercicio1(M1);
        M1.mostrar();
        System.out.println("*********** EJERCICIO 2 ***********");
        Ejercicio2(M1);
        M1.mostrar();
        System.out.println("*********** EJERCICIO 3 ***********");
        Ejercicio3(M1);
        M1.mostrar();
    }

    private static void Ejercicio3(CCircularM m1) {
        // TODO Auto-generated method stub
        CCircularM aux = new CCircularM(m1.max);
        CCircularM ultimo = new CCircularM(m1.max);
        while (!m1.esvacia()) {
            Mascota elem = m1.eliminar();
            if (elem.getEdad() == 1) {
                ultimo.adicionar(elem);
            } else {
                aux.adicionar(elem);
            }
        }
        m1.vaciar(aux);
        m1.vaciar(ultimo);
    }

    private static void Ejercicio2(CCircularM m1) {
        // TODO Auto-generated method stub
        CCircularM aux = new CCircularM(m1.max);
        while (!m1.esvacia()) {
            Mascota elem = m1.eliminar();
            if (!elem.getRaza().equals("beagle")) {
                aux.adicionar(elem);
            }
        }
        m1.vaciar(aux);
    }

    public static void Ejercicio1(CCircularM m1) {
        CCircularM aux = new CCircularM(m1.max);
        CCircularM incapacidad = new CCircularM(m1.max);
        while (!m1.esvacia()) {
            Mascota elem = m1.eliminar();
            if (elem.getIncapacidad().equals("SI")) {
                incapacidad.adicionar(elem);
            } else {
                aux.adicionar(elem);
            }
        }
        m1.vaciar(incapacidad);
        m1.vaciar(aux);
    }

}
