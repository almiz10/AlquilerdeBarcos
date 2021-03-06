package barcoapp.entidades;

import java.util.Calendar;


public class Velero extends Barco{
    private Integer nroMastiles; //para veleros

    public Velero(){
        
    }
    public Velero(Integer nroMastiles, String matricula, Double eslora, Integer añoFabricacion) {
        super(matricula, eslora, añoFabricacion);
        this.nroMastiles = nroMastiles;
    }

    public Velero(Integer nroMastiles) {
        this.nroMastiles = nroMastiles;
    }

    public Integer getNroMastiles() {
        return nroMastiles;
    }

    public void setNroMastiles(Integer nroMastiles) {
        this.nroMastiles = nroMastiles;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public Double getEslora() {
        return eslora;
    }

    public void setEslora(Double eslora) {
        this.eslora = eslora;
    }

    public Integer getAñoFabricacion() {
        return añoFabricacion;
    }

    public void setAñoFabricacion(Integer añoFabricacion) {
        this.añoFabricacion = añoFabricacion;
    }
    
    @Override
    public Double mostrarPrecio(Calendar fechaInicio, Calendar fechaFin, Double eslora) {
        Calendar c = Calendar.getInstance();
        c.setTimeInMillis(fechaFin.getTime().getTime() - fechaInicio.getTime().getTime());

        Double precio = (c.get(Calendar.DAY_OF_YEAR)) * (eslora*10);
        return precio;
    }
 
   
}
