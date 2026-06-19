package g02.e01;

import java.util.ArrayList;

/**
 * Código generado por la app UXFtoJava by Charly Cimino
 *
 * @see https://github.com/CharlyCimino/uxf-to-java
 */
public class Agenda {

    private ArrayList<Persona> personas;

    public Agenda() {
        personas = new ArrayList<>();
    }

    public void listarPersonas() {
        for (Persona persona : personas) {
            System.out.println(persona);
        }
    }

    public Persona devolverUltimo() {
        //return (personas.isEmpty())?(null):(personas.get(personas.size()-1));
        return personas.getLast();
    }

    public Persona buscarPersona(String dni) {
        Persona personaEncontrada = null;
        int i = 0;
        while (personaEncontrada == null && i < personas.size()) {
            Persona perTemp = personas.get(i);
            if (perTemp.isDni(dni)) {
                personaEncontrada = perTemp;
            }
            i++;
        }

        return personaEncontrada;
    }

    public boolean agregarPersona(String dni, String nombre, String apellido, String calle, int altura, String barrio) {
        Persona tempPer = new Persona(dni, nombre, apellido, calle, altura, barrio);
        boolean agregado = false;

        if (buscarPersona(dni) == null) {
            agregado = personas.add(tempPer);
        }
        return agregado;
    }

    public Persona removerPersona(String dni) {
        Persona borrar;
        if ((borrar = buscarPersona(dni)) != null) {
            personas.remove(borrar);
        }
        return borrar;
    }

    public boolean modificarDomicilio(String dni, String calleNueva, int alturaNueva, String barrioNuevo) {
        Persona modificar;
        if ((modificar = buscarPersona(dni)) != null) {
            modificar.setDomicilio(calleNueva, alturaNueva, barrioNuevo);
        }
        return (modificar!=null);
    }

    public ArrayList<Persona> obtenerPorBarrio(String barrio) {
        ArrayList<Persona> listPersonasPorBarrio = new ArrayList<>();
        
        for (Persona persona : personas) {
            if(persona.isBarrio(barrio)){
                listPersonasPorBarrio.add(persona);
            }
        }
        
        return listPersonasPorBarrio;
    }

    public void vaciar() {
        while(!personas.isEmpty()){
            personas.remove(personas.get(0));
        }
    }

}
