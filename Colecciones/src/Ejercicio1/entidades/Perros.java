package Ejercicio1.entidades;

import java.util.Scanner;

public class Perros {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    private String raza;

    public Perros(String raza) {
        this.raza = raza;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }


}
