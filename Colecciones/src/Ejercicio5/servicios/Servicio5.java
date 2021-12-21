package Ejercicio5.servicios;

import Ejercicio5.entidades.Pais;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Servicio5 {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    TreeSet<Pais> paises = new TreeSet();

    public Pais crearPais() {
        Pais pa = new Pais();

        System.out.println("Ingrese el pais: ");
        String nombrePais = leer.next().toUpperCase();
        pa.setNombrePais(nombrePais);

        return pa;
    }

    public void agregarPais(Pais pai) {
        paises.add(pai);
    }

    public void mostrarPais() {
        System.out.println("Los paises agregados son: ");

        for (Pais aux : paises) {
            System.out.println(aux.getNombrePais());
        }
    }

    public void ordenarAlfabetiamente() {
        System.out.println("Los paises ordenados alfabeticamente son: ");
        //Collections.sort(paises, Comparadores5.ordenarAlfabeticamente);
        for (Pais aux : paises) {
            System.out.println(aux.getNombrePais());
        }
    }

    public void eliminarPais() {

        System.out.println("Ingrese el País que desea eliminar:");
        String eliPais = leer.next().toUpperCase();
        int c;
        c = 0;
 //- - - - - ITERATOR - - - - -
        Iterator<Pais> it = paises.iterator();

        while (it.hasNext()) {
            Pais a = it.next();
            if (a.getNombrePais().equals(eliPais)) {
                it.remove();
            }else{
                System.out.println("El pais no se encuentra en la lista.");
            }
        }
        for (Pais aux : paises) {
            //System.out.println("La lista final:");
            System.out.println(aux.getNombrePais());
        }
    }

}
