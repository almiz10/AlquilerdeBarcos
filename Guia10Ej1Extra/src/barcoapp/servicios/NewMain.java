package barcoapp.servicios;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author Dalmiro
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Calendar c= Calendar.getInstance();
        Calendar fechaInicio = new GregorianCalendar(2022, 6, 30);
        Calendar fechafin = new GregorianCalendar(2022, 7, 20);
        c.setTimeInMillis(fechafin.getTime().getTime()-fechaInicio.getTime().getTime());
        System.out.println(c.get(Calendar.DAY_OF_YEAR));
        
    }
    
}
