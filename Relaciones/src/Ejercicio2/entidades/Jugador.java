package Ejercicio2.entidades;

import java.util.ArrayList;
import java.util.Scanner;

public class Jugador {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    private int id;
    private String nombre;
    private boolean mojado;



    public Jugador(int id, String nombre, boolean mojado) {
        this.id = id;
        this.nombre = nombre;
        this.mojado = mojado;

    }

    public Jugador() {
    }



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isMojado() {
        return mojado;
    }

    public void setMojado(boolean mojado) {
        this.mojado = mojado;
    }

    @Override
    public String toString() {
        return "Jugador{" + "id=" + id + ", nombre=" + nombre + ", mojado=" + mojado + '}';
    }


    public boolean disparo(Revolver r) {
        
        boolean mojado;
        mojado = true;


        r.mojar(r);
        if (r.mojar(r) == true) {
            mojado = false;
        } else {
        }
        r.siguienteChorro(r);
        return mojado;
    }

}
