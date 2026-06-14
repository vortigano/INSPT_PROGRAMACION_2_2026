package g01.e13;

/**
 * Código generado por la app UXFtoJava by Charly Cimino
 *
 * @see https://github.com/CharlyCimino/uxf-to-java
 */
public class Ticket {

    private String nombreYApellido;
    private double montoTotal;
    private double montoCuota;

    public Ticket(String nombreYApellido, double montoTotal, double montoCuota) {
        setNombreYApellido(nombreYApellido);
        setMontoTotal(montoTotal);
        setMontoCuota(montoCuota);
    }

    public void setNombreYApellido(String nombreYApellido) {
        this.nombreYApellido = nombreYApellido;
    }

    public void setMontoTotal(double montoTotal) {
        this.montoTotal = montoTotal;
    }

    public void setMontoCuota(double montoCuota) {
        this.montoCuota = montoCuota;
    }

    @Override
    public String toString() {
        return String.format(" Titular %s\nMonto Total:     $%10.2f\nMonto por cuota: $%10.2f\n",
                nombreYApellido, montoTotal, montoCuota);
    }

}
