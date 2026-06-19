package g02.e03;

import java.util.ArrayList;

/**
 * Código generado por la app UXFtoJava by Charly Cimino
 *
 * @see https://github.com/CharlyCimino/uxf-to-java
 */
public class Curso {

    private static int codigoCount;
    private String codigo;
    private String titulo;
    private double horasDuracion;
    private ArrayList<Alumno> alumnos;

    public Curso(String titulo, double horas) {
        this.codigo = generarCodigo();
        this.titulo = titulo;
        this.horasDuracion = horas;
        this.alumnos = new ArrayList<>();
    }

    private String generarCodigo() {
        return String.format("%04d",++codigoCount);
    }

    public ArrayList<Alumno> buscarAlumnosPorEncimaDe(double calificacion) {
        ArrayList<Alumno> alumnosPorEncima = new ArrayList<>();
        
        for (Alumno alumno : alumnos) {
            if(alumno.calcularPromedio()>calificacion){
                alumnosPorEncima.add(alumno);
            }
        }
        
        return alumnosPorEncima;
    }

    public int cantDeInscriptos() {
        // Método a resolver...
        return 0;
    }
    
    private Alumno buscarAlumno(String dni){
        Alumno alu = null;
        boolean existe = false;
        int i=0;
        while(alu==null && i<alumnos.size()){
            Alumno aluTmp = alumnos.get(i);
            if(aluTmp.isDni(dni)){
                alu = aluTmp;
            }
            i++;
        }
        return alu;
    }

    public boolean inscribirAlumno(String nombre, String dni) {
        boolean seInscribio = false;
        Alumno alu;
        if( (alu = buscarAlumno(dni))== null ){
            Alumno aluNuevo = new Alumno(nombre, dni);
            alumnos.add(aluNuevo);
            seInscribio = true;
        }
        
        return seInscribio;
    }

    public boolean agregarEvaluacion(String dni, TipoDeExamen tipo, double calificacion) {
        boolean pudo = false;
        Alumno aluBuscado = null;
        if( (aluBuscado = buscarAlumno(dni)) != null){
            aluBuscado.agregarEvaluacion(tipo, calificacion);
            pudo = true;
        }
        return pudo;
    }

    public boolean isTitulo(String titulo) {
        return this.titulo.equalsIgnoreCase(titulo);
    }

    public String getCodigo() {
        return this.codigo;
    }

    @Override
    public String toString() {
        return "Curso{" + "codigo=" + codigo + ", titulo=" + titulo + ", horasDuracion=" + horasDuracion + ", alumnos=" + alumnos + '}';
    }

    public boolean isCodigo(String codigoCurso) {
        return this.codigo.equalsIgnoreCase(codigoCurso);
    }
    
    public void mostrarAlumnos(){
        System.out.println("Titulo: " + this.titulo);
        System.out.println(alumnos);
    }

    public void mostrarEvaluacionesPorAlumno() {
        for (Alumno alumno : alumnos) {
            alumno.mostrarEvaluaciones();
        }
    }

    
}
