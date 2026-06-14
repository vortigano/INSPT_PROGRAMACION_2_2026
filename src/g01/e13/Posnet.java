package g01.e13;

/**
 * Código generado por la app UXFtoJava by Charly Cimino
 *
 * @see https://github.com/CharlyCimino/uxf-to-java
 */
public class Posnet {

    public static final int CUOTAS_MIN = 1;
    public static final int CUOTAS_MAX = 6;
    public static final double PORCENTAJE_POR_CUOTA = 0.03;

    public Ticket efectuarPago(TarjetaDeCredito tarjetaDeCredito, double montoAPagar, int nCuotas) {
        Ticket ticket = null;

        if (tarjetaDeCredito != null && montoAPagar > 0 && nCuotas >= CUOTAS_MIN && nCuotas <= CUOTAS_MAX) {
            double montoTotal = calcularMontoTotal(montoAPagar, nCuotas);
            double montoPorCuota = calcularMontoPorCuota(montoTotal, nCuotas);
            if (tarjetaDeCredito.saldoSuficiente(montoTotal)) {

                ticket = new Ticket(tarjetaDeCredito.getTitularNombreYApellido(), montoTotal, montoPorCuota);
            }
        }

        return ticket;
    }

    private static double calcularMontoPorCuota(double montoTotal, int nCuotas) {
        return (double) montoTotal / nCuotas;
    }

    private static double calcularMontoTotal(double montoAPagar, int nCuotas) {
        return montoAPagar * (1 + (PORCENTAJE_POR_CUOTA * (nCuotas - 1)));
    }

}
