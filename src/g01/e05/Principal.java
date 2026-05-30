/*
    5) Modelá la clase Fraccion, la cual posea como atributos numerador y 
    denominador. Luego, implementá métodos que permitan:
     Mostrarse en consola, con el formato "numerador/denominador".
     Obtener el valor decimal.
     Sumarle un entero.
     Sumarle una fracción.
     Simplificar la fracción.
     Saber si la fracción es propia, impropia u aparente.
    Finalmente, instanciá una fracción en el método main y 
    probá todos sus métodos.

    Fracciones propias: son aquellas en las que el numerador es menor que el 
        denominador. 
    Fracciones aparentes: son aquellas cuyo numerador es múltiplo del 
        denominador.
    Fracciones impropias: son aquellas en las que el numerador es mayor que el
        denominador, pero no múltiplo.
*/
package g01.e05;

/**
 *
 * @author Alberto Martín Capurro
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Fraccion a = new Fraccion(2, 0); // throws exception OK
        Fraccion a = new Fraccion(3, 2);
        Fraccion b = new Fraccion(2, 5);
        Fraccion c = new Fraccion(4, 4);
        
        System.out.println("Fracion a");
        a.mostrarFraccion();
        System.out.println("Fracion b");
        b.mostrarFraccion();
        System.out.println("Fraccion c");
        c.mostrarFraccion();
        
        System.out.println("Sumar entero 4 en a");
        a.sumarEntero(4);
        a.mostrarFraccion();
        
        System.out.println("Sumar fraccion a + b");
        a.sumarFraccion(b);
        a.mostrarFraccion();
        
        System.out.println("Valor decimal a: " + a.obtenerValorDecimal());
        
        System.out.println("Simplificar a");
        a.setNumerador(478);
        a.setDenominador(256);
        a.mostrarFraccion();
        a.simplificar();
        a.mostrarFraccion();
        
        System.out.println("Simplificar b");
        b.mostrarFraccion();
        b.simplificar();
        b.mostrarFraccion();
        
        a.mostrarFraccion();
        System.out.println("a es propia?   " + a.esPropia());
        System.out.println("a es aparente? " + a.esAparente());
        System.out.println("a es impropia? " + a.esImpropia());
        b.mostrarFraccion();
        System.out.println("b es propia?   " + b.esPropia());
        System.out.println("b es aparente? " + b.esAparente());
        System.out.println("b es impropia? " + b.esImpropia());
        c.mostrarFraccion();
        System.out.println("c es propia?   " + c.esPropia());
        System.out.println("c es aparente? " + c.esAparente());
        System.out.println("c es impropia? " + c.esImpropia());
    }

}
