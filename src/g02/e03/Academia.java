package g02.e03;

import java.util.ArrayList;

/**
 * Código generado por la app UXFtoJava by Charly Cimino
 *
 * @see https://github.com/CharlyCimino/uxf-to-java
 */
public class Academia {

    private ArrayList<Curso> cursos;

    public Academia() {
        cursos = new ArrayList<>();
    }

    public String agregarCurso(String titulo, double horas) {
        String codigo = null;
        if (!existeCursoPorTitulo(titulo)) {
            Curso curso = new Curso(titulo, horas);
            codigo = curso.getCodigo();
            cursos.add(curso);
        }
        return codigo;
    }

    public boolean existeCursoPorTitulo(String titulo) {
        boolean encontrado = false;
        int i = 0;
        while (!encontrado && i < cursos.size()) {
            Curso cursoTemp = cursos.get(i);
            if (cursoTemp.isTitulo(titulo)) {
                encontrado = cursoTemp.isTitulo(titulo);
            }
            i++;
        }
        return encontrado;
    }

    private Curso buscarCursoPorCodigo(String codigoCurso) {
        Curso curso = null;
        boolean existe = false;
        int i = 0;
        while (!existe && i < cursos.size()) {
            Curso temp = cursos.get(i);
            if (temp.isCodigo(codigoCurso)) {
                curso   = temp;
                existe  = true;
            }
            i++;
        }
        return curso;
    }
    
    public boolean existeAlumnoPorDni(String codigoCurso, String dni){
        boolean existe = false;
        Curso cur = buscarCursoPorCodigo(codigoCurso);
        if(cur != null){
            //cur.inscribirAlumno(, )
        }
        return existe;
    }

    public boolean inscribirAlumno(String codigoCurso, String nombre, String dni) {
        //buscar si existe curso por codigo de curso
        //buscar si existe alumno por dni
        Curso cur = buscarCursoPorCodigo(codigoCurso);
        boolean seInscribio = false;
        if(cur != null){
            seInscribio = cur.inscribirAlumno(nombre, dni);
        }
        return seInscribio;
    }

    public void agregarEvaluacion(String codigoCurso, String dni, TipoDeExamen tipo, double calificacion) {
        Curso cur = buscarCursoPorCodigo(codigoCurso);
        if(cur!=null){
            cur.agregarEvaluacion(dni, tipo, calificacion);
        }
    }

    public void mostrarCursos() {
        for (Curso curso : cursos) {
            System.out.println(curso);
        }
    }

    public void mostarAlumnosPorCurso() {
        for (Curso curso : cursos) {
            curso.mostrarAlumnos();
        }
    }
    
    public void mostrarEvaluacionesPorAlumno(){
        for (Curso curso : cursos) {
            curso.mostrarEvaluacionesPorAlumno();
        }
    }

    public void mostrarAlumnosPorEncimaDe(double prom) {
        for (Curso curso : cursos) {
            System.out.println("curso codigo: " + curso.getCodigo());
            System.out.println(curso.buscarAlumnosPorEncimaDe(prom));
        }
        
    }

}
