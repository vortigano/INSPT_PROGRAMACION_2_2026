package g01.e02;

/**
 *
 * @author Alberto Martín Capurro
 */
public class Empleado {
    
    private static final double PLUS_POR_HIJO       = 0.03;
    private static final double PLUS_TOPE           = 0.10;
    private static final double DESCUENTO_SOLTERO   = 0.04;
    
    private static final int NOMBRE_LENGTH_MINIMO = 3;
    private static final int APELLIDO_LENGTH_MINIMO = 3;
    
    private String      dni;
    private String      nombre;
    private String      apellido;
    private double      salarioBase;
    private EstadoCivil estadoCivil;
    private int         hijos;

    public Empleado(String dni, String nombre, String apellido, double salarioBase, EstadoCivil estadoCivil, int hijos) {
        setDni      (dni);
        setNombre   (nombre);
        setApellido (apellido);
        setSalarioBase  (salarioBase);
        setEstadoCivil  (estadoCivil);
        setHijos    (hijos);
    }
    
    private boolean esDniValido(String dni)
    {
        return (dni!=null && !dni.isBlank() && dni.length()>7);
    }
    
    private void setDni(String dni)
    {
        if(esDniValido(dni))
            this.dni = dni;
        else
            throw new IllegalArgumentException("dni invalido");
    }
    
    private boolean esNombreValido(String nombre)
    {
        return (nombre!=null && !nombre.isBlank() && nombre.length()>NOMBRE_LENGTH_MINIMO);
    }
    
    private boolean esApellidoValido(String apellido)
    {
        return (apellido!=null && !apellido.isBlank() && apellido.length()>APELLIDO_LENGTH_MINIMO);
    }
    
    private boolean esCantidadDeHijosValida(int hijos)
    {
        return hijos>=0;
    }
    
    private void setNombre(String nombre)
    {
        if(esNombreValido(nombre))
        {
            this.nombre = nombre;
        }
        else
            throw new IllegalArgumentException("Nombre invalido");
    }
    
    private void setApellido(String apellido)
    {
        if(esApellidoValido(apellido))
        {
            this.apellido = apellido;
        }
        else
            throw new IllegalArgumentException("Apellido invalido");
    }
        
    private void setHijos(int hijos)
    {
        if(esCantidadDeHijosValida(hijos))
        {
            this.hijos = hijos;
        }
        else
            throw new IllegalArgumentException("Cantidad de hijos no valida");
    }
    
    private double obtenerPorcentajePlus()
    {
        double plus = hijos * PLUS_POR_HIJO;
        
        return (plus>PLUS_TOPE)?(PLUS_TOPE):(plus);
    }
    
    private double descuentoPorcentajeSolteros()
    {
        return (estadoCivil == EstadoCivil.SOLTERO) ? (DESCUENTO_SOLTERO): (0);
    }
    
    public double obtenerSalarioFinal()
    {
        double salarioFinal = salarioBase;
        
        salarioFinal *= (1 + obtenerPorcentajePlus());
        salarioFinal *= (1 - descuentoPorcentajeSolteros());
        
        return salarioFinal;
    }
    
    private boolean esSalarioBaseValido(double salarioBase)
    {
        return salarioBase>0;
    }

    private void setSalarioBase(double salarioBase)
    {
        if(esSalarioBaseValido(salarioBase))
        {
            this.salarioBase = salarioBase;
        }
        else
            throw new IllegalArgumentException("Salario Base invalido");
    }
    
    private void setEstadoCivil(EstadoCivil estadoCivil)
    {
        if(estadoCivil!=null)
        {
            this.estadoCivil = estadoCivil;
        }
        else
            throw new IllegalArgumentException("Estado civil no puede ser nulo");
    }

    @Override
    public String toString() {
        return "Empleado{" + "dni=" + dni + ", nombre=" + nombre + ", apellido=" + apellido + ", salarioBase=" + salarioBase + ", estadoCivil=" + estadoCivil + ", hijos=" + hijos + '}';
    }
    
}
