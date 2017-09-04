/**
 * PRIMER EXAMEN PARCIAL POO
 * @author Luis Fernando Herrera Gonzalez
 */

public class Vehiculo
{
    private String placas;
    private String horallegada;
    private String minutosllegada;
    
    public Vehiculo(String placas, String horallegada, String minutosllegada)
    {
        this.placas=placas;
        this.horallegada=horallegada;
        this.minutosllegada=minutosllegada;
    }
    
    public String dimePlacas()
    {
        return placas;
    }
    
    public String dimeHoraLlegada()
    {
        String cadResultado="";
        
        cadResultado+=horallegada;
        cadResultado+=" : ";
        cadResultado+=minutosllegada;
        
        return cadResultado;
    }
}