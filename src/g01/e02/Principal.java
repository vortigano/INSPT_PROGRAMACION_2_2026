/*
    2) Desarrollar la clase Empleado, cuyos atributos sean su DNI, nombre, 
    apellido, salario base, estado civil (soltero, casado, divorciado o viudo)
    y cantidad de hijos.
    Se sabe que todos los empleados cobran el salario base más un plus del 3% de
    éste por cada hijo, con un tope de hasta 10%. Del salario resultante debe 
    descontarse un 4% en caso de que el estado civil sea soltero.
    Desarrollar el método obtenerSalarioFinal() que retorne el valor del salario
    del empleado según las reglas enunciadas.

    6) Refactoreá las clases de los cuatros ejercicios anteriores con los siguientes cambios:
     Agregar un constructor que inicialice todos sus atributos por parámetro.
     Establecer sus atributos como privados y colocar los getters/setters que correspondan.
     Implementar el método toString() y comprobar su funcionamiento
*/
package g01.e02;

/**
 *
 * @author Alberto Martín Capurro
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Empleado empleados[] = {
            new Empleado("12345678", "nombre1", "apellido1", 100, EstadoCivil.SOLTERO, 0),
            new Empleado("12345678", "nombre2", "apellido2", 100, EstadoCivil.SOLTERO, 4),
            new Empleado("12345678", "nombre3", "apellido3", 100, EstadoCivil.CASADO, 2),
            new Empleado("12345678", "nombre4", "apellido4", 100, EstadoCivil.CASADO, 5),
            new Empleado("12345678", "nombre5", "apellido5", 100, EstadoCivil.DIVORCIADO, 2),
            new Empleado("12345678", "nombre6", "apellido6", 100, EstadoCivil.VIUDO, 2)
        };
    
        for (Empleado emp : empleados) {
            System.out.println("-------------");
            System.out.println("Empleado: " + emp);
            System.out.printf("Salario Final: $%10.2f\n",emp.obtenerSalarioFinal());
        }
    }
}
