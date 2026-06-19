package g02.e02;

import java.util.ArrayList;

/**
 * Código generado por la app UXFtoJava by Charly Cimino
 *
 * @see https://github.com/CharlyCimino/uxf-to-java
 */
public class Inmobiliaria {

    private ArrayList<Propiedad> propiedades;

    public Inmobiliaria() {
        propiedades = new ArrayList<>();
    }

    public void listarPropiedades() {
        for (Propiedad prop : propiedades) {
            System.out.println(prop);
        }
    }

    public void agregarPropiedad(String domicilio, double precio, TipoDePropiedad tipo) {
        propiedades.add(new Propiedad(domicilio, precio, tipo));
    }

    public double promedioDePrecio() {
        double promedio = 0.0;

        if (!propiedades.isEmpty()) {
            for (Propiedad prop : propiedades) {
                promedio += prop.getPrecio();
            }
            promedio /= propiedades.size();
        }

        return promedio;
    }

    public ArrayList<Propiedad> propiedadesMasEconomicas() {
        ArrayList<Propiedad> propsMasEconom = new ArrayList();
        
        double precioPromedio = promedioDePrecio();
        
        for (Propiedad prop : propiedades) {
            if(prop.getPrecio() < precioPromedio){
                propsMasEconom.add(prop);
            }
        }
        
        return propsMasEconom;
    }

    public int cantidadDePropiedadesSegunTipo(TipoDePropiedad tipo) {
        int count = 0;
        
        for (Propiedad prop : propiedades) {
            if(prop.isType(tipo)){
                count ++;
            }
        }
        
        return count;
    }

}
