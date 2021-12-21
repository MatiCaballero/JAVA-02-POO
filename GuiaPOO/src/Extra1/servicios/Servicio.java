package Extra1.servicios;

import Extra1.entidades.Cancion;
import java.util.Scanner;

public class Servicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Cancion crear() {
        System.out.println("Ingrese el titulo de la cancion: ");
        String titulo = leer.next();
        System.out.println("Ingrese el autor de la cancion: ");
        String autor = leer.next();
        Cancion c = new Cancion(titulo, autor);
        return c;
    }
    
    public void mostrar(Cancion ca){
        System.out.println("El nombre de la cancion es: "+ca.getTitulo());
        System.out.println("El autor de la cancion es: "+ca.getAutor());
    }
}
