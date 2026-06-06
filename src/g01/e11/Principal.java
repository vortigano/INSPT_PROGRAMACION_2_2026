/*
    # Relaciones 1 a 1 y de dependencia entre clases
    ## 11. Utilizando las clases generadas hasta ahora, codificá en Java la 
siguiente situación: Una cuenta bancaria de tipo caja de ahorros le pertenece a 
Fulano Gomez, nacido el 16/04/1990 y otra de tipo cuenta corriente le pertenece 
a Mengana Torres, nacida el 23/11/1991.
    Ambos están casados y viven juntos en Av. Triunvirato 3174 , Villa Ortúzar.
    Supongamos que Fulano y Mengana se mudan a nuevo hogar: ¿Hay que cambiar el 
domicilio de cada uno o basta con cambiar uno de los dos?
    R: Si las instancias de Domicilio fueran mutables bastaría con cambiar los
campos deseados como Domicilio.setCalle(), Domicilio.setAltura(), Domicilio.setBarrio(),
pero debido a que mi clase Domicilio es inmutable, estoy forzado a crear una nueva
instancia con los atributos que se deseen cambiar.
*/
package g01.e11;

import g01.e01.Domicilio;
import g01.e01.Fecha;
import g01.e01.Persona;
import g01.e03.CuentaBancaria;
import g01.e03.TipoDeCuenta;

/**
 *
 * @author Alberto Martín Capurro
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Domicilio dom1 = new Domicilio("Av. Triunvirato", 3174, "Villa Ortúzar");
        Domicilio dom2 = new Domicilio("Medrano", 951, "Almagro");
        Persona p1 = new Persona("Fulano", "Gomez", new Fecha(16, 4, 1990), dom1);
        Persona p2 = new Persona("Mengana", "Torres", new Fecha(23, 11, 1991), dom1);
        CuentaBancaria cuenta1 = new CuentaBancaria(TipoDeCuenta.CAJA_DE_AHORRO, p1, new Fecha(10,1,2020));
        CuentaBancaria cuenta2 = new CuentaBancaria(TipoDeCuenta.CUENTA_CORRIENTE, p2, new Fecha(11,1,2020));
        System.out.println("p1: " + p1);
        System.out.println("p2: " + p2);
        // cambio de domicilio
        System.out.println("// cambio de domicilio");
        p1.nuevoDomicilio(dom2);
        p2.nuevoDomicilio(dom2);
        System.out.println("p1: " + p1);
        System.out.println("p2: " + p2);
        
    }

}
