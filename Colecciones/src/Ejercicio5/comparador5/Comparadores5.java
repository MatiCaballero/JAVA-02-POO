
package Ejercicio5.comparador5;

import Ejercicio5.entidades.Pais;
import java.util.Comparator;

public class Comparadores5 {
    
    public static Comparator<Pais> ordenarAlfabeticamente = new Comparator<Pais>(){
        @Override
        public int compare(Pais t, Pais t1) {
            return t.getNombrePais().compareTo(t1.getNombrePais());
        }
    };
    
}
