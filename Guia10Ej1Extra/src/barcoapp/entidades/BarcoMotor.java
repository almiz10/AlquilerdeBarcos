package barcoapp.entidades;


public class BarcoMotor extends Barco {
    private Integer potenciaCV;  

    public BarcoMotor(Integer potenciaCV, String matricula, Double eslora, Integer añoFabricacion) {
        super(matricula, eslora, añoFabricacion);
        this.potenciaCV = potenciaCV;
    }

    public BarcoMotor(Integer potenciaCV) {
        this.potenciaCV = potenciaCV;
    }
    
    public BarcoMotor(){
        
    }
}
