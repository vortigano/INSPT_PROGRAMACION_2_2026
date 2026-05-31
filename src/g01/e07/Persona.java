package g01.e07;

/**
 *
 * @author Alberto Martín Capurro
 */
public class Persona {
    private String nombre;
    private String apellido;
    
    public Persona(String nombre, String apellido){
        setNombreYApellido(nombre, apellido);
    }
    
    public void setNombreYApellido(String nombre, String apellido){
        setNombre(nombre);
        setApellido(apellido);
    }
    
    public void setNombre(String nombre){
        if(nombre==null || nombre.isBlank()){
            throw new IllegalArgumentException("El nombre no es valido " + nombre);
        }
        this.nombre = nombre;
    }
    
    public void setApellido(String apellido){
        if(apellido==null || apellido.isBlank()){
            throw new IllegalArgumentException("El apellido no es valido " + apellido);
        }
        this.apellido = apellido;
    }
    
    public String getNombreYApellido(){
        return nombre + " " + apellido;
    }

    @Override
    public String toString() {
        return getNombreYApellido();
    }
    
    
}
