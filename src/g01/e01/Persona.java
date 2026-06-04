package g01.e01;

import java.time.Year;

/**
 *
 * @author Alberto Martín Capurro
 */
public class Persona {
    private String  nombre;
    private String  apellido;
    private int     anioDeNacimiento;
    
    private static final int EDAD_MAXIMA = 140;
    
    public Persona(String nombre, String apellido, int anioDeNacimiento)
    {
        setNombre(nombre);
        setApellido(apellido);
        setAnioDeNacimiento(anioDeNacimiento);
    }
    
    public void setNombre(String nombre)
    {
        if(nombre!=null && nombre.length()>=3)
        {
            this.nombre = nombre;
        }
    }
    
    public void setApellido(String apellido)
    {
        if(apellido!=null && apellido.length()>=3)
        {
            this.apellido = apellido;
        }
    }
    
    private boolean esAnioFuturo(int anio)
    {
        return anio > Year.now().getValue();
    }
    
    private boolean esAnioDemasiadoAntiguo(int anio)
    {
        return anio < Year.now().getValue() - EDAD_MAXIMA;
    }
    
    public void setAnioDeNacimiento(int anioDeNacimiento) {
        if(esAnioFuturo(anioDeNacimiento) || esAnioDemasiadoAntiguo(anioDeNacimiento))
        {
            throw new IllegalArgumentException("Anio de nacimiento invalido: " + anioDeNacimiento);
        }
        this.anioDeNacimiento = anioDeNacimiento;
    }
    
    public String getNombreCompleto()
    {
        return nombre + " " + apellido;
    }
    
    public int getEdadActual()
    {
        return Year.now().getValue() - anioDeNacimiento;
    }
    
    public boolean esMayorQue(int edad) {
        return (getEdadActual() > edad);
    }

    
    public void setNombreYApellido(String nuevoNombre, String nuevoApellido) {
        setNombre(nuevoNombre);
        setApellido(nuevoApellido);
    }
    
    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apellido=" + apellido + ", anioDeNacimiento=" + anioDeNacimiento + '}';
    }
}
