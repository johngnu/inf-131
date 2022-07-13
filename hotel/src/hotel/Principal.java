package hotel;

/**
 *
 * @author desktop
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Crear habitaciones (nro, piso, camas, precio)
        Habitacion hb1 = new Habitacion(1, 1, 1, 100);
        Habitacion hb2 = new Habitacion(2, 1, 2, 200);
        Habitacion hb3 = new Habitacion(3, 1, 1, 100);
        Habitacion hb4 = new Habitacion(4, 1, 3, 300);
                
        // Productos
        Consumo c1 = new Consumo("Coca cola", 3);
        Consumo c2 = new Consumo("Galletas", 1);
        Consumo c3 = new Consumo("Papitas fritas", 10);

        // Registras huespedes;
        Huesped h1 = new Huesped("123456", "Juan Perez", 8);
        Huesped h2 = new Huesped("334455", "Helen Carolina", 4);
        Huesped h3 = new Huesped("110022", "Dempy Morales", 2);
        //Huesped h4 = new Huesped("445555", "Roberto Gomez", 1);

        ColaHuesped ch = new ColaHuesped(3);
        ch.adiCola(h1);
        ch.adiCola(h2);
        ch.adiCola(h3);

        // asignacion de habitaciones
        h1.setHabitacion(hb1);
        h2.setHabitacion(hb3);

        //h1.mostrar();        
        //h3.mostrar();        
        h1.agregarConsumo(c3);
        h1.agregarConsumo(c1);
        //h1.mostrar();

        ch.mostrarColaSimple();

        // mostrar huesped con CI
        System.out.println("a) Buscar y mostrra & Calcular Deuda\n");
        mostrarCliente(ch, "123456");
        
    }

    public static void mostrarCliente(ColaHuesped ch, String ci) {
        ColaHuesped caux = new ColaHuesped(ch.max);
        Huesped x;
        System.out.println(" * Huesped con carnet: " + ci);

        while (!ch.esVacia()) {
            x = ch.eliCola();
            if (x.getCarnet().equals(ci)) {
                x.mostrar();
                mostrarDeuda(x);
            }
            caux.adiCola(x);
        }

        ch.vaciar(caux);
        System.out.println();
    }

    public static void mostrarDeuda(Huesped h) {
        // costo habitacion (nrodias * precio habitacion)
        System.out.println("---- Costo habitacion total (dias*precioHabi): " + (h.getHabitacion().getPrecioDia() * h.getCantidadDias()));
        int tc = 0; // total consumo
        if (!h.getPc().esVacia()) {
            PilaConsumo paux = new PilaConsumo(h.getPc().max);
            Consumo x;
            while (!h.getPc().esVacia()) {
                x = h.getPc().eliPila();
                //x.mostrar();
                tc = tc + x.getPrecio();
                paux.adiPila(x);
            }
            h.getPc().vaciarPila(paux);
        }
        System.out.println("---- Costo consumo total: " + tc);
    }

}
