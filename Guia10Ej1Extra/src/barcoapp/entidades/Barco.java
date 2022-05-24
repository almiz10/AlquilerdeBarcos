package barcoapp.entidades;

import java.util.Calendar;

public class Barco {

    protected String matricula;
    protected Double eslora;
    protected Integer añoFabricacion;

    public Barco(String matricula, Double eslora, Integer añoFabricacion) {
        this.matricula = matricula;
        this.eslora = eslora;
        this.añoFabricacion = añoFabricacion;
    }

    public Barco() {
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

    public Double mostrarPrecio(Calendar fechaInicio, Calendar fechaFin, Double eslora) {
        Calendar c = Calendar.getInstance();
        c.setTimeInMillis(fechaFin.getTime().getTime() - fechaInicio.getTime().getTime());

        Double precio = (c.get(Calendar.DAY_OF_YEAR)) * eslora;
        return precio;
    }

}
