package mascotas;

/**
 *
 * @author desktop
 */
public class Mascota {

    private String nombre, raza;
    private int edad;
    private String incapacidad;

    Mascota() {

    }

    Mascota(String a, String b, int c, String d) {
        nombre = a;
        raza = b;
        edad = c;
        incapacidad = d;
    }

    public void mostrar() {
        System.out.println("Nombre: " + nombre + " Raza: " + raza + " Edad: " + edad + " Incapacidad: " + incapacidad);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getIncapacidad() {
        return incapacidad;
    }

    public void setIncapacidad(String incapacidad) {
        this.incapacidad = incapacidad;
    }
}
