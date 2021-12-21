package Ejercicio1;

import Ejercicio1.entidades.Perro;
import Ejercicio1.entidades.Persona;
import java.util.Scanner;

public class MainEj1 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        Perro perro1 = new Perro();
        System.out.println("----------------- Ingrese el nombre del primer perro -----------------");
        String nombreperro = leer.next().toUpperCase();
        perro1.setNombre(nombreperro);
        System.out.println("Ingrese la raza del perro: ");
        String raza = leer.next().toUpperCase();
        perro1.setRaza(raza);
        System.out.println("Ingrese la edad del perro: ");
        int edadPerro = leer.nextInt();
        perro1.setEdad(edadPerro);
        System.out.println("Ingrese el tamaño del perro");
        Double tamaño = leer.nextDouble();
        perro1.setTamaño(tamaño);

        Perro perro2 = new Perro();
        System.out.println("----------------- Ingrese el nombre del segundo perro -----------------");
        nombreperro = leer.next().toUpperCase();
        perro2.setNombre(nombreperro);
        System.out.println("Ingrese la raza del perro: ");
        raza = leer.next().toUpperCase();
        perro2.setRaza(raza);
        System.out.println("Ingrese la edad del perro: ");
        edadPerro = leer.nextInt();
        perro2.setEdad(edadPerro);
        System.out.println("Ingrese el tamaño del perro");
        tamaño = leer.nextDouble();
        perro2.setTamaño(tamaño);

        Persona persona1 = new Persona();
        System.out.println("----------------- Ingrese el nombre de la Primer persona: -----------------");
        String nombrePersona = leer.next().toUpperCase();
        persona1.setNombrePersona(nombrePersona);
        System.out.println("Ingrese el apellido de la persona: ");
        String apellido = leer.next().toUpperCase();;
        persona1.setApellido(apellido);
        System.out.println("Ingrese la edad de la persona: ");
        int edad = leer.nextInt();
        persona1.setEdadPersona(edad);
        System.out.println("Ingrese el documento de la persona: ");
        String documento = leer.next().toUpperCase();
        persona1.setDocumento(documento);
        
        //- - - Asignamos el perro 2 a la persona 1- - - -
        
        persona1.setPerro(perro2);

        Persona persona2 = new Persona();
        System.out.println("----------------- Ingrese el nombre de la Segunda persona: -----------------");
        nombrePersona = leer.next().toUpperCase();;
        persona2.setNombrePersona(nombrePersona);
        System.out.println("Ingrese el apellido de la persona: ");
        apellido = leer.next().toUpperCase();;
        persona2.setApellido(apellido);
        System.out.println("Ingrese la edad de la persona: ");
        edad = leer.nextInt();
        persona2.setEdadPersona(edad);
        System.out.println("Ingrese el documento de la persona: ");
        documento = leer.next().toUpperCase();;
        persona2.setDocumento(documento);
        
        //- - - Asignamos el perro 1 a palersona 2 - - -
        
        persona2.setPerro(perro1);

        System.out.println(persona1);
        System.out.println(persona2);

    }
}
