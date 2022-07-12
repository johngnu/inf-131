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
        
                
        // Registras huespedes;
        Huesped h1 = new Huesped("123456", "Juan Perez", 8);
        Huesped h2 = new Huesped("334455", "Helen Carolina", 4);
        Huesped h3 = new Huesped("110022", "Dempy Morales", 2);
        Huesped h4 = new Huesped("445555", "Roberto Gomez", 1);
        
        
        
    }
    
}
