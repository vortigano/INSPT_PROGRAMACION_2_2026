package g01.e12;

/**
 * Código generado por la app UXFtoJava by Charly Cimino
 *
 * @see https://github.com/CharlyCimino/uxf-to-java
 */
public class Bandeja {

    private int hojas;
    public static final int HOJAS_INICIAL = 0;
    public static final int HOJAS_MAX = 35;

    public static final int CHARS_POR_HOJA = 20;

    public Bandeja() {
        hojas = HOJAS_INICIAL;
    }

    public void recargar(int hojas) {
        if (hojas == 0) {
            throw new IllegalArgumentException(
                    "La cantidad de hojas a cargar no puede ser cero");
        }
//        if (hojas < 0){
//            throw new IllegalArgumentException(
//                    "La cantidad de hojas a cargar no puede ser negativa");
//        }
        if (hojas > 0) {
            if (this.hojas + hojas > HOJAS_MAX) {
                throw new IllegalArgumentException(
                        "La cantidad de hojas a cargar supera la capacidad de la bandeja ");
            }
            this.hojas += hojas;
        }

    }

    public boolean alcanzanHojas(int chars) {
        if (chars < 0) {
            throw new IllegalArgumentException("Los caracteres a imprimir no pueden ser negativos: " + chars);
        }
        return hojas >= Math.ceil((float) chars / CHARS_POR_HOJA);
    }

    public void consumir(int chars) {
        if (chars < 0) {
            throw new IllegalArgumentException("Los caracteres a consumir no pueden ser negativos: " + chars);
        }
        hojas -= Math.ceil((float) chars / CHARS_POR_HOJA);
    }

    @Override
    public String toString() {
        return "Bandeja{" + "hojas=" + hojas + '}';
    }

}
