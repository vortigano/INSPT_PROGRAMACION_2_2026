package g01.e12;

/**
 * Código generado por la app UXFtoJava by Charly Cimino
 *
 * @see https://github.com/CharlyCimino/uxf-to-java
 */
public class ImpresoraMonocromatica {
    
    private boolean estaEncendida;
    
    private Bandeja bandeja;
    private CartuchoDeTintaNegra cartuchoDeTintaNegra;
    
    public ImpresoraMonocromatica() {
        //estaEncendida           = false;
        bandeja = new Bandeja();
        cartuchoDeTintaNegra = new CartuchoDeTintaNegra();
    }
    
    private float nivelSegunCantCaracteres(int nChars) {
        return cartuchoDeTintaNegra.nivelSegunCantCaracteres(nChars);
    }
    
    public void encendidoApagado() {
        estaEncendida = !estaEncendida;
    }
    
    public void recargarBandeja(int nHojas) {
        bandeja.recargar(nHojas);
    }
    
    public void imprimir(Documento doc) {
        if (doc == null) {
            throw new IllegalArgumentException("El documento no puede ser nulo");
        }
        if (estaEncendida) {
            // verificar nivel de tinta y cantidad de hojas suficientes antes de imprimir
            // de lo contrario no se imprime nada);
            if (cartuchoDeTintaNegra.alcanzaLaTinta(doc.getCantCaracteresCuerpo())
                    && bandeja.alcanzanHojas(doc.getCantCaracteresCuerpo())) {
                System.out.println(doc);
                cartuchoDeTintaNegra.consumir(doc.getCantCaracteresCuerpo());
                bandeja.consumir(doc.getCantCaracteresCuerpo());
            } else {
                //System.out.println("No puede imprimir");
            }
        } else {
            System.out.println("Impresora apagada");
        }
        
    }
    
    @Override
    public String toString() {
        return "ImpresoraMonocromatica{"
                + "estaEncendida=" + (estaEncendida ? "ON" : "OFF")
                + ", \n  " + cartuchoDeTintaNegra
                + ", \n  " + bandeja + '}';
    }
    
}
