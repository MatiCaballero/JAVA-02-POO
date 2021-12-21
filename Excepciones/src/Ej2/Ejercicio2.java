
package Ej2;

public class Ejercicio2 {

    public static void main(String[] args) {
        
        int array [] = new int [2];
//        for (int i = 0; i < 2; i++) {
//            array[i] = (int)(Math.random()*100+1);
//        }
//        System.out.println("El array  se inicializo de forma correcta.");
//        
        try{
        for (int i = 0; i < 3; i++) {
            array[i] = (int)(Math.random()*100+1);
        }
        }catch(Exception e){
            System.out.println("El indice del arreglo esta fuera del rango.");
        };
    }
    
}
