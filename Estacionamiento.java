/**
 * PRIMER EXAMEN PARCIAL POO
 * @author Luis Fernando Herrera Gonzalez
 */

public class Estacionamiento
{
    Vehiculo []estacionamiento;
    
    public Estacionamiento(int Capacidad)
    {
        Estacionamiento= new [Capacidad] estacionamiento;
    }
    
    public boolean BuscaVehiculo(String placas,)
    {
        for(int i=0; i<estacionamiento.length;i++)
        {
            if(estacionamiento[i].dimePlacas == placas)
            {
                return true;
                
            }
            
            
            
    