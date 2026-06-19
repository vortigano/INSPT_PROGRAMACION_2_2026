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