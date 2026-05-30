package g01.e03;

import java.util.Random;

/**
 *
 * @author Alberto Martín Capurro
 */
public class CuentaBancaria {
    public static final int CBU_LEN = 22;
    
    private TipoDeCuenta tipo;
    private String  cbu;
    private double  saldo;

    public CuentaBancaria(TipoDeCuenta tipo){
        setTipo(tipo);
        setCBU();
        saldo = 0;
    }
    
    public CuentaBancaria(TipoDeCuenta tipo, String cbu, double saldo)
    {
        setTipo(tipo);
        setCbu(cbu);
        setSaldo(saldo);
    }
    
    private void setCbu(String cbu){
        if(cbu==null || cbu.length()!=CBU_LEN)
        {
            throw new IllegalArgumentException("CBU ingreso invalido " + cbu);
        }
        this.cbu = cbu;
    }
    
    private void setSaldo(double saldo){
        if(tipo != TipoDeCuenta.CUENTA_CORRIENTE && saldo < 0){
            throw new IllegalArgumentException("El saldo inicial no puede ser negativo");
        }
        this.saldo = saldo;
    }
    
    public String getCbu(){
        return cbu;
    }
    
    public TipoDeCuenta getTipoDeCuenta(){
        return tipo;
    }
    
    private void setTipo(TipoDeCuenta tipo){
        if(tipo!=null)
            this.tipo = tipo;
        else
            throw new IllegalArgumentException("Tipo de cuenta no valida");
    }
    
    private String generarCadena(int largo)
    {
        // podría usarse StringBuilder ya que las Strings son inmutables
        // y es màs eficiente para este propósito
        String nuevaCadena = "";
        Random rnd = new Random();
        for(int i=0; i<largo; i++)
        {
            nuevaCadena += (char) rnd.nextInt('0', '9'+1);
        }
        return nuevaCadena;
    }
    
    private void setCBU()
    {
        this.cbu = generarCadena(CBU_LEN);
    }
    
    private double getSaldo(){
        return this.saldo;
    }
    
    public void depositar(double importe){
        if(importe<=0){
            throw new IllegalArgumentException("El importe a depositar debe ser mayor que cero");
        }
        this.saldo +=importe;
    }
    
    public void extraer(double importe){
        if(importe<=0){
            throw new IllegalArgumentException("El importe a extraer debe ser mayor que cero");
        }
        if(tipo != TipoDeCuenta.CUENTA_CORRIENTE && this.saldo < importe){
            throw new IllegalArgumentException("La extraccion excede el saldo de la cuenta");
        }
        this.saldo -= importe;
    }
    
    public double obtenerSaldoActual(){
        return getSaldo();
    }
        
    public String obtenerUltimos3DigitosDeCBU(){
        return this.cbu.substring(CBU_LEN-3);
    }

    @Override
    public String toString() {
        return "CuentaBancaria{" + "tipo=" + tipo + ", cbu=" + cbu + ", saldo=" + saldo + '}';
    }
    
}
