package Guia10Ejercicio1.entidades;

import com.sun.xml.internal.bind.v2.runtime.output.SAXOutput;
import java.util.Scanner;

/**
 *
 * @author Dalmiro
 */
public class Electrodomestico {

    protected Double precio;
    protected String color;
    protected Character consumo;
    protected Double peso;
    protected Scanner leer = new Scanner (System.in).useDelimiter("\n");
    public Electrodomestico() {
    }

    public Electrodomestico(Double precio, String color, Character consumo, Double peso) {
        this.precio = precio;
        this.color = color;
        this.consumo = consumo;
        this.peso = peso;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Character getConsumo() {
        return consumo;
    }

    public void setConsumo(Character consumo) {
        this.consumo = consumo;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public Character comprobarConsumoEnergetico(char letra) {
        if (letra == 'A' || letra == 'B' || letra == 'C' || letra == 'D' || letra == 'E' || letra == 'F') {
            return letra;

        } else {
            return 'F';
        }
    }

    public String comprobarColor(String color) {
        if (color.equalsIgnoreCase("blanco") || color.equalsIgnoreCase("negro") || color.equalsIgnoreCase("rojo")
                || color.equalsIgnoreCase("azul") || color.equalsIgnoreCase("gris")) {
            return color;

        } else {
            return "Blanco";
        }
    }
    
    
    
    public Double precioFinal(Character consumo, Double peso){
        Double precio = 1000d;
        if(consumo=='A'){
            precio=precio+1000;
        } 
        if (consumo=='B'){
            precio=precio+800;
        }
        if (consumo=='C'){
            precio=precio+600;
        }
        if (consumo=='D'){
            precio=precio+500;
        }
        if (consumo.charValue()=='E'){
            precio=precio+300;
        }
        if (consumo.charValue()=='F'){
            precio=100d+precio;
            
        }
        if (peso>1d && peso<19d){
            precio+=100;
        }
        if (peso>20d && peso<49d){
            precio+=500;
        }
        if (peso>50d && peso<79d){
            precio+=800;
        }
        if (peso>80d){
            precio+=1000;
        }
        return precio;
    }
    
      public Electrodomestico crearElectrodomestico(){
        
        System.out.println("CREADOR DE ELECTRODOMESTICOS\n");
       
        System.out.println("Ingrese el color");
        String c = leer.next();
        System.out.println("Ingrese la categoria de eficiencia energetica (A-F)");
        Character cons = leer.next().charAt(0);
        System.out.println("Ingrese el Peso");
        Double p = leer.nextDouble();
        
// instanciamos el objeto        
// hacemos las comprobaciones de color y de eficiencia con las funciones
        Electrodomestico e1 = new Electrodomestico();
        String color = e1.comprobarColor(c);
        Character consumo = e1.comprobarConsumoEnergetico(cons);
        Double precio = e1.precioFinal(consumo, p);
// despues de comprobar, ahora si le pasamos los valores
        
        e1.setColor(color);
        e1.setConsumo(consumo);
        e1.setPeso(p);
        e1.setPrecio(precio);
        return e1;
    }
    

    @Override
    public String toString() {
        return "Electrodomestico{" + "precio=" + precio + ", color=" + color + ", consumo=" + consumo + ", peso=" + peso + '}';
    }
    
}
