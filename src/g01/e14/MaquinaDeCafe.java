package g01.e14;

/**
 * Código generado por la app UXFtoJava by Charly Cimino
 *
 * @see https://github.com/CharlyCimino/uxf-to-java
 */
public class MaquinaDeCafe {

    private String marca;
    private boolean encendida;
    private ModuloAgua modAgua;
    private ModuloLeche modLeche;

    public MaquinaDeCafe(String marca) {
        modAgua = new ModuloAgua();
        modLeche = new ModuloLeche();
    }

    private void puedeServirCafe() {
        if (!encendida) {
            throw new RuntimeException("Maquina apagada");
        }
    }

    public void servirCafe(TipoDeCafe tipoDeCafe) {
        if (tipoDeCafe == null) {
            throw new IllegalArgumentException("El tipo de cafe no puede ser nulo");
        }
        //if(encendida && modAgua.puedeServirCafe() && modLeche.puedeServirCafe(tipoDeCafe))
        try {
            puedeServirCafe();
            modAgua.puedeServirCafe();
            //modAgua.servirCafe();
            modLeche.servirCafe(tipoDeCafe);

            System.out.printf("El cafe %s se ha servido correctamente\n",
                    tipoDeCafe.toString());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void calentarAgua() {
        modAgua.calentarAgua();
    }

    public void mantenimiento() {
        modAgua.mantenimiento();
    }

    public void pulsarBotonDeEncendidoApagado() {
        encendida = !encendida;
    }

    public void cargarLecheYTextura(int nvlLeche, Textura textura) {
        modLeche.cargarLecheYtextura(nvlLeche, textura);
    }

}
