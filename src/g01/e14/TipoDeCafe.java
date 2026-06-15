package g01.e14;

/**
 * Código generado por la app UXFtoJava by Charly Cimino
 *
 * @see https://github.com/CharlyCimino/uxf-to-java
 */
public enum TipoDeCafe {

    EXPRESO(0, null),
    LATTE(2, Textura.ESPUMOSA),
    LAGRIMA(3, Textura.LIQUIDA);
    private int nivelLeche;
    private Textura textura;

    private TipoDeCafe(int nvlLeche, Textura textura) {
        this.nivelLeche = nvlLeche;
        this.textura = textura;
    }

    public int getNivelLeche() {
        return nivelLeche;
    }

    public Textura getTextura() {
        return textura;
    }
}
