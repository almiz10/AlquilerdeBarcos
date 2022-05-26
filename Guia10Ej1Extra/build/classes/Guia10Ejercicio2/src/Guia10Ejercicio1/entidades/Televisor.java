package Guia10Ejercicio1.entidades;

public final class Televisor extends Electrodomestico {

    private Double resolucion;
    private boolean sintonizadorTDT;

    public Televisor() {
    }

    public Televisor(Double resolucion, boolean sintonizadorTDT, Double precio, String color, Character consumo, Double peso) {
        super(precio, color, consumo, peso);
        this.resolucion = resolucion;
        this.sintonizadorTDT = sintonizadorTDT;
    }

    public Double getResolucion() {
        return resolucion;
    }

    public void setResolucion(Double resolucion) {
        this.resolucion = resolucion;
    }

    public boolean isSintonizadorTDT() {
        return sintonizadorTDT;
    }

    public void setSintonizadorTDT(boolean sintonizadorTDT) {
        this.sintonizadorTDT = sintonizadorTDT;
    }

    public Televisor crearTelevisor() {
        Televisor t = new Televisor();
        Electrodomestico e = new Electrodomestico();

        e = crearElectrodomestico();
        System.out.println("Ingrese la resolucion del TV, en pulgadas:");
        t.setResolucion(leer.nextDouble());
        System.out.println("Tiene sintonizador digital? (NO=0; SI=1");
        int sint = leer.nextInt();
        switch (sint) {
            case 0:
                t.sintonizadorTDT = false;
                break;
            case 1:
                t.sintonizadorTDT = true;
                break;
            default:
                System.out.println("El numero no es correcto, se asume que no tiene Sintonizador");
                t.sintonizadorTDT = false;
                break;
        }
        t.setColor(e.getColor());
        t.setConsumo(e.getConsumo());
        t.setPeso(e.getPeso());
        t.setPrecio(e.getPrecio());

        return t;
    }

    @Override
   public Double precioFinal(Character consumo, Double peso){
        Double precio = super.precioFinal(consumo, peso);
        if(resolucion>40){
            precio = precio*1.3;
//            System.out.println("se añadio un 30%, por tener una resoluacion mayor a 40 pulgadas");
        }
        if(sintonizadorTDT==true){
            precio = precio+500;
//            System.out.println("se añadieron 500 pesos, por tener sintonizador");
        }
        return precio;
    } 

}
