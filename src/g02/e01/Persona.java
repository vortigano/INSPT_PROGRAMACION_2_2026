package g02.e01;

/**
 * Código generado por la app UXFtoJava by Charly Cimino
 *
 * @see https://github.com/CharlyCimino/uxf-to-java
 */
public class Persona {

    private String dni;
    private String nombre;
    private String apellido;
    private Domicilio domicilio;

    public Persona(String dni, String nombre, String apellido, String calle, int altura, String barrio) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        domicilio = new Domicilio(calle, altura, barrio);
    }

    public void setDomicilio(String calle, int altura, String barrio) {
        this.domicilio = new Domicilio(calle, altura, barrio);
    }
    
    @Override
    public String toString() {
        return "Persona{" + "dni=" + dni + ", nombre=" + nombre + ", apellido=" + apellido + ", domicilio=" + domicilio + '}';
    }

    public boolean isDni(String dni) {
        return this.dni.equalsIgnoreCase(dni);
    }

    public boolean isBarrio(String barrio) {
        return this.domicilio.isBarrio(barrio);
    }

}
