package Ejercicio1.servicios;

import Ejercicio1.entidades.Perros;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Servicio1 {

    private Scanner leer = new Scanner(System.in).useDelimiter("\n");
    private List<String> raz;

    public Servicio1() {
        this.raz = new ArrayList();
    }

    public void crear() {
        String op = null;
        do {
            System.out.println("Ingrese una raza de perro:");
            String raza = leer.next();
            raz.add(raza);
            System.out.println("¿Quiere ingresar otra raza? (si/no)");
            op = leer.next();
        } while (op.equals("si"));
    }

    public void mostrarRaza() {
        System.out.println("Los nombres de la lista son: \n");
        for (String aux : raz) {
        }
        System.out.println(raz);
    }

    public void recorrerEliminar() {
        System.out.println("Ingrese la raza que desea eliminar: ");
        String eliminar = leer.next();
        int c;
        c = 0;
        for (int i = 0; i < raz.size(); i++) {
            String e = raz.get(i);

            if (e.equals(eliminar)) {
                raz.remove(e);
            } else {
                c++;
            }
        }
        if (c <= raz.size()) {
            System.out.println("La raza de que desea eliminar no existe.");
            System.out.println("Los nombres de la lista son: \n");
            for (String aux : raz) {
            }
            System.out.println(raz);
        } else {
            System.out.println("La raza se elimino correctamente.");
            System.out.println("Los nombres de la lista son: \n");
            for (String aux : raz) {
            }
            System.out.println(raz);
        }
    }

}
