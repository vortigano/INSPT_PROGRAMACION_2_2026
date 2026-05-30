/*
    3) Modelá la clase CuentaBancaria, la cual posea como atributos la clave
    bancaria uniforme (CBU), el tipo (caja de ahorro o cuenta corriente) y el 
    saldo (inicialmente en 0). Luego, implementá métodos que permitan:
     Obtener el saldo actual.
     Depositar dinero en la cuenta (actualizando el saldo).
     Extraer dinero de la cuenta (actualizando el saldo). Solo puede quedar
    en saldo negativo si es cuenta corriente.
     Obtener los últimos 3 dígitos del CBU.

    6) Refactoreá las clases de los cuatros ejercicios anteriores con los siguientes cambios:
     Agregar un constructor que inicialice todos sus atributos por parámetro.
     Establecer sus atributos como privados y colocar los getters/setters que correspondan.
     Implementar el método toString() y comprobar su funcionamiento
*/
package g01.e03;

/**
 *
 * @author Alberto Martín Capurro
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CuentaBancaria cuenta[] = {
            new CuentaBancaria(TipoDeCuenta.CAJA_DE_AHORRO),
            new CuentaBancaria(TipoDeCuenta.CUENTA_CORRIENTE)
        };
        
        cuenta[0].depositar(500);
        //cuenta[0].extraer(800); //throws exception OK
        cuenta[1].depositar(500);
        cuenta[1].extraer(800);
                
        for (CuentaBancaria cuentaBancaria : cuenta) {
            System.out.println("Ultimos 3 digitos: " + cuentaBancaria.obtenerUltimos3DigitosDeCBU());
            System.out.printf("Saldo actual: $%12.2f\n",cuentaBancaria.obtenerSaldoActual());
            System.out.println(cuentaBancaria);
            System.out.println("----");
        }
    }

}
