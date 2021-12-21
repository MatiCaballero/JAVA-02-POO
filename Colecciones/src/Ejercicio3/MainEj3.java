package Ejercicio3;

import Ejercicio3.entidades.Alumno;
import Ejercicio3.servicios.Servicios3;
import java.util.Scanner;

public class MainEj3 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Servicios3 se = new Servicios3();
        
        String op;
        op = null;
        do {
            System.out.println("¿Desea crear un alumno?");
            op = leer.next();
            if (op.equalsIgnoreCase("si")) {
             Alumno a = se.crearAlumno();
             se.agregarAlumno(a);
            }
        } while (op.equalsIgnoreCase("si"));

        se.notaFinal();

    }

}
//  String op;
//        op=null;
//        do{
//            ArrayList<Alumno> Alumno = new ArrayList<>();
//            System.out.println("Ingrese el nombre del alumno: ");
//            String nombre = leer.next();
//            System.out.println("Ingrese la nota 1.");
//            int nota1 = leer.nextInt();
//            System.out.println("Ingrese la nota 2.");
//            int nota2 = leer.nextInt();
//            System.out.println("Ingrese la nota 3.");
//            int nota3 = leer.nextInt();
//
//
//        System.out.println("¿Desea crear otro alumno?");
//            op = leer.next();
//
        //        } while (op.equals("si"));
