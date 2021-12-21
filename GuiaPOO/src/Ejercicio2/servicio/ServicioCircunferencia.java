package Ejercicio2.servicio;

import Ejercicio2.entidades.Circunferencia;
import java.util.Scanner;

public class ServicioCircunferencia {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Circunferencia crearCircunferencia() {

        System.out.println("Ingrese el radio: ");
        int radio = leer.nextInt();
        Circunferencia sl = new Circunferencia(radio);
        return sl;

    }

    public void Area(Circunferencia r) {
        int area = (int) (Math.PI * Math.pow(r.getRadio(), 2));
        System.out.println("El valor del AREA es: " + area);
    }

    public void Perimetro(Circunferencia p) {
        int perimetro = (int) (2 * Math.PI * p.getRadio());
        System.out.println("El valor del PERIMETRO es: "+perimetro);
    }

}
