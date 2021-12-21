package Ejercicio2.entidades;

import java.util.Scanner;

public class Electrodomestico {

    protected Double precio;
    protected String color;
    protected String consumoE;
    protected Double peso;
    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Electrodomestico() {
    }

    public Electrodomestico(Double precio, String color, String consumoE, Double peso) {
        this.precio = precio;
        this.color = color;
        this.consumoE = consumoE;
        this.peso = peso;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getConsumoE() {
        return consumoE;
    }

    public void setConsumoE(String consumoE) {
        this.consumoE = consumoE;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    protected void comprobarConsumoEnergetico(String letra) {
        if (consumoE.equals("A") || consumoE.equals("B") || consumoE.equals("C") || consumoE.equals("D") || consumoE.equals("E") || consumoE.equals("F")) {
            System.out.println("La letra es correcta");
        } else {
            consumoE.equals("F");
        }
    }

    protected void comprobarColor(String color) {
        if (color.equals("BLANCO") || color.equals("NEGRO") || color.equals("ROJO") || color.equals("AZUL") || color.equals("GRIS")) {
            System.out.println("Color: "+color+", valido.");
        }else{
        color.equals("BLANCO");
            System.out.println("Color invalido, por lo tanto el color es:"+color);
        }
    }

    public Electrodomestico crearElectrodomestico() {

        System.out.println("Ingrese el color:");
        color = leer.next().toUpperCase();
        System.out.println("Ingrese el consumo:( A / B / C / D / E / F) ");
        consumoE = leer.next().toUpperCase();
        System.out.println("Ingrese el peso:");
        peso = leer.nextDouble();
        precio = 1000.0;
        Electrodomestico e = new Electrodomestico(precio, color, consumoE, peso);

        e.comprobarConsumoEnergetico(consumoE);
        e.comprobarColor(color);

        System.out.println("El color es: " + e.getColor() + ", el consumo electrico es: " + e.getConsumoE() + ", y el peso es: " + e.getPeso() + " kg");

        return e;
    }

    public void agregar() {

    }

    public void precioFinal(Electrodomestico pf) {

        System.out.println("" + pf.getConsumoE());
        if (pf.getConsumoE().equals("A")) {
            pf.setPrecio(pf.getPrecio() + 1000.0);
        }
        if (pf.getConsumoE().equals("B")) {
            pf.setPrecio(pf.getPrecio() + 800.0);
        }
        if (pf.getConsumoE().equals("C")) {
            pf.setPrecio(pf.getPrecio() + 600.0);
        }
        if (pf.getConsumoE().equals("D")) {
            pf.setPrecio(pf.getPrecio() + 500.0);
        }
        if (pf.getConsumoE().equals("E")) {
            pf.setPrecio(pf.getPrecio() + 300.0);
        }
        if (pf.getConsumoE().equals("F")) {
            pf.setPrecio(pf.getPrecio() + 100.0);
        }

        if (pf.getPeso() >= (1) && pf.getPeso() <= (19)) {
            pf.setPrecio(pf.getPrecio() + 100);
        }
        if (pf.getPeso() >= (20) && pf.getPeso() <= (49)) {
            pf.setPrecio(pf.getPrecio() + 500);
        }
        if (pf.getPeso() >= (50) && pf.getPeso() <= (79)) {
            pf.setPrecio(pf.getPrecio() + 800);
        }
        if (pf.getPeso() >= (80)) {
            pf.setPrecio(pf.getPrecio() + 1000);
        }

        System.out.println("El precio final del electrodomestico es: " + pf.getPrecio());
    }

}
