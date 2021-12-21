package Ejercicio8.servicios;

import Ejercicio8.entidades.Cadena;
import java.util.Scanner;

public class Servicios8 {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Cadena crearObjeto() {
        System.out.println("Ingrese una frase: ");
        String frase = leer.next();
        int longitud = frase.length();
        System.out.println("El tamaño de la frase es: " + longitud);
        Cadena c = new Cadena(frase, longitud);
        return c;
    }

    public void mostrarVocales(Cadena m) {
        int vocales;
        vocales = 0;
        for (int i = 0; i < m.getLongitud(); i++) {
            if (m.getFrase().substring(i, i + 1).equals("a") || m.getFrase().substring(i, i + 1).equals("e") || m.getFrase().substring(i, i + 1).equals("i") || m.getFrase().substring(i, i + 1).equals("o") || m.getFrase().substring(i, i + 1).equals("u")) {
                vocales++;
            }
        }
        System.out.println("La cantidad de vocales es: " + vocales);
    }

    public void invertirFrase(Cadena inv) {
        System.out.println("Frase invertida: ");
        for (int i = inv.getLongitud() - 1; i >= 0; i--) {
            System.out.print("" + inv.getFrase().substring(i, i + 1));
        }
        System.out.println("");
    }

    public void vecesRepetido(Cadena vr) {
        int c;
        c = 0;
        System.out.println("Ingrese un caracter: ");
        String caracter = leer.next();
        for (int i = 0; i < vr.getLongitud(); i++) {
            if (vr.getFrase().substring(i, i + 1).equals(caracter)) {
                c++;
            }
        }
        System.out.println("El caracter: (" + caracter + "), se encuentra: " + c++ + " de veces en la frase");
    }

    public void compararLongitud(Cadena cl) {
        System.out.println("Ingrese una nueva frase: ");
        String nuevaf = leer.next();
        int longnf = nuevaf.length();
        System.out.println("La longitud de la frase inicial es: " + cl.getLongitud());
        System.out.println("La longitud de la nueva frase es: " + longnf);
    }

    public void unirFrase(Cadena uf) {
        System.out.println("Ingrese una frase: ");
        String frase2 = leer.next();
        System.out.println("Resultado de las frases unidas: ");
        System.out.println("" + uf.getFrase() + ". " + frase2);

    }

    public void reemplazar(Cadena r) {
        System.out.println("Ingrese una letra: ");
        String letra = leer.next();
        for (int i = 0; i < r.getLongitud(); i++) {
            String newFrase = r.getFrase().substring(i, i + 1).replace("a", letra);
            System.out.print("" + newFrase);
        }
    }
    
    public void contiene(Cadena co){
        System.out.println("Ingresa una letra: ");
        String l = leer.next();
            for (int i = 0; i < co.getLongitud(); i++) {
            if (co.getFrase().substring(i, i + 1).equals(l)) {
                System.out.println("La frase contiene la letra: "+l);
                break;
            }
    }
}
}
