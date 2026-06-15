package g01.e14;

import java.util.Random;

/**
 * Código generado por la app UXFtoJava by Charly Cimino
 *
 * @see https://github.com/CharlyCimino/uxf-to-java
 */
public class ModuloAgua {

    private double temperatura;
    private boolean enMantenimiento;

    public static final double TEMP_INICIAL = 20;

    // costó mucho nombrar esta constante
    // por encima de este valor se permite preparar cafe
    // todos los valores por debajo son insuficientes
    public static final double TEMP_MAXIMA_INSUFICIENTE = 70;

    public ModuloAgua() {
        enMantenimiento = true;
        temperatura = TEMP_INICIAL;
    }

    public boolean requiereMantenimiento() {
        return enMantenimiento;
    }

    public void calentarAgua() {
        temperatura = TEMP_MAXIMA_INSUFICIENTE + 1;
    }

    public void mantenimiento() {
        enMantenimiento = false;
    }

    public void puedeServirCafe() {
        if (enMantenimiento) {
            throw new RuntimeException("El modulo de agua requiere mantenimiento");
        }
        if (temperatura <= TEMP_MAXIMA_INSUFICIENTE) {
            throw new RuntimeException("El agua no alcanza la temperatura minima para preparar cafe");
        }
    }
    
//    // no uso este patrón porque es poca información
//    // frente al mecanismo de try-catch que es más robusto
//    public boolean puedeServirCafe() {
//        return !enMantenimiento && temperatura>TEMP_MAXIMA_INSUFICIENTE;
//    }
}
