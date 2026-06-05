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

    # Relaciones 1 a 1 y de dependencia entre clases
        ## 10. Refactoreá la clase CuentaBancaria del ejercicio 3
        - agregando el atributo titular, que representa a la persona titular de la cuenta.
        - agregando el atributo fechaDeApertura.
*/
package g01.e03;

import g01.e01.Fecha;
import g01.e01.Persona;

/**
 *
 * @author Alberto Martín Capurro
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Persona p1 = new Persona("Nombre 1", "Apellido 1", new Fecha( 9, 9, 1988));
        Persona p2 = new Persona("Nombre 2", "Apellido 2", new Fecha(12, 5, 1979));
        CuentaBancaria cuenta[] = {
            new CuentaBancaria(TipoDeCuenta.CAJA_DE_AHORRO, p1, new Fecha(24,12,2020)),
            new CuentaBancaria(TipoDeCuenta.CUENTA_CORRIENTE, p2, new Fecha(8,1,2023)),
            //new CuentaBancaria(TipoDeCuenta.CUENTA_CORRIENTE, null, new Fecha(24,12,2020)) //throws ok
            //new CuentaBancaria(TipoDeCuenta.CUENTA_CORRIENTE, p2, null) //throws ok
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
