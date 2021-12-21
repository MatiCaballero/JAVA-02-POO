
package Ejercicio3.servicioBaraja;

import Ejercicio3.entidades.Baraja;
import Ejercicio3.entidades.Carta;
import java.util.ArrayList;

public class ServicioBaraja {
    Baraja ba = new Baraja();
    
    ArrayList <Carta> cartas = new ArrayList();
    
    public void barajar(){
    
        for (Carta aux : cartas) {
            System.out.println(aux);
        }
        
    }
    
}
