/*
    3) Una academia ofrece una serie de cursos de diversas disciplinas. De cada curso se sabe su código alfanumérico que lo identifica unívocamente, su título, la cantidad de horas de duración y los alumnos que posee inscriptos. De cada alumno se sabe su nombre y su DNI. Así mismo, cada alumno posee una lista con las evaluaciones rendidas. De cada evaluación se sabe su tipo (Primer examen, Segundo examen o Final) y la nota obtenida.
    Basado en el enunciado descripto, realizá:
    - a) El diagrama de clases que lo modelice, con sus relaciones, atributos y métodos.
    - b) La implementación del método calcularPromedio de la clase Alumno, que debe calcular el promedio de dicho alumno entre todas las evaluaciones que haya rendido.
    - c) La implementación del método buscarAlumnosPorEncimaDe de la clase Curso, que recibe como parámetro un valor que representa un promedio, debiendo crear y devolver una lista de aquellos alumnos que hayan realizado al menos 2 evaluaciones y cuyo promedio de notas supere al promedio enviado por parámetro.
*/
package g02.e03;

/**
 * Código generado por la app UXFtoJava by Charly Cimino
 *
 * @see https://github.com/CharlyCimino/uxf-to-java
 */
public class Principal {

    public static void main(String[] args) {
        Academia academia = new Academia();
        System.out.println("Academia: " + academia);
        System.out.println("***** Mostrar cursos *****");
        academia.mostrarCursos();
        System.out.println("--------------------------");
        System.out.println("***** Abrir cursos *****");
        System.out.println(academia.agregarCurso("Titulo-1", 2));
        System.out.println(academia.agregarCurso("Titulo-1", 3));
        System.out.println(academia.agregarCurso("Titulo-2", 4));
        System.out.println(academia.agregarCurso("Titulo-3", 4));
        System.out.println("***** Mostrar cursos *****");
        academia.mostrarCursos();
        System.out.println("***** Inscribir alumno *****");
        academia.inscribirAlumno("0001", "nombre1", "10000");
        academia.inscribirAlumno("0001", "nombre1", "10001");
        academia.inscribirAlumno("0002", "nombre2", "10002");
        academia.inscribirAlumno("0003", "nombre3", "10003");
        System.out.println("***** mostrar Alumnos por curso *****");
        academia.mostarAlumnosPorCurso();
        //System.out.println("***** mostrar evaluaciones *****");
        //academia.mostrarEvaluacionesPorAlumno();
        System.out.println("***** agregar evaluaciones *****");
        academia.agregarEvaluacion("0002", "10002", TipoDeExamen.FINAL, 9);
        System.out.println("***** mostrar evaluaciones *****");
        academia.mostrarEvaluacionesPorAlumno();
        System.out.println("--------------------------------");
        System.out.println("***** mostrar alumnos por encima de prom 8 *****");
        academia.mostrarAlumnosPorEncimaDe(8);
    }

}
