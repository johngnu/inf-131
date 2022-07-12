package hotel;

/**
 *
 * @author desktop
 */
public class Habitacion {

    private int nroHabitacion;
    private int piso;
    private int nroCamas;
    private int precioDia;

    public Habitacion(int nroHabitacion, int piso, int nroCamas, int precioDia) {
        this.nroHabitacion = nroHabitacion;
        this.piso = piso;
        this.nroCamas = nroCamas;
        this.precioDia = precioDia;
    }

    public int getNroHabitacion() {
        return nroHabitacion;
    }

    public void setNroHabitacion(int nroHabitacion) {
        this.nroHabitacion = nroHabitacion;
    }

    public int getPiso() {
        return piso;
    }

    public void setPiso(int piso) {
        this.piso = piso;
    }

    public int getNroCamas() {
        return nroCamas;
    }

    public void setNroCamas(int nroCamas) {
        this.nroCamas = nroCamas;
    }

    public int getPrecioDia() {
        return precioDia;
    }

    public void setPrecioDia(int precioDia) {
        this.precioDia = precioDia;
    }
    
    public void mostrar() {
        System.out.println(" --- Datos habitacion ---");
        System.out.println("Nro.: " + nroHabitacion + " Piso: " + piso + " NroCamas: " + nroCamas + " Precio/dia: " + precioDia);
    }

}
