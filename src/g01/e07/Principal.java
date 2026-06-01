/*
    7) Se precisa un robot (que tiene nombre) que permita atender llamadas 
    telefónicas. La compañía puede detectar algunos clientes según su número de 
    teléfono, sin embargo, en otros casos no. Por ello, el robot debe ser capaz 
    de procesar alguno de los siguientes métodos homónimos:

     saludar(): void
     Emite por consola un saludo diciendo: 
     "Hola, mi nombre es ___. ¿En qué puedo ayudarte?".2

     saludar(Persona): void
     Emite por consola un saludo diciendo:
     "Hola ___, mi nombre es ___. ¿En qué puedo ayudarte?".3

     2 El "___" debe reemplazarse por el nombre del robot.
     3 El primer "___" debe reemplazarse por el nombre completo de la persona y
       el segundo "___" debe reemplazarse por el nombre del robot.
     4 No olvides instanciar un objeto Robot en el main
*/
package g01.e07;

/**
 *
 * @author Alberto Martín Capurro
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Robot robot = new Robot("ROBO-1000"); 
        //Robot robot = new Robot(" "); //throws ok
    
        Persona p = new Persona("Nombre1", "Apellido1");
        //Persona p = new Persona("", "Apellido1"); //throws ok
        //Persona p = new Persona("Nombre1", " "); //throws ok
        
        robot.saludar();
        robot.saludar(p);
        
    }

}
