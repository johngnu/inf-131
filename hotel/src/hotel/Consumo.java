package hotel;

/**
 *
 * @author desktop
 */
public class Consumo {

    private String nombreProducto;
    private int precio;

    public Consumo(String nombreProducto, int precio) {
        this.nombreProducto = nombreProducto;
        this.precio = precio;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    void mostrar() {
        System.out.println("... Producto: " + nombreProducto + " Precio: " + precio);
    }

}
