package Ejercicio3;

import Ejercicio3.entidades.Operacion;
import Ejercicio3.servicios.Servicio;

public class MainEj3 {

    public static void main(String[] args) {
        Servicio s1 = new Servicio();
        Operacion o1 = s1.crearOperacion();
        s1.Suma(o1);
        s1.Resta(o1);
        s1.Multiplicacion(o1);
        s1.Division(o1);
    }

}
