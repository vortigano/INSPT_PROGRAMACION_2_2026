package g02.e03;

/**
* Código generado por la app UXFtoJava by Charly Cimino
* @see https://github.com/CharlyCimino/uxf-to-java
*/
public class Examen {

    private double nota;
    private TipoDeExamen tipo;

    public Examen(TipoDeExamen tipo, double nota){
        this.tipo = tipo;
        this.nota = nota;
    }
    
    public double getNota(){
        return nota;
    }

    @Override
    public String toString() {
        return "Examen{" + "nota=" + nota + ", tipo=" + tipo + "}";
    }
    
}