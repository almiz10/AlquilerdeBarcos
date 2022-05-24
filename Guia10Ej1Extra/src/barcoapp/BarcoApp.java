package barcoapp;

import barcoapp.entidades.Alquiler;
import barcoapp.entidades.Barco;
import barcoapp.entidades.BarcoMotor;
import barcoapp.entidades.Velero;
import barcoapp.entidades.Yate;
import barcoapp.enums.TipoBarco;
import barcoapp.servicios.AlquilerServicio;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

/**
 *
 * @author Dalmiro
 */
public class BarcoApp {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // creamos un alquier
        Double aux = 0d;
        AlquilerServicio alquilerServicio = new AlquilerServicio();
        
        if (alquilerServicio.menuInicio() instanceof Velero) {
            Velero velero = alquilerServicio.crearVelero();
            aux= 12d;
        if (alquilerServicio.menuInicio() instanceof BarcoMotor) {
            BarcoMotor barcoMotor = alquilerServicio.crearBarcoAMotor();
            aux= 12d;
        if (alquilerServicio.menuInicio() instanceof Yate) {
            Yate yate = alquilerServicio.crearYateDeLujo();
            aux= 12d;
        } 
        
          Alquiler alquiler = alquilerServicio.crearAlquiler(); // creamos un objeto alquiler que va a tener los datos fecha inicio, fin, eslora, etc
          Double precio = alquilerServicio.calcularPrecio(alquiler.getFechaAlquiler(), alquiler.getFechaDevolucion(), alquiler.getBarco().getEslora());
          System.out.println("El precio del alquiler es :\n");
          System.out.println(precio+aux);
          
    
}
}