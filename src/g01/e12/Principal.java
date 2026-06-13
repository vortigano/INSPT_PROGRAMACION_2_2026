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