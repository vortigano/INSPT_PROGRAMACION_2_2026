package g01.e13;

/**
 * Código generado por la app UXFtoJava by Charly Cimino
 *
 * @see https://github.com/CharlyCimino/uxf-to-java
 */
public class Persona {

    private String nombre;
    private String apellido;
    private String fechaDeNacimiento;
    private String domicilio;

    public Persona(String nombre, String apellido, String fechaDeNacimiento, String domicilio) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaDeNacimiento = fechaDeNacimiento;
        this.domicilio = domicilio;
    }

    public String getNombreYApellido() {
        return nombre + " " + apellido;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apellido=" + apellido + ", fechaDeNacimiento=" + fechaDeNacimiento + ", domicilio=" + domicilio + '}';
    }
    
    

}
