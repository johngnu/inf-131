package hotel;

/**
 *
 * @author desktop
 */
public class Huesped {

    private String carnet;
    private String nombre;
    private int cantidadDias;
    private PilaConsumo pc;
    private Habitacion habitacion;

    public Huesped(String carnet, String nombre, int cantidadDias) {
        this.carnet = carnet;
        this.nombre = nombre;
        this.cantidadDias = cantidadDias;
        pc = new PilaConsumo(10);
    }

    public String getCarnet() {
        return carnet;
    }

    public void setCarnet(String carnet) {
        this.carnet = carnet;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidadDias() {
        return cantidadDias;
    }

    public void setCantidadDias(int cantidadDias) {
        this.cantidadDias = cantidadDias;
    }

}
