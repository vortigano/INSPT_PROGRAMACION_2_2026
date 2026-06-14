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