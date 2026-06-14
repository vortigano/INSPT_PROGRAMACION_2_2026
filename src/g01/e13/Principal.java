/*
    13) Se desea implementar la lógica de un dispositivo POSNET que procesa pagos con tarjetas de crédito. Las tarjetas de crédito guardan el nombre de la entidad financiera a la que pertenecen (únicamente Visa, MasterCard o Maestro), el nombre de la entidad bancaria, el número de tarjeta, el saldo disponible y los datos del titular (nombre, apellido, fecha de nacimiento y domicilio). Cada vez que se cree una nueva tarjeta, deberán indicarse todos estos datos.
    A la hora de abonar, el POSNET recibiría la tarjeta con la que desea hacerse el pago, junto con el monto que se desea abonar y la cantidad de cuotas (de 1 a 6).
    Si el pago es en 1 cuota, no se genera ningún recargo, de lo contrario, el monto se incrementará en un 3% por cada cuota superior a 1. (Ejemplo: Pagar en 4 cuotas representará un 9% de incremento).
    El POSNET debe chequear que la tarjeta tenga saldo suficiente para poder efectuar el pago junto con el recargo, si hubiese. En caso de éxito, debe generar y retornar (no mostrar) un ticket donde consten los siguientes datos:
     Nombre y apellido del cliente.
     Monto total a pagar.
     Monto de cada cuota.
    Si la operación no tuvo éxito, se retornará null.
    A) Desarrollar, en la clase Posnet, el método efectuarPago(), cuyos parámetros, lógica y valor de retorno deben deducirse según lo enunciado. Desarrollar también los métodos derivados que puedan surgir de él para conseguir el objetivo.
    B) Desarrollar el método main del proyecto y generar las instancias necesarias para poder efectuar un pago de $10000 en 5 cuotas, usando una tarjeta de crédito con saldo disponible de $15000 (el resto de los datos, pueden inventarse a tu gusto).
*/
package g01.e13;

/**
* Código generado por la app UXFtoJava by Charly Cimino
* @see https://github.com/CharlyCimino/uxf-to-java
*/
public class Principal {

    public static void main(String[] args) {
        Persona titular = new Persona("Nombre1", "Apellido1", "13/06/2026", "Av. La Plata 1234");
        TarjetaDeCredito tarjeta = new TarjetaDeCredito(titular,
                "Banco1", EntidadFinanciera.MASTERCARD , "012345678901234567890", 15000);
        
        System.out.println("Tarjeta: " + tarjeta);
        
        Posnet posnet = new Posnet();
        
        Ticket ticket = posnet.efectuarPago(tarjeta, 10000, 5);
        
        System.out.println("Ticket: " + ticket);
    }

}