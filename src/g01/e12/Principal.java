/*
    12) Desarrollar la clase ImpresoraMonocromatica. Sus atributos serán si está o no encendida, una bandeja que indique la cantidad de hojas, y, por último, un único cartucho con un nivel de tinta negra. Inicialmente, toda impresora está apagada, con una bandeja sin hojas y con un cartucho lleno (nivel de tinta en 100).
    La impresora debe ser capaz responder a los siguientes métodos:
     int nivelSegunCantCaracteres(int) {…} ¿Este método debería ser público o privado?
      Devuelve cuánta cantidad de tinta debería usarse según la cantidad de caracteres recibida por parámetro.
     void recargarBandeja(int) {…} ¿Este método debería ser público o privado?
      Suma a la bandeja una cantidad de hojas. El máximo de la bandeja es de 35 hojas. Se debe verificar no exceder ese valor. Si el parámetro es negativo, la bandeja se deja como está.
     void imprimir(Documento) {…} ¿Este método debería ser público o privado?
      Imprime por consola los siguientes campos del documento*, en el siguiente formato:

    Fecha   **Titulo**
    Cuerpo

    Al hacerlo, se descuenta 1 punto de nivel de tinta por cada 50 caracteres del cuerpo impresos y se resta 1 hoja de la bandeja por cada 20 caracteres del cuerpo impreso. Se debe verificar antes de imprimir que se cuente con nivel de tinta y cantidad de hojas suficientes, de lo contrario, no se imprimirá nada.

    * Modelá la clase correspondiente.
*/
package g01.e12;

/**
* Código generado por la app UXFtoJava by Charly Cimino
* @see https://github.com/CharlyCimino/uxf-to-java
*/
public class Principal {

    public static void main(String[] args) {
        ImpresoraMonocromatica printer = new ImpresoraMonocromatica();
        
        System.out.println("Printer1: " + printer);
        System.out.println("-> Enciende impresora");
        printer.encendidoApagado();
        System.out.println("Printer1: " + printer);
        //System.out.println("Nivel segun caracteres: " + printer.nivelSegunCantCaracteres(51));
        System.out.println("-> Carga papel");
        //printer.recargarBandeja(100); //throws ok
        printer.recargarBandeja(Bandeja.HOJAS_MAX);
        System.out.println("Printer1: " + printer);
        
        //Documento doc = null;
        //System.out.println("-> imprimir documento: " + doc);
        //printer.imprimir(doc); // throws ok
        
        Documento doc = new Documento("13/06/2026", "Prueba1", "Mensaje del cuerpo para dos hojas.......1234567890");
        //Documento doc = new Documento("12/06/2026", "Prueba2", "");
        System.out.println("-> imprimir documento");
        System.out.println("cuerpo len: " + doc.getCantCaracteresCuerpo());
        printer.imprimir(doc);
        
        System.out.println("Printer1: " + printer);
        
    }

}