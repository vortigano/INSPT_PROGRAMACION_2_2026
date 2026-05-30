package g01.e04;

/**
 *
 * @author Alberto Martín Capurro
 */
public class Fecha {
    private int dia;
    private int mes;
    private int anio;
    
    private static final int ANIO_MAX    = 2999;
    private static final int ANIO_MIN    = 1950;
    private static final int MES_MIN     = 1;
    private static final int MES_MAX     = 12;
    private static final int DIA_MIN     = 1;
    private static final int DIA_MAX     = 31;
    
    private static final int[] DIAS_DEL_MES_MAX =
    {31,28,31,30,31,30,31,31,30,31,30,31};
    
    public Fecha(int dia, int mes, int anio)
    {
        setAnio(anio);
        setMes(mes);
        setDia(dia);
        if(!esValida()){
            throw new IllegalArgumentException ("Fecha invalida: " + dia + "/" + mes + "/"+anio);
        };
    }
    
    public int getDia(){
        return dia;
    }
    
    public int getMes(){
        return mes;
    }
    
    public int getAnio(){
        return anio;
    }

    @Override
    public String toString() {
        return obtenerFecha();
    }
    
    public boolean esValida(){
        int diasDelMesMax = getDiasDelMes(mes,anio);
                
        return anioDentroDelRango(anio) && dia <= diasDelMesMax;
    }
    
    /*
        logica basada en:
        https://es.wikipedia.org/wiki/Año_bisiesto
    */
    private boolean esAnioBisesto(int anio){
        return (anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0);
    }
    private boolean anioDentroDelRango(int anio){
        return (anio>=ANIO_MIN && anio<=ANIO_MAX);
    }   
    private boolean mesDentroDelRango(int mes){
        return (mes>=MES_MIN && mes<=MES_MAX);
    }
    private boolean diaDentroDelRango(int dia){
        return (dia>=DIA_MIN && dia<=DIA_MAX);
    }
    
    public void setDia(int dia){
        if(!diaDentroDelRango(dia)){
            throw new IllegalArgumentException("Dia fuera de rango " + dia);
        }
        this.dia = dia;
    }
    public void setMes(int mes){
        if(!mesDentroDelRango(mes)){
            throw new IllegalArgumentException("Mes fuera de rango " + mes);
        }
        this.mes = mes;
    }
    public void setAnio(int anio){
        if(!anioDentroDelRango(anio)){
            throw new IllegalArgumentException("Anio fuera de rango " + anio);
        }
        this.anio = anio;
    }
    
    public void sumarMes(){
        final int ULTIMO_MES = 12;
        
        int mesSiguiente;
        
        if(this.mes<ULTIMO_MES)
            mesSiguiente = this.mes + 1;
        else{
            mesSiguiente = 1;
            this.anio++;
        }

        this.mes = mesSiguiente;
        if(getDiasDelMes(this.mes, this.anio) < this.dia)
        {
            this.dia = getDiasDelMes(this.mes, this.anio);
        }
    }
    
    public int getDiasDelMes(int mes, int anio){
        return DIAS_DEL_MES_MAX[mes - 1] + ((esAnioBisesto(anio) && mes==2)?(1):(0));
    }
            
    public String obtenerFecha(){
        return String.format("%02d/%02d/%04d", dia, mes, anio);
    }
    
    public boolean esNavidad(){
        return this.dia == 25 && this.mes == 12 && this.anioDentroDelRango(anio);
    }
            
}
