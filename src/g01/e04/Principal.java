/*
    4) Modelá la clase Fecha, la cual posea como atributos el día, el mes y el año. Luego, implementá
    métodos que permitan:
     Obtener la fecha como cadena, en formato "dd/mm/aaaa".
     Saber si es Navidad.
     Sumar un mes.
    Finalmente, instanciá una fecha en el método main y probá todos sus métodos
*/
package g01.e04;

/**
 *
 * @author Alberto Martín Capurro
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Fecha fecha = new Fecha(29,2,2024);
        Fecha fecha = new Fecha(29,05,2024);
        System.out.println(fecha.obtenerFecha());
        System.out.println("fecha.esValida: " + fecha.esValida());
        fecha.setAnio(2026);
        System.out.println(fecha.obtenerFecha());
        System.out.println("fecha.esValida: " + fecha.esValida());
        System.out.println(fecha.obtenerFecha());
        System.out.println("Es navidad? " + fecha.esNavidad());
        fecha.setMes(12);
        fecha.setDia(25);
        System.out.println(fecha.obtenerFecha());
        System.out.println("Es navidad? " + fecha.esNavidad());
        fecha.setAnio(2024);
        fecha.setMes(1);
        fecha.setDia(31);
        System.out.println(fecha.obtenerFecha());
        fecha.sumarMes();
        System.out.println("sumarMes()");
        System.out.println(fecha.obtenerFecha());
        
        
    }

}
