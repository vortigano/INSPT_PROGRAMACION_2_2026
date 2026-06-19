package g02.e01;

/**
 * Código generado por la app UXFtoJava by Charly Cimino
 *
 * @see https://github.com/CharlyCimino/uxf-to-java
 */
public class Domicilio {

    private String calle;
    private int altura;
    private String barrio;

    public Domicilio(String calle, int altura, String barrio) {
        this.calle = calle;
        this.altura = altura;
        this.barrio = barrio;
    }

    @Override
    public String toString() {
        return "Domicilio{" + "calle=" + calle + ", altura=" + altura + ", barrio=" + barrio + '}';
    }

    public boolean isBarrio(String barrio) {
        return this.barrio.equalsIgnoreCase(barrio);
    }

}
