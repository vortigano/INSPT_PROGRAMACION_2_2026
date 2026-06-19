/*
    1) Generá la clase **Persona** con, al menos, los atributos:
       - DNI (String),
       - nombre,
       - apellido,
       - domicilio (calle, altura y barrio). 

    > Debe tener un constructor parametrizado que inicialice **todos sus atributos**.

    A continuación, definí la clase **Agenda**, que contendrá una **colección de personas** (con **ArrayList**) y
    los siguientes métodos (debés deducir los parámetros y los valores de retorno de cada uno):
    - A) `listarPersonas`, que muestre en la consola un listado con todos los datos de cada persona de la colección.
    - B) `devolverUltimo`, que retorne (no muestre por consola) a la última persona de la colección (o retorne null si está vacía la colección).
    - C) `buscarPersona`, que busca en la colección a la persona que posea el DNI recibido por parámetro y la retorne (o retorna null si no se encuentra).
    - D) `agregarPersona`, que recibe por parámetro todos los datos necesarios para construir una Persona. Se construirá y agregará una persona a la colección con esos datos, siempre y cuando no exista ya alguien con ese DNI en tal colección. Retorna un `boolean` indicando si se pudo agregar o no.
    - E) `removerPersona`, que recibe por parámetro un DNI. Debe borrar de la colección a la persona con ese DNI y retornarla (o retornar null si no existe tal persona).
    - F) `modificarDomicilio`, que recibe por parámetro un DNI y un domicilio. Debe modificar el domicilio de la persona encontrada con ese DNI por el recibido por parámetro. Retorna un `boolean` indicando la operación fue exitosa o no.
    - G) `obtenerPorBarrio`, que retorne (no muestre por consola) a todas las personas que vivan en un barrio determinado por parámetro.
    - H) `vaciar`, que elimina a todas las personas de la colección, una por una. (Sin usar el método `clear` de la clase ArrayList).

    Crear una clase con el método main para testear todos y cada uno de los métodos de la agenda.
*/
/**
* Código generado por la app UXFtoJava by Charly Cimino
* @see https://github.com/CharlyCimino/uxf-to-java
*/
package g02.e01;

public class Principal {

    public static void main(String[] args) {
        Agenda agenda = new Agenda();
        
        System.out.println("***** listarPersonas *****");
        agenda.listarPersonas();
        System.out.println("***** agregarPersona *****");
        System.out.println(agenda.agregarPersona("100", "nom1", "ape1", "calle1", 100, "barrio A"));
        System.out.println(agenda.agregarPersona("100", "nom1", "ape1", "calle1", 100, "barrio A"));
        System.out.println(agenda.agregarPersona("200", "nom2", "ape2", "calle2", 200, "barrio B"));
        System.out.println(agenda.agregarPersona("300", "nom3", "ape3", "calle3", 400, "barrio C"));
        System.out.println(agenda.agregarPersona("400", "nom2", "ape4", "calle4", 500, "barrio C"));
        System.out.println(agenda.agregarPersona("500", "nom5", "ape5", "calle5", 600, "barrio D"));
        
        System.out.println("***** listarPersonas *****");
        agenda.listarPersonas();
        System.out.println("***** devolverUltimo *****");
        System.out.println(agenda.devolverUltimo());
        System.out.println("***** removerPersona *****");
        System.out.println(agenda.removerPersona("200"));
        System.out.println("***** listarPersonas *****");
        agenda.listarPersonas();
        System.out.println("***** modificarDomicilio *****");
        agenda.modificarDomicilio("200", "calleNueva", 1500, "barrioNuevo");
        agenda.listarPersonas();
        
        System.out.println("***** obtenerPorBarrio *****");
        System.out.println("Barrio C");
        System.out.println(agenda.obtenerPorBarrio("barrio C"));
        
        System.out.println("***** vaciar *****");
        agenda.vaciar();
        System.out.println("***** listarPersonas *****");
        agenda.listarPersonas();
        
        
    }

}