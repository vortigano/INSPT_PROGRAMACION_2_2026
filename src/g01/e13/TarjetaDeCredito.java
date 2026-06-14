package g01.e13;

/**
 * Código generado por la app UXFtoJava by Charly Cimino
 *
 * @see https://github.com/CharlyCimino/uxf-to-java
 */
public class TarjetaDeCredito {

    private String entidadBancaria;
    private String numero;
    private double saldo;
    private Persona titular;
    private EntidadFinanciera entidadFinanciera;

    public TarjetaDeCredito(Persona titular, String entidadBancaria, EntidadFinanciera entidadFinanciera, String numero, double saldo) {
        setTitular(titular);
        setEntidadBancaria(entidadBancaria);
        setEntidadFinanciera(entidadFinanciera);
        setNumeroDeTarjeta(numero);
        depositar(saldo);
    }

    public void setNumeroDeTarjeta(String numeroDeTarjeta) {
        if (numeroDeTarjeta == null || numeroDeTarjeta.isBlank()) {
            throw new IllegalArgumentException("El numero de tarjeta es invalido");
        }
        this.numero = numeroDeTarjeta;
    }

    public void setEntidadFinanciera(EntidadFinanciera entidadFinanciera) {
        if (entidadFinanciera == null) {
            throw new IllegalArgumentException("Entidad financiera no puede ser nula");
        }
        this.entidadFinanciera = entidadFinanciera;
    }

    public void setEntidadBancaria(String entidadBancaria) {
        if (entidadBancaria == null) {
            throw new IllegalArgumentException("Entidad bancaria no puede ser nula");
        }
        this.entidadBancaria = entidadBancaria;
    }

    public void setTitular(Persona titular) {
        if (titular == null) {
            throw new IllegalArgumentException("Titular no puede ser nulo");
        }
        this.titular = titular;
    }

    public String getTitularNombreYApellido() {
        return titular.getNombreYApellido();
    }

    public void depositar(double saldo) {
        if (saldo <= 0) {
            throw new IllegalArgumentException("Saldo a depositar no puede ser negativo o cero: " + saldo);
        }
        this.saldo += saldo;
    }

    public void descontar(double saldo) {
        if (this.saldo < saldo) {
            throw new IllegalArgumentException("Saldo no suficiente para dicha operacion");
        }
        this.saldo -= saldo;
    }

    public boolean saldoSuficiente(double montoTotalAPagar) {
        return saldo >= montoTotalAPagar;
    }

    @Override
    public String toString() {
        return "TarjetaDeCredito{" + "entidadBancaria=" + entidadBancaria + ", numero=" + numero + ", saldo=" + saldo + ", titular=" + titular + ", entidadFinanciera=" + entidadFinanciera + '}';
    }

}
