package g01.e05;

/**
 *
 * @author Alberto Martín Capurro
 */
public class Fraccion {

    private int numerador;
    private int denominador;

    public Fraccion(int numerador, int denominador) {
        setNumerador(numerador);
        setDenominador(denominador);
        normalizarSigno();
    }

    @Override
    public String toString() {
        return String.format("%d/%d\n", numerador, denominador);
    }
    
    private void normalizarSigno()
    {
        if(denominador < 0){
            numerador   *= -1;
            denominador *= -1;
        }
    }

    public void setNumerador(int numerador) {
        this.numerador = numerador;
    }

    public void setDenominador(int denominador) {
        if (denominador == 0) {
            throw new IllegalArgumentException("Denominador no puede ser cero");
        }
        this.denominador = denominador;
        normalizarSigno();
    }

    public void mostrarFraccion() {
        System.out.printf(toString());
    }

    public double obtenerValorDecimal() {
        return (double) numerador / denominador;
    }

    public void sumarEntero(int entero) {
        numerador += entero * denominador;
    }

    public void sumarFraccion(Fraccion fraccion) {
        numerador = (numerador * fraccion.getDenominador()) + (fraccion.getNumerador() * denominador);
        denominador = (denominador * fraccion.getDenominador());
        normalizarSigno();
    }

    public int getDenominador() {
        return denominador;
    }

    public int getNumerador() {
        return numerador;
    }

    private int getMCD() {
        int a = Math.abs(numerador);
        int b = Math.abs(denominador);
        while (b != 0) {
            int resto = a % b;
            a = b;
            b = resto;
        }
        return a;
    }

    public void simplificar() {
        int mcd = getMCD();
        numerador /= mcd;
        denominador /= mcd;
    }

    public boolean esPropia() {
        return Math.abs(numerador) < Math.abs(denominador);
    }

    public boolean esImpropia() {
        return Math.abs(numerador) > Math.abs(denominador);
    }

    public boolean esAparente() {
        return Math.abs(numerador) % Math.abs(denominador) == 0;
    }

}
