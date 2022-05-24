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

public class BarcoApp {

   
    
    public static void main(String[] args) {
        // creamos un alquier
        Double aux=0d;
        AlquilerServicio alquilerServicio = new AlquilerServicio();
        
         
        
          Alquiler alquiler = alquilerServicio.crearAlquiler(); // creamos un objeto alquiler que va a tener los datos fecha inicio, fin, eslora, etc
          //chequeamos de qué tipo es el barco creado y llamamos al metodo mostrar precio de ese tipo
          
          if (alquiler.getBarco() instanceof Velero) {
            Velero velero = new Velero();
            velero.setNroMastiles(alquiler.getBarco().);
              aux = velero.mostrarPrecio(alquiler.getFechaAlquiler(), alquiler.getFechaDevolucion(), alquiler.getBarco().getEslora(), alquiler.getBarco());
            
        }
          
          System.out.println("El precio del alquiler es :\n");
          System.out.println(aux);
          
    
}
}