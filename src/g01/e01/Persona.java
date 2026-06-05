package g01.e01;

/**
 *
 * @author Alberto Martín Capurro
 */
public class Persona {
    private String      nombre;
    private String      apellido;
    private Fecha       fechaDeNacimiento;
    private Domicilio   domicilio;
    
    private static final int EDAD_MAXIMA = 140;
    
    public Persona(String nombre, String apellido, Fecha fechaDeNacimiento){
        setNombre(nombre);
        setApellido(apellido);
        setFechaDeNacimiento(fechaDeNacimiento);
        nuevoDomicilio(Domicilio.DOMICILIO_DESCONOCIDO);
    }
    
    public Persona(String nombre, String apellido, Fecha fechaDeNacimiento, Domicilio dom){
        setNombre(nombre);
        setApellido(apellido);
        setFechaDeNacimiento(fechaDeNacimiento);
        nuevoDomicilio(dom);
    }
    
    public void nuevoDomicilio(Domicilio domicilio){
        this.domicilio = (domicilio == null) ? (Domicilio.DOMICILIO_DESCONOCIDO) : (domicilio);
    }   
    
    public void nuevoDomicilio(String calle, int altura, String barrio){
        domicilio = new Domicilio(calle, altura, barrio);
    }   
    
    public void setNombre(String nombre){
        if(nombre==null || nombre.length()<3 || nombre.isBlank()){
            throw new IllegalArgumentException("Nombre invalido: " + nombre);
        }
        this.nombre = nombre;
    }
    
    public void setApellido(String apellido){
        if(apellido==null || apellido.length()<3 || apellido.isBlank()){
            throw new IllegalArgumentException("Apellido invalido: " + apellido);
        }
        this.apellido = apellido;
    }
    
    public void setFechaDeNacimiento(Fecha fechaDeNacimiento) {
        if(fechaDeNacimiento == null || fechaDeNacimiento.esFutura() || fechaDeNacimiento.esMasAntiguaQue(EDAD_MAXIMA))
        {
            throw new IllegalArgumentException("Anio de nacimiento invalido: " + fechaDeNacimiento);
        }
        this.fechaDeNacimiento = fechaDeNacimiento;
    }
    
    public String getNombreCompleto()
    {
        return nombre + " " + apellido;
    }
    
    public int getEdadActual()
    {
        return (int)fechaDeNacimiento.getAniosTranscurridos();
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
        return "Persona{" + "nombre=" + nombre + ", apellido=" + apellido + ", fechaDeNacimiento=" + fechaDeNacimiento + ", domicilio=" + domicilio + '}';
    }
}
