package Ejercicio11;

import java.util.Date;
import java.util.Scanner;

public class Ej11 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int anio, mes, dia;
        int diferencia;
        System.out.println("Ingresa un dia: (dd) ");
        dia = leer.nextInt();
        System.out.println("Ingresa un mes: (mm) ");
        mes = leer.nextInt();
        System.out.println("Ingresa un año: (aaaa) ");
        anio = leer.nextInt();

        Date fecha1 = new Date(anio - 1900, mes - 1, dia);
        Date fecha2 = new Date();
        if (fecha1.getYear() > fecha2.getYear()) {
            diferencia = fecha1.getYear() - fecha2.getYear();
        } else {
            diferencia = fecha2.getYear() - fecha1.getYear();

        }
        System.out.println("La diferencia de años entre las dos fechas es: "+diferencia+" años.");

    }

}
