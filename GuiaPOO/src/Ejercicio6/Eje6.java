
package Ejercicio6;


import Ejercicio6.entidades.Cafetera;
import Ejercicio6.servicios.Servicio;

public class Eje6 {

    public static void main(String[] args) {
        Servicio s = new Servicio();
        Cafetera c = s.llenarCafetera();
        s.llenarCafetera();
        s.servirTaza(c);
        s.vaciarCafetera(c);
        s.agregarCafe(c);
        
    }
    
}
