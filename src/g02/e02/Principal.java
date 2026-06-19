/*
    2) Una inmobiliaria, exclusiva de los barrios de Recoleta, Palermo y Belgrano, tiene a la venta propiedades, de las que se sabe su domicilio (String), su precio y su tipo (Depto, Casa o PH).
    Basado en el enunciado descripto, realizá:

    - a) El diagrama de clases que lo modelice, con sus relaciones, atributos y métodos.
    - b) La implementación del método promedioDePrecio de la clase Inmobiliaria, el cual debe devolver cuánto cuestan en promedio todas las propiedades.
    - c) La implementación del método propiedadesMasEconomicas de la clase Inmobiliaria, el cual debe devolver una lista de propiedades cuyo precio esté por debajo del promedio general.
    - d) La implementación del método cantidadDePropiedadesSegunTipo de la clase Inmobiliaria, que recibe como parámetro un tipo de propiedad y debe devolver la cantidad de propiedades de tal tipo.
*/
package g02.e02;

/**
* Código generado por la app UXFtoJava by Charly Cimino
* @see https://github.com/CharlyCimino/uxf-to-java
*/
public class Principal {

    public static void main(String[] args) {
        Inmobiliaria inmob = new Inmobiliaria();
        
        System.out.println("****** Listar propiedades ******");
        inmob.listarPropiedades();
        System.out.println("****** Agregar propiedades ******");
        inmob.agregarPropiedad("Calle 100", 1000, TipoDePropiedad.DEPTO);
        inmob.agregarPropiedad("Calle 200", 1000, TipoDePropiedad.DEPTO);
        inmob.agregarPropiedad("Calle 300", 1500, TipoDePropiedad.PH);
        inmob.agregarPropiedad("Calle 400", 1500, TipoDePropiedad.PH);
        inmob.agregarPropiedad("Calle 500", 1600, TipoDePropiedad.PH);
        inmob.agregarPropiedad("Calle 600", 2700, TipoDePropiedad.CASA);
        inmob.agregarPropiedad("Calle 700", 3000, TipoDePropiedad.CASA);
        inmob.agregarPropiedad("Calle 800", 1200, TipoDePropiedad.CASA);
        inmob.agregarPropiedad("Calle 900", 1000, TipoDePropiedad.CASA);
        
        System.out.println("****** Listar propiedades ******");
        inmob.listarPropiedades();
        System.out.println("****** Promedio de precio ******");
        System.out.println(" $"+ inmob.promedioDePrecio());
        System.out.println("****** Propiedades más económicas ******");
        System.out.println(inmob.propiedadesMasEconomicas());
        System.out.println("****** Propiedades tipo ******");
        for (TipoDePropiedad tipo: TipoDePropiedad.values()) {
            System.out.println("Tipo: " + tipo + 
                    "  cantidad: " + inmob.cantidadDePropiedadesSegunTipo(tipo));
        }
    }

}