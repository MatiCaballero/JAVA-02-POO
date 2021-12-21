
package Extra1;

import Extra1.entidades.Cancion;
import Extra1.servicios.Servicio;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
               Scanner leer = new Scanner(System.in).useDelimiter("\n");
               Servicio se = new Servicio();
               Cancion c = se.crear();
               se.mostrar(c); 
    }
    
}
