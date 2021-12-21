package Ejercicio2;

import Ejercicio2.entidades.Circunferencia;
import Ejercicio2.servicio.ServicioCircunferencia;

public class CircunferenciaMain {

    public static void main(String[] args) {
        ServicioCircunferencia sc = new ServicioCircunferencia();
        Circunferencia m1 = sc.crearCircunferencia();

        sc.Area(m1);
        sc.Perimetro(m1);
    }

}
