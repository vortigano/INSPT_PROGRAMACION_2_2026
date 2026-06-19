package g02.e03;

import java.util.ArrayList;
import jdk.jshell.EvalException;

/**
* Código generado por la app UXFtoJava by Charly Cimino
* @see https://github.com/CharlyCimino/uxf-to-java
*/
public class Alumno {

    private String nombre;
    private String dni;
    private ArrayList<Examen> examenesRendidos;

    public Alumno(String nombre, String dni){
        this.nombre = nombre;
        this.dni    = dni;
        this.examenesRendidos = new ArrayList<>();
    }
    
    public double calcularPromedio() {
        double promedio = 0;
        if(!this.examenesRendidos.isEmpty()){
            for (Examen examen : examenesRendidos) {
                promedio += examen.getNota();
            }
            promedio /= (double) cantidadDeEvaluaciones();
        }
        return promedio;
    }

    public void agregarEvaluacion(TipoDeExamen tipo, double calificacion) {
        examenesRendidos.add( new Examen(tipo, calificacion));
    }

    public int cantidadDeEvaluaciones() {
        return this.examenesRendidos.size();
    }

    boolean isDni(String dni) {
        return this.dni.equalsIgnoreCase(dni);
    }

    @Override
    public String toString() {
        return "Alumno{" + "nombre=" + nombre + ", dni=" + dni + ", examenesRendidos=" + examenesRendidos + "}\n";
    }

    public void mostrarEvaluaciones() {
        System.out.println(this);
        System.out.println(examenesRendidos);
    }
    
}