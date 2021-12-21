
package Extra2;

import Extra2.entidades.Puntos;
import Extra2.servicios.Servicios;

public class MainExtra2 {

    public static void main(String[] args) {
       Servicios se = new Servicios();
       Puntos pu = se.crearPuntos();
       se.calcularDistancia(pu);
    }
    
}
