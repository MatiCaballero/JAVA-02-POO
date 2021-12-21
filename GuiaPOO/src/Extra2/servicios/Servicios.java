package Extra2.servicios;

import Extra2.entidades.Puntos;
import java.util.Scanner;

public class Servicios {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Puntos crearPuntos() {
        System.out.println("Ingrese el punto x1: ");
        int x1 = leer.nextInt();
        System.out.println("Ingrese el punto y1: ");
        int y1 = leer.nextInt();
        System.out.println("Ingrese el punto x2: ");
        int x2 = leer.nextInt();
        System.out.println("Ingrese el punto y2: ");
        int y2 = leer.nextInt();

        Puntos p = new Puntos(x1, x2, y1, y2);
        return p;

    }
    
    public void calcularDistancia (Puntos cd){
    double distancia;
    
    distancia = Math.sqrt((Math.pow(cd.getX2()-cd.getX1(),2))+Math.pow(cd.getY2()-cd.getY1(),2));
    
        System.out.println("La distancia entre los puntos es: "+distancia);
    
    }
    
    
}
