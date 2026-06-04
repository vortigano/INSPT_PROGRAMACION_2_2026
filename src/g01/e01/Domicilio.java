package g01.e01;

/**
 *
 * @author Alberto Martín Capurro
 */
public class Domicilio {
    
    private String  calle;
    private int     altura;
    private String  barrio;
    
    public static final int SIN_ALTURA = 0;
    public static final Domicilio DOMICILIO_DESCONOCIDO = new Domicilio("Sin calle", 0, "Sin barrio");
        
    public Domicilio(String calle, int altura, String barrio){
        setCalle(calle);
        setAltura(altura);
        setBarrio(barrio);
    }
    
    private void setBarrio(String barrio){
        if(barrio==null || barrio.isBlank()){
            throw new IllegalArgumentException("Nombre de barrio invalido: " + barrio);
        }
        this.barrio = barrio;
    }
    
    /*
        Para calles que no tienen altura se usa SIN_ALTURA
        Las calles que tienen altura deben ser mayor a cero
    */
    private void setAltura(int altura){
        if(altura!=SIN_ALTURA && altura<1){
            throw new IllegalArgumentException("Altura debe ser mayor a cero: " + altura);
        }
        this.altura = altura;
    }
    
    private void setCalle(String calle){
        if(calle==null || calle.isBlank()){
            throw new IllegalArgumentException("Nombre de calle invalido: " + calle);
        }
        this.calle  = calle;
    }
            
    @Override
    public String toString() {
        return "Domicilio{" + "calle=" + calle + ", altura=" + altura + ", barrio=" + barrio + '}';
    }
    
}
