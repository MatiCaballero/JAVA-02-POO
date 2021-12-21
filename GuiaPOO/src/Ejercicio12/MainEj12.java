
package Ejercicio12;

import Ejercicio12.entidades.Persona12;
import Ejercicio12.servicio.Serivicio12;

public class MainEj12 {

    public static void main(String[] args) {
        
         Serivicio12 se = new Serivicio12();
         Persona12 pe = se.crearPersona();
         se.calcularEdad(pe);
         se.mostrarPersona(pe);
        
    }
    
}
