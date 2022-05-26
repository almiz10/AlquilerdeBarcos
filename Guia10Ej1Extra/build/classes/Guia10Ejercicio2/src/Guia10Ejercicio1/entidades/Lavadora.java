package Guia10Ejercicio1.entidades;

public final class Lavadora extends Electrodomestico{
    private Integer carga;

    public Lavadora() {
    }

   
    public Lavadora(Integer carga, Double precio, String color, Character consumo, Double peso) {
        super(precio, color, consumo, peso);
        this.carga = carga;
    }

    public Integer getCarga() {
        return carga;
    }

    public void setCarga(Integer carga) {
        this.carga = carga;
    }

    public Lavadora crearLavadora(){
        Lavadora l = new Lavadora();
        Electrodomestico e = new Electrodomestico();
        e = crearElectrodomestico();
        System.out.println("Ingrese los kilos de carga)");
        Integer carga = leer.nextInt(); 
        l.setColor(e.getColor());
        l.setConsumo(e.getConsumo());
        l.setPeso(e.getPeso());
        l.setPrecio(e.getPrecio());
        l.setCarga(carga);
        
        return l;
    }

    @Override
    public Double precioFinal(Character consumo, Double peso){
        Double precio = super.precioFinal(consumo, peso);
        if(carga>30){
            precio = precio + 500;
//            System.out.println("se añadieron 500 pesos, por tener una carga de mas de 30kilos");
        } else {
            precio = precio;
        }
        return precio;
    } 
    
}
