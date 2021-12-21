package Ejercicio3.servicios;

import Ejercicio3.entidades.Operacion;
import java.util.Scanner;

public class Servicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Operacion crearOperacion() {
        System.out.println("Ingrese el primer numero:");
        int numero1 = leer.nextInt();
        System.out.println("Ingrese el segundo numero:");
        int numero2 = leer.nextInt();
        Operacion n1 = new Operacion(numero1, numero2);
        return n1;
    }

    public void Suma(Operacion s) {
        int sum = s.getNumero1() + s.getNumero2();
        System.out.println("La suma de los numeros es: " + sum);
    }

    public void Resta(Operacion r) {
        int res = r.getNumero1() - r.getNumero2();
        System.out.println("La resta de los numeros es: " + res);
    }

    public void Multiplicacion(Operacion m) {
        if (m.getNumero1() != 0 && m.getNumero2() != 0) {
            int mul = m.getNumero1() * m.getNumero2();
            System.out.println("La multiplicacion de los dos numeros es: " + mul);
        } else {
            System.out.println("ERROR. El resultado de la multiplicacion es 0.");
        }
    }

    public void Division(Operacion d) {
        if (d.getNumero1() != 0 && d.getNumero2() != 0) {
            int div = d.getNumero1() / d.getNumero2();
            System.out.println("La multiplicacion de los dos numeros es: " + div);
        } else {
            System.out.println("ERROR. Se dividio por 0.");
        }

    }

}
