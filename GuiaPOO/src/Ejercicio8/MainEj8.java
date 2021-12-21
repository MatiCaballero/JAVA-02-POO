package Ejercicio8;

import Ejercicio8.entidades.Cadena;
import Ejercicio8.servicios.Servicios8;
import java.util.Scanner;

public class MainEj8 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Servicios8 s = new Servicios8();
        Cadena c = s.crearObjeto();
        int op;
        do {
            System.out.println("Elija una opcion: ");
            System.out.println("1) Muestra las vocales que desea.");
            System.out.println("2) Invierte la frase.");
            System.out.println("3) Ingresa una letra y muestra la cantidad de veces que se repite.");
            System.out.println("4) Compara longitud entre frases.");
            System.out.println("5) Une frases.");
            System.out.println("6) Remplaza una letra.");
            System.out.println("7) Contiene letra.");
            System.out.println("8) Salir.");
            op = leer.nextInt();
            switch (op) {
                case (1):
                    System.out.println(" - - - - - - - - - - - - - - - - - - - - - - - - - - - - - ");
                    s.mostrarVocales(c);
                    System.out.println(" - - - - - - - - - - - - - - - - - - - - - - - - - - - - - ");
                    break;
                case (2):
                    System.out.println(" - - - - - - - - - - - - - - - - - - - - - - - - - - - - - ");
                    s.invertirFrase(c);
                    System.out.println(" - - - - - - - - - - - - - - - - - - - - - - - - - - - - - ");
                    break;
                case (3):
                    System.out.println(" - - - - - - - - - - - - - - - - - - - - - - - - - - - - - ");
                    s.vecesRepetido(c);
                    System.out.println(" - - - - - - - - - - - - - - - - - - - - - - - - - - - - - ");
                    break;
                case (4):
                    System.out.println(" - - - - - - - - - - - - - - - - - - - - - - - - - - - - - ");
                    s.compararLongitud(c);
                    System.out.println(" - - - - - - - - - - - - - - - - - - - - - - - - - - - - - ");
                    break;
                case (5):
                    System.out.println(" - - - - - - - - - - - - - - - - - - - - - - - - - - - - - ");
                    s.unirFrase(c);
                    System.out.println(" - - - - - - - - - - - - - - - - - - - - - - - - - - - - - ");
                    break;
                case (6):
                    System.out.println(" - - - - - - - - - - - - - - - - - - - - - - - - - - - - - ");
                    s.reemplazar(c);
                    System.out.println(" - - - - - - - - - - - - - - - - - - - - - - - - - - - - - ");
                    break;
                case (7):
                    System.out.println(" - - - - - - - - - - - - - - - - - - - - - - - - - - - - - ");
                    s.contiene(c);
                    System.out.println(" - - - - - - - - - - - - - - - - - - - - - - - - - - - - - ");
                    break;
                default: 
                    System.out.println("Ingreso una opcion incorrecta, vuelva a intentar.");
            }
        } while (op!=8);
        
    
    }

}
