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
