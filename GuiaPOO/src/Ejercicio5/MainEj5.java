package Ejercicio5;

import Ejercicio5.entidades.Cuenta;
import Ejercicio5.servicios.Servicio;
import java.util.Scanner;

public class MainEj5 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Servicio s1 = new Servicio();
        Cuenta c1 = s1.crearCuenta();
        s1.ingreso(c1);
        s1.retiro(c1);
        s1.extraccionRapida(c1);
        s1.consultarSaldo(c1);
        s1.datos(c1);
    }
}
