package Ejercicio6.servicios;

import Ejercicio6.entidades.Cafetera;
import java.util.Scanner;

public class Servicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Cafetera llenarCafetera() {
        int capacidadMaxima = 100;
        int cantidadActual = capacidadMaxima;

        Cafetera c = new Cafetera(capacidadMaxima, cantidadActual);

        return c;
    }

    public void servirTaza(Cafetera st) {
        System.out.println("Ingrese el tamaño de la taza: ");
        int tamaño = leer.nextInt();
        if (tamaño > st.getCantidadActual()) {
            System.out.println("No se pudo llenar la taza, se lleno en: " + st.getCantidadActual());
            st.setCantidadActual(0);
        } else {
            System.out.println("La taza se llenó correctamente.");
            st.setCantidadActual(st.getCantidadActual()-tamaño);
        }
    }
    
    public void vaciarCafetera(Cafetera vc){
        vc.setCantidadActual(0);
        System.out.println("La cafetera se vació correctamente: "+vc.getCantidadActual());
    }
    
    public void agregarCafe (Cafetera ac){
        System.out.println("Ingrese la cantidad de cafe que desea añadir: ");
        int cantidad = leer.nextInt();
        ac.setCantidadActual(ac.getCantidadActual()+cantidad);
        System.out.println("La cafetera quedo con la capacidad  de cafe en: "+ac.getCantidadActual());
    }
    
}
