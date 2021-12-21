package Ejercicio3.entidades;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Baraja {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    private ArrayList<Carta> cartas = new ArrayList();
    private ArrayList<Carta> monton = new ArrayList();

    public Baraja(ArrayList<Carta> cartas) {
        this.cartas = cartas;
    }

    public ArrayList<Carta> getMonton() {
        return monton;
    }

    public void setMonton(ArrayList<Carta> monton) {
        this.monton = monton;
    }

    public Baraja() {
    }

    public ArrayList<Carta> getCartas() {
        return cartas;
    }

    public void setCartas(ArrayList<Carta> cartas) {
        this.cartas = cartas;
    }

    @Override
    public String toString() {
        return "Baraja{" + "cartas=" + cartas + '}';
    }

    public void llenarMazo() {

        Carta ca = new Carta();

        for (int i = 0; i < 4; i++) {
            for (int j = 1; j < 13; j++) {
                if (j != 8 && j != 9) {
                    if (i == 0) {
                        ca.setPalo("Oro");
                    }
                    if (i == 1) {
                        ca.setPalo("Basto");
                    }
                    if (i == 2) {
                        ca.setPalo("Espada");
                    }
                    if (i == 3) {
                        ca.setPalo("Copa");
                    }
                    ca.setNumero(j);
                    cartas.add(new Carta(ca.getNumero(), ca.getPalo()));
                }
            }
        }
    }

    public void mostrar() {
        System.out.println("- - - LAS CARTAS DEL MASO SON: - - -");
        for (Carta aux : cartas) {
            System.out.println(aux.getNumero() + " de " + aux.getPalo());
        }
    }

    public void barajar() {

        Collections.shuffle(cartas);
//        for (Carta aux : cartas) {
//            System.out.println(aux.getNumero() + " de " + aux.getPalo());
//        }
System.out.println("Maz"
        + ""
        + ""
        + "o barajado.");
    }

    public void siguienteCarta() {

        System.out.println("------ La siguiente carta es: ----" + cartas.get(0));

    }

    public void cartasDisponibles() {
        System.out.println("- - - - - - Las cartas disponibles son: - - - - - - ");
        for (Carta aux : cartas) {
            System.out.println(aux.getNumero() + " de " + aux.getPalo());
        }

    }

    public void darCartas() {

        System.out.println("¿Cuantas cartas desea?: ");
        int cantidad = leer.nextInt();

        if (cantidad <= cartas.size()) {
            System.out.println("- - - - - - -  Las cartas entregadas son: - - - - - - - ");
            for (int i = cantidad - 1; i >= 0; i--) {
                Carta c = cartas.get(i);
                System.out.println(+c.getNumero() + " de " + c.getPalo());
                monton.add(cartas.get(i));

                cartas.remove(i);
            }
        } else {
            System.out.println("x x x El mazo no posee esa cantidad de cartas x x x");
        }
//        System.out.println("--------------------------------------------------------------------------------------------------------------------------------");
//        for (Carta aux : monton) {
//            System.out.println(aux);
//        }
    }

    public void cartasMonton() {
        System.out.println("Las cartas del monton son: ");
        for (Carta aux : monton) {
            System.out.println(aux);
        }
        
        
    }

}
