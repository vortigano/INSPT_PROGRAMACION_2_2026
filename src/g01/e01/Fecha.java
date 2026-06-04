package g01.e01;

import java.time.LocalDate;
// para cnostructor
import java.time.Month;
// para imprimir con formato
import java.time.format.DateTimeFormatter;
// para anios transcurridos
import java.time.temporal.ChronoUnit;

/**
 *
 * @author Alberto Martín Capurro
 */
public class Fecha {
    private LocalDate date;
    
    public Fecha(int dia, int mes, int anio)
    {
        date = LocalDate.of(anio, Month.of(mes), dia);
    }
    
    public boolean esMasAntiguaQue(int anios)
    {
        return anios < getAniosTranscurridos();
    }
    
    public boolean esFutura() {
        return date.isAfter(LocalDate.now());
    }

    public long getAniosTranscurridos() {
        return ChronoUnit.YEARS.between(date, LocalDate.now());
    }

    @Override
    public String toString() {
        return "Fecha{" + "date=" + date.format(DateTimeFormatter.ISO_DATE) + '}';
    }
    
    
    
}
