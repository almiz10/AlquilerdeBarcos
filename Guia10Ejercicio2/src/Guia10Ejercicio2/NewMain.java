package Guia10Ejercicio2;

import Guia10Ejercicio1.entidades.Electrodomestico;
import Guia10Ejercicio1.entidades.Lavadora;
import Guia10Ejercicio1.entidades.Televisor;
import java.util.ArrayList;
import java.util.List;


public class NewMain {

    public static void main(String[] args) {
        // creamos la lavadora y mostramos su precio
//       Lavadora lavadora = new Lavadora ();
//       lavadora = lavadora.crearLavadora();
//       Double precio = lavadora.precioFinal(lavadora.getConsumo(),lavadora.getPeso());
//       System.out.println("El precio de la Lavadora es "+precio);
//       
       // creamos la TV y mostramos su precio
//       
//       Televisor t = new Televisor();
//       t = t.crearTelevisor();
//       Double precioTV = t.precioFinal(t.getConsumo(), t.getPrecio());
//        System.out.println("El precio del TV es "+precioTV);
//        
        // creamos un arrayList
        
        List<Electrodomestico> electrodomesticos = new ArrayList();
        Televisor tv1 = new Televisor(40d, true, 40000d, "Azul", 'F', 30d);
        Televisor tv2 = new Televisor(75d, true, 100000d, "negro", 'F', 50d);
        Lavadora Lav1 = new Lavadora(50, 45000d, "negro", 'B', 80d);
        Lavadora Lav2 = new Lavadora(60, 85000d, "negro", 'B', 82d);
        
        electrodomesticos.add(tv1);
        electrodomesticos.add(tv2);
        electrodomesticos.add(Lav1);
        electrodomesticos.add(Lav2);
        System.out.println("");
        Double sumaImportes=0d;
        for (Electrodomestico aux : electrodomesticos) {
            Double importe= aux.precioFinal(aux.getConsumo(), aux.getPeso());
//            System.out.println("El precio del producto es "+importe);
            sumaImportes=+importe;
            if (aux instanceof Lavadora) {
                System.out.println("El precio de la lavadora es "+aux.precioFinal(aux.getConsumo(), aux.getPeso()));
            }
            if (aux instanceof Televisor) {
                System.out.println("El precio dela Televisor es "+aux.precioFinal(aux.getConsumo(), aux.getPeso()));
            }
        }
        
        System.out.println("La suma de todos los electrodomesticos es "+sumaImportes);
        
        
    }
    
}
