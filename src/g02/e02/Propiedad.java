package g02.e02;

/**
* Código generado por la app UXFtoJava by Charly Cimino
* @see https://github.com/CharlyCimino/uxf-to-java
*/
public class Propiedad {

    private String domicilio;
    private double precio;
    private TipoDePropiedad tipo;

    public Propiedad(String domicilio, double precio, TipoDePropiedad tipo){
        this.domicilio  = domicilio;
        this.precio     = precio;
        this.tipo       = tipo;
    }
    
    public double getPrecio(){
        return precio;
    }

    @Override
    public String toString() {
        return "Propiedad{" + "domicilio=" + domicilio + ", precio=" + precio + ", tipo=" + tipo + "}\n";
    }

    public boolean isType(TipoDePropiedad tipo) {
        return this.tipo.equals(tipo);
    }
}