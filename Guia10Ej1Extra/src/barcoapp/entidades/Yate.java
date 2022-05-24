package barcoapp.entidades;


public final class Yate extends BarcoMotor{
    private Integer nroCamarotes; //para yates de lujo

    public Yate(Integer nroCamarotes, Integer potenciaCV, String matricula, Double eslora, Integer añoFabricacion) {
        super(potenciaCV, matricula, eslora, añoFabricacion);
        this.nroCamarotes = nroCamarotes;
    }

    public Yate(Integer nroCamarotes, Integer potenciaCV) {
        super(potenciaCV);
        this.nroCamarotes = nroCamarotes;
    }
    
    public Yate(){
        
    }
}
