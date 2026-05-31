package g01.e07;

/**
 *
 * @author Alberto Martín Capurro
 */
public class Robot {

    private String nombre;

    public Robot(String nombre) {
        setNombre(nombre);
    }

    private boolean nombreValido(String nombre) {
        return nombre != null && !nombre.isBlank();
    }

    public void setNombre(String nombre) {
        if (nombreValido(nombre)) {
            this.nombre = nombre;
        } else {
            throw new IllegalArgumentException("Nombre invalido");
        }
    }

    public void saludar() {
        System.out.printf(
                "Hola, mi nombre es %s. ¿En qué puedo ayudarte?\n", nombre
        );
    }

    public void saludar(Persona p) {
        System.out.printf("Hola %s, mi nombre es %s. ¿En qué puedo ayudarte?\n",
                p, nombre);
    }
}
