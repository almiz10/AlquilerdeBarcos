package barcoapp.servicios;

import barcoapp.entidades.Alquiler;
import barcoapp.entidades.Barco;
import barcoapp.entidades.BarcoMotor;
import barcoapp.entidades.Velero;
import barcoapp.entidades.Yate;
import barcoapp.enums.TipoBarco;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class AlquilerServicio {

    private Scanner leer = new Scanner(System.in).useDelimiter("\n");
    Barco barco;
    public Alquiler crearAlquiler() {

//        Alquiler nuevoAlquiler = new Alquiler();
//        System.out.println("Ingrese su nombre");
//        nuevoAlquiler.setNombre(leer.next());
//        System.out.println("Ingrese su documento");
//        nuevoAlquiler.setDocumento(leer.nextInt());
//        System.out.println("Ingrese la fecha de inicio");
//        nuevoAlquiler.setFechaAlquiler(leer.;
        Calendar fechaInicio = new GregorianCalendar(2022, 6, 30);
        Calendar fechafin = new GregorianCalendar(2022, 7, 20);

        Alquiler nuevoAlquiler = new Alquiler();
        nuevoAlquiler.setBarco(barco);
        nuevoAlquiler.setDocumento(28773804);
        nuevoAlquiler.setNombre("dalmo");
        nuevoAlquiler.setPosicionDeAmarre(3);
        nuevoAlquiler.setFechaAlquiler(fechaInicio);
        nuevoAlquiler.setFechaDevolucion(fechafin);

        return nuevoAlquiler;
    }

    public Barco menuInicio() {
        System.out.println("Ingrese el tipo de barco\n");
        System.out.println("1. Velero");
        System.out.println("2. Barco a Motor");
        System.out.println("3. Yate de Lujo");
        int tipo = leer.nextInt();

        switch (tipo) {
            case 1:
                barco=crearVelero();
                break;
            case 2:
                barco = crearBarcoAMotor();
                break;
            case 3:
                barco = crearYateDeLujo();
                break;
            default:
                System.out.println("La opcion no es valida");
                break;
        }
        return barco;
    }

    public Velero crearVelero() {
        Velero velero = new Velero();
        System.out.println("Ingrese Eslora, Matricula, año de fabricacion y cant de mastiles (en orden)  ");
        Double eslora = leer.nextDouble();
        String matricula = leer.next();
        Integer anio = leer.nextInt();
        Integer cantMastiles = leer.nextInt();

        velero = new Velero(cantMastiles, matricula, eslora, anio);

        return velero;
    }
    
    public BarcoMotor crearBarcoAMotor() {
        BarcoMotor barcoAMotor = new BarcoMotor();
        System.out.println("Ingrese Eslora, Matricula, año de fabricacion y CV de Potencia (en orden)  ");
        Double eslora = leer.nextDouble();
        String matricula = leer.next();
        Integer anio = leer.nextInt();
        Integer caballosDeFuerza = leer.nextInt();

        barcoAMotor = new BarcoMotor(caballosDeFuerza, matricula, eslora, anio);

        return barcoAMotor;
    }
    
      public Yate crearYateDeLujo() {
        Yate yate = new Yate();
        System.out.println("Ingrese Eslora, Matricula, año de fabricacion,CV de Potencia y nros de camarotes (en orden)  ");
        Double eslora = leer.nextDouble();
        String matricula = leer.next();
        Integer anio = leer.nextInt();
        Integer caballosDeFuerza = leer.nextInt();
        Integer camarotes = leer.nextInt();
        
        yate = new Yate(camarotes, caballosDeFuerza, matricula, eslora, anio);

        return yate;
    }
      
      public Double calcularPrecio(Calendar fechaInicio, Calendar fechaFin, Double eslora){
          Calendar c = Calendar.getInstance();
          c.setTimeInMillis(fechaFin.getTime().getTime()-fechaInicio.getTime().getTime());
          
          Double precio = (c.get(Calendar.DAY_OF_YEAR))*eslora;
          return precio;
}
      
}
