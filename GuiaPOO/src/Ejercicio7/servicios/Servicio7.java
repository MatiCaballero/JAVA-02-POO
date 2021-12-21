package Ejercicio7.servicios;

import Ejercicio7.entidades.Persona;
import java.util.Scanner;

public class Servicio7 {

    public Persona crearPersona() {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int c;
        String sexo;
        System.out.println("Ingrese nombre:");
        String nombre = leer.next();
        System.out.println("Ingrese edad:");
        int edad = leer.nextInt();
        System.out.println("Ingrese Sexo (H:Hombre, M:Mujer, O:otro)");
        sexo = leer.next();
        do {
            if (!sexo.equals("h") && !sexo.equals("m") && !sexo.equals("o")) {
                System.out.println("Error. Vuelva a ingresar sexo");
                sexo = leer.next();
            }
        } while (!sexo.equals("h") && !sexo.equals("m") && !sexo.equals("o"));

        System.out.println("Ingrese peso:");
        int peso = leer.nextInt();
        System.out.println("Ingrese altura: ");
        int altura = leer.nextInt();

        Persona pe = new Persona(nombre, edad, sexo, peso, altura);
        return pe;
    }

    public int calcularMC(Persona m, int peso) {
        double metro = (double) m.getAltura() / 100;
        System.out.println(+metro);
        double formula = (m.getPeso()) / (metro * metro);
        if (formula < 20) {
            peso = -1;
            System.out.println("Se encuentra por debajo del peso ideal.");
        }
        if (formula >= 20 && formula <= 25) {
            peso = 0;
            System.out.println("Se encuentra en su peso ideal.");
        }
        if (formula > 25) {
            peso = 1;
            System.out.println("Se encuentra en sobre peso.");
        }
        return peso;
    }
    
    public boolean esMayorDeEdad(Persona me,boolean mayor){
    if (me.getEdad()>=18){
        mayor = true;
        System.out.println("La persona es mayor de edad.");
    } else {
        mayor = false;
        System.out.println("La persona es menor de edad.");
    }
    return mayor;
    }

}
