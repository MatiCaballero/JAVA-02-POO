package Ejercicio6.entidades;

public class Cafetera {
    private int capacidadMaxima;
    private int cantidadActual;

    public Cafetera(int capacidadMaxima, int cantidadActual) {
        this.capacidadMaxima = capacidadMaxima;
        this.cantidadActual = cantidadActual;
    }
    
    public Cafetera(int capacidadMaxima){
    this.capacidadMaxima=100;
    this.cantidadActual = 0;
    }

    public Cafetera() {
    }
    
    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public void setCapacidadMaxima(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public int getCantidadActual() {
        return cantidadActual;
    }

    public void setCantidadActual(int cantidadActual) {
        this.cantidadActual = cantidadActual;
    }
    
}
