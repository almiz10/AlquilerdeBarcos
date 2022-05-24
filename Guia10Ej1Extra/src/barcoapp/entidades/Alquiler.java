package barcoapp.entidades;

import barcoapp.enums.TipoBarco;
import java.util.Calendar;


public final class Alquiler {
   private String nombre;
   private Integer documento;
   private Calendar fechaAlquiler;
   private Calendar fechaDevolucion;
   private Integer posicionDeAmarre;
   private Barco barco;

    public Alquiler() {
    }

    public Alquiler(String nombre, Integer documento, Calendar fechaAlquiler, Calendar fechaDevolucion, Integer posicionDeAmarre, Barco barco) {
        this.nombre = nombre;
        this.documento = documento;
        this.fechaAlquiler = fechaAlquiler;
        this.fechaDevolucion = fechaDevolucion;
        this.posicionDeAmarre = posicionDeAmarre;
        this.barco = barco;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getDocumento() {
        return documento;
    }

    public void setDocumento(Integer documento) {
        this.documento = documento;
    }

    public Calendar getFechaAlquiler() {
        return fechaAlquiler;
    }

    public void setFechaAlquiler(Calendar fechaAlquiler) {
        this.fechaAlquiler = fechaAlquiler;
    }

    public Calendar getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(Calendar fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    public Integer getPosicionDeAmarre() {
        return posicionDeAmarre;
    }

    public void setPosicionDeAmarre(Integer posicionDeAmarre) {
        this.posicionDeAmarre = posicionDeAmarre;
    }

    public Barco getBarco() {
        return barco;
    }

    public void setBarco(Barco barco) {
        this.barco = barco;
    }

    @Override
    public String toString() {
        return "Alquiler{" + "nombre=" + nombre + ", documento=" + documento + ", fechaAlquiler=" + fechaAlquiler + ", fechaDevolucion=" + fechaDevolucion + ", posicionDeAmarre=" + posicionDeAmarre + ", barco=" + barco + '}';
    }
   
}
