package g01.e12;

/**
* Código generado por la app UXFtoJava by Charly Cimino
* @see https://github.com/CharlyCimino/uxf-to-java
*/
public class Documento {

    private String fecha;
    private String titulo;
    private String cuerpo;

    public Documento(String fecha, String titulo, String cuerpo) {
        setFecha(fecha);
        setTitulo(titulo);
        setCuerpo(cuerpo);
    }
    
    public void setFecha(String fecha){
        if(fecha==null || fecha.isBlank()){
            throw new IllegalArgumentException("La fecha no puede estar vacia ni en blanco");
        }
        this.fecha = fecha;
    }
    
    public void setTitulo(String titulo){
        if(titulo==null || titulo.isBlank()){
            throw new IllegalArgumentException("El titulo no puede estar vacio ni en blanco");
        }
        this.titulo = titulo;
    }

    public void setCuerpo(String cuerpo){
        if(cuerpo==null){
            throw new IllegalArgumentException("El cuerpo no puede estar vacio");
        }
        this.cuerpo = cuerpo;
    }
    
    public int getCantCaracteresCuerpo() {
        return cuerpo.length();
    }

    @Override
    public String toString() {
        return "\n "+ fecha + "\t **" + titulo + "**\n" + cuerpo + "\n";
    }

}