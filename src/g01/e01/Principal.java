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

   Relaciones 1 a 1 y de dependencia entre clases
9) Refactoreá la clase Persona del ejercicio 1, 
   - cambiando el año de nacimiento por su fecha de nacimiento
   - agregando el atributo domicilio, que contenga calle, altura y barrio.
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
        //Persona p1 = new Persona("Nombre1", "Apellido1", null);// throws ok
        //Persona p1 = new Persona("Nombre1", "Apellido1", new Fecha(24,12,2030));// throws ok
        //Persona p1 = new Persona("Nombre1", "Apellido1", new Fecha(24,12,1000));// throws ok
        //Persona p1 = new Persona("Nombre1", "Apellido1", new Fecha(234,12,2000));// throws ok
        //Persona p1 = new Persona("Nombre1", "Apellido1", new Fecha(31,02,2000));// throws ok
        //Persona p1 = new Persona("Nombre1", "Apellido1", new Fecha(24,12,1985));
        //Persona p1 = new Persona("Nombre1", null, new Fecha(24,12,1985)); // throws ok
        //Persona p1 = new Persona("", "Apellido1", new Fecha(24,12,1985)); // throws ok
        
        Domicilio dom = Domicilio.DOMICILIO_DESCONOCIDO;
        
        System.out.println("Dom: " + dom);
        dom = new Domicilio("Calle falsa", 1234, "SpringField");
        System.out.println("Dom: " + dom);
        
        Persona p1 = new Persona("Nombre1", "Apellido1", new Fecha(24,12,1985));
        
        System.out.println("> Devolver el nombre completo de la persona.");
        System.out.println("P1: " + p1.getNombreCompleto());
        
        System.out.println("> Mostrar su estado en la consola.");
        System.out.println(p1);
        
        //p1.nuevoDomicilio("Calle falsa", -1, "SpringField");  //throws ok
        //p1.nuevoDomicilio("Triunvirato", 3174, "");           //throws ok
        //p1.nuevoDomicilio("    ", 3174, "132");               //throws ok
        p1.nuevoDomicilio("Triunvirato", 3174, "Villa Ortuzar");
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
        //p1.setNombre(nuevoNombre); //throws ok
        //System.out.println("P1: " + p1.getNombreCompleto());
        
        nuevoNombre = "Na";
        //p1.setNombre(nuevoNombre); //throws ok
        //System.out.println("P1: " + p1.getNombreCompleto());
        
        nuevoNombre = "NewName";
        p1.setNombre(nuevoNombre);
        System.out.println("P1: " + p1.getNombreCompleto());
        
        System.out.println("> Cambiar su apellido [apellido.leng()>=3]");
        String nuevoApellido;
        nuevoApellido = null;
        //p1.setApellido(nuevoApellido); //throws ok
        //System.out.println("P1: " + p1.getNombreCompleto());
        
        nuevoApellido = "Ap";
        //p1.setApellido(nuevoApellido); //throws ok
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
