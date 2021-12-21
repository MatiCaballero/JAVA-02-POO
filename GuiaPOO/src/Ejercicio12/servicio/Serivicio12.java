package Ejercicio12.servicio;

import Ejercicio12.entidades.Persona12;
import java.util.Date;
import java.util.Scanner;

public class Serivicio12 {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Persona12 crearPersona() {

        System.out.println("Ingrese nombre: ");
        String nombre = leer.next();
        System.out.println("Ingrese dia de nacimiento: ");
        int dia = leer.nextInt();
        System.out.println("Ingrese mes de nacimiento: ");
        int mes = leer.nextInt();
        System.out.println("Ingrese año de nacimiento: ");
        int anio = leer.nextInt();

        Date fecha = new Date(anio - 1900, mes - 1, dia);

        Persona12 p = new Persona12(nombre, fecha);

        return p;
    }

    public void calcularEdad(Persona12 ce) {
        Date fecha2 = new Date();
        int edad;
        if (fecha2.getYear() > ce.getFecha().getYear()) {
            if (fecha2.getMonth() > ce.getFecha().getMonth()) {
                edad = fecha2.getYear() - ce.getFecha().getYear();
            } else {
                edad = edad = fecha2.getYear() - ce.getFecha().getYear() - 1;
            }
        } else {
            edad = ce.getFecha().getYear() - fecha2.getYear();
        }
        System.out.println("La edad es: " + edad);
    }
    
    public void mostrarPersona (Persona12 mp){
                Date fecha2 = new Date();
        int edad;
        if (fecha2.getYear() > mp.getFecha().getYear()) {
            if (fecha2.getMonth() > mp.getFecha().getMonth()) {
                edad = fecha2.getYear() - mp.getFecha().getYear();
            } else {
                edad = edad = fecha2.getYear() - mp.getFecha().getYear() - 1;
            }
        } else {
            edad = mp.getFecha().getYear() - fecha2.getYear();
        }
        System.out.println("El nombre de la persona creada es: "+mp.getNombre());
        System.out.println("La edad de la persona es: "+edad);
    }

}
