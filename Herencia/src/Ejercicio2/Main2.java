
package Ejercicio2;

import Ejercicio2.entidades.Electrodomestico;
import Ejercicio2.entidades.Lavadora;

public class Main2 {

    
    public static void main(String[] args) {
        
        Electrodomestico ele = new Electrodomestico();
        Lavadora lava = new  Lavadora();
        
        ele.crearElectrodomestico();
        ele.precioFinal(ele);
        
        System.out.println("---------------------------------------------------------------------------------------------------------------------");
        
        lava.crearLavadora();
    }
    
}
