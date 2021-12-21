package Ejercicio7;

import Ejercicio7.entidades.Persona;
import Ejercicio7.servicios.Servicio7;

public class Ej7 {

    public static void main(String[] args) {
        int pe1, pe2, pe3, m, me;
        pe1 = 0;
        pe2 = 0;
        pe3 = 0;
        m = 0;
        me = 0;
        Servicio7 s = new Servicio7();
        for (int i = 1; i < 5; i++) {
            System.out.println("Persona n°: " + i);
            Persona p = s.crearPersona();
            int peso1 = s.calcularMC(p, 0);
            System.out.println(+peso1);
            boolean edad1 = s.esMayorDeEdad(p, true);
            System.out.println(edad1);

            if (peso1 == -1) {
                pe1++;
            }
            if (peso1 == 0) {
                pe2++;
            }
            if (peso1 == 1) {
                pe3++;
            }
            if (edad1 = true) {
                m++;
            } else {
                m--;
            }
            System.out.println(+pe1 + "   " + pe2 + "   " + pe3);
        }
        System.out.println("Porcentaje por debajo de su peso: " + (pe1 * 100) / 4 + "%");
        System.out.println("Porcentaje por debajo de su peso: " + (pe2 * 100) / 4 + "%");
        System.out.println("Porcentaje por debajo de su peso: " + (pe3 * 100) / 4 + "%");
        System.out.println("Hay " + m + " mayores de edad.");
        System.out.println("Hay " + me + " menores de edad.");

    }

}
