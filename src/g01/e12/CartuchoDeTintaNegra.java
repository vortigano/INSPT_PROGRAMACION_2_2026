package g01.e12;

/**
 * Código generado por la app UXFtoJava by Charly Cimino
 *
 * @see https://github.com/CharlyCimino/uxf-to-java
 */
public class CartuchoDeTintaNegra {

    private float nivel;
    public static final int NIVEL_INICIAL = 100;

    public static final int CHARS_POR_NIVEL_DE_TINTA = 50;

    public CartuchoDeTintaNegra() {
        nivel = NIVEL_INICIAL;
    }

    public boolean alcanzaLaTinta(int nChars) {
        return nivel >= nivelSegunCantCaracteres(nChars);
    }

    public float nivelSegunCantCaracteres(int nChars) {
        return (float) nChars / CHARS_POR_NIVEL_DE_TINTA;
    }

    public void consumir(int chars) {
        if (chars < 0) {
            throw new IllegalArgumentException("Los caracteres a imprimir no pueden ser negativos: " + chars);
        }
        nivel -= (float) chars / CHARS_POR_NIVEL_DE_TINTA;
    }

    @Override
    public String toString() {
        return "CartuchoDeTintaNegra{" + "nivel=" + nivel + '}';
    }

}
