/*
1) Modelá la clase Persona, la cual posea como atributos nombre,
   apellido y año de nacimiento.
   Luego, implementá métodos que permitan:

    Devolver el nombre completo de la persona.
    Mostrar su estado en la consola.
    Obtener su edad actual.
    Saber si es mayor que una edad dada.
    Cambiar su nombre.
    Cambiar su apellido.
    Cambiar su nombre y su apellido.

   Finalmente, instanciá una persona en el método main y probá todos sus métodos.
*/
package g01.e01;

/**
 *
 * @author Alberto Martín Capurro
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Persona p1 = new Persona("Nombre1", "Apellido1", 1885);
        Persona p1 = new Persona("Nombre1", "Apellido1", 1985);
        
        System.out.println("> Devolver el nombre completo de la persona.");
        System.out.println("P1: " + p1.getNombreCompleto());
        
        System.out.println("> Mostrar su estado en la consola.");
        System.out.println(p1);
        
        System.out.println("> Obtener su edad actual.");
        System.out.println("P1: edad actual: " + p1.getEdadActual());
        
        System.out.println("> Saber si es mayor que una edad dada.");
        int edadDada;
        edadDada = 20;
        System.out.println("P1: es mayor que "+ edadDada +"? " + p1.esMayorQue(edadDada));
        
        System.out.println("> Saber si es mayor que una edad dada.");
        edadDada = 50;
        System.out.println("P1: es mayor que "+ edadDada +"? " + p1.esMayorQue(edadDada));
        
        System.out.println("> Cambiar su nombre [nombre.leng()>=3]");
        String nuevoNombre;
        nuevoNombre = null;
        p1.setNombre(nuevoNombre);
        System.out.println("P1: " + p1.getNombreCompleto());
        
        nuevoNombre = "Na";
        p1.setNombre(nuevoNombre);
        System.out.println("P1: " + p1.getNombreCompleto());
        
        nuevoNombre = "NewName";
        p1.setNombre(nuevoNombre);
        System.out.println("P1: " + p1.getNombreCompleto());
        
        System.out.println("> Cambiar su apellido [apellido.leng()>=3]");
        String nuevoApellido;
        nuevoApellido = null;
        p1.setApellido(nuevoApellido);
        System.out.println("P1: " + p1.getNombreCompleto());
        
        nuevoApellido = "Ap";
        p1.setApellido(nuevoApellido);
        System.out.println("P1: " + p1.getNombreCompleto());
        
        nuevoApellido = "NewApellido";
        p1.setApellido(nuevoApellido);
        System.out.println("P1: " + p1.getNombreCompleto());
        
        System.out.println("> Cambiar nombre y apellido");
        nuevoNombre     = "Nombre2";
        nuevoApellido   = "Apellido2";
        
        p1.setNombreYApellido(nuevoNombre, nuevoApellido);
        System.out.println("P1: " + p1.getNombreCompleto());
    }
}
