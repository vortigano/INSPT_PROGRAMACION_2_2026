package g01.e08;

import java.util.Random;

/**
 *
 * @author Alberto Martín Capurro
 */
public class Password {
    private String valor;
    private static final int PASSWORD_FUERTE_LEN   = 8;
    private static final int LONGITUD_MINIMA       = 6;
    
    public Password(String valor){
        if(valor==null){
            throw new IllegalArgumentException("El valor para password no puede ser nulo");
        }
        if(valor.isEmpty()){
            throw new IllegalArgumentException("El valor para password debe contener al menos un caracter");
        }
        this.valor = valor;
    }
    
    public Password(){
        nuevoValor(generarAleatorio(LONGITUD_MINIMA));
    }
    
    /*
        Devuelve si la password es fuerte o no.
        Una password es fuerte cuando tenga al menos 8 caracteres.
    */
    public boolean esFuerte(){
        return valor.length()>=PASSWORD_FUERTE_LEN;
    }
    
    /*
        Establece como nuevo valor de password el recibido como parámetro,
        siempre y cuando su longitud sea mayor o igual a 6, si no, lo deja
        como estaba. Devuelve si se pudo o no establecer el valor.
    */
    public boolean nuevoValor(String valor){
        boolean pudoEstablecerse = false;
        if(valor.length() >= LONGITUD_MINIMA){
            this.valor          = valor;
            pudoEstablecerse    = true;
        }
        return pudoEstablecerse;
    }
    
    public static String generarAleatorio(int longitud){
        String nuevoValor;
        if(longitud < LONGITUD_MINIMA)
        {
            nuevoValor = null;
        }
        else
        {
            Random r    = new Random();
            nuevoValor  = "";
            // StringBuilder es más eficiente pero a fines didácticos
            // es aceptable el uso de esta solución
            for(int i=0; i<longitud; i++)
            {
                char c = (char) r.nextInt(' ','~');
                nuevoValor += c;
            }
        }
        return nuevoValor;
    }

    @Override
    public String toString() {
        return "Password{" + "valor=" + valor + '}';
    }
    
}
