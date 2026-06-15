package g01.e14;

/**
 * Código generado por la app UXFtoJava by Charly Cimino
 *
 * @see https://github.com/CharlyCimino/uxf-to-java
 */
public class ModuloLeche {

    private int nivelLeche;
    public static final int NIVEL_LECHE_MAX = 5;
    public static final int NIVEL_LECHE_MIN = 0;
    private Textura textura;

    public ModuloLeche() {
        nivelLeche = 0;
        textura = Textura.LIQUIDA;
    }

    /*
        Expresso: No lleva leche.
         Latte: 2 puntos de leche. La textura de la leche debe ser espumosa.
         Lágrima: 3 puntos de leche. La textura de la leche debe ser líquida
     */
    public void puedeServirCafe(TipoDeCafe tipoDeCafe) {
        if (tipoDeCafe == null) {
            throw new IllegalArgumentException("El tipo de cafe no puede ser null");
        }
        
        if (tipoDeCafe.getNivelLeche() > nivelLeche) {
            throw new RuntimeException("Leche insuficiente para " + tipoDeCafe);
        }

        Textura textura= tipoDeCafe.getTextura();
        if (textura != null && textura != this.textura) {
            throw new RuntimeException("La textura para " + tipoDeCafe
                    + " es " + textura + " pero cafetera configurada para " + this.textura);
        }
    }

    private void consumir(int nivelLeche) {
        this.nivelLeche -= nivelLeche;
    }

    public void servirCafe(TipoDeCafe tipoDeCafe) {
        puedeServirCafe(tipoDeCafe);
        this.consumir(tipoDeCafe.getNivelLeche());
    }

    public void cargarLecheYtextura(int nivelLeche, Textura textura) {
        if (nivelLeche < 0) {
            throw new IllegalArgumentException("El nivel de leche no puede ser negatvo");
        }
        if (textura != null) {
            this.textura = textura;
        }
        this.nivelLeche += nivelLeche;
        if (this.nivelLeche > NIVEL_LECHE_MAX) {
            this.nivelLeche = NIVEL_LECHE_MAX;
        }
    }

}
