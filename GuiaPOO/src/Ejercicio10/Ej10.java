package Ejercicio10;

import java.util.Arrays;

public class Ej10 {

    public static void main(String[] args) {
        int arregloa[] = new int[50];
        double arreglob[] = new double[20];
        for (int i = 0; i < 50; i++) {
            arregloa[i] = (int) (Math.random() * 100 + 1);
        }
        System.out.println(" Arreglo 1.");
        for (int i = 0; i < 50; i++) {
            System.out.print(" (" + arregloa[i] + ") ");
        }
        System.out.println("");

        System.out.println("- - Arreglo ordenado de menor a mayor -  -");
        Arrays.sort(arregloa);
        for (int i = 0; i < 50; i++) {
            System.out.print(" (" + arregloa[i] + ") ");
        }
                System.out.println("");


        for (int i = 0; i < 10; i++) {
            arreglob[i] = arregloa[i];
        }
        for (int i = 10; i < 20; i++) {
            arreglob[i] = 0.5;
        }
        System.out.println("--- Arreglo 2 ---");
        
        for (int i = 0; i < 20; i++) {
            System.out.print(" (" + arreglob[i] + ") ");
        }

    }

}
