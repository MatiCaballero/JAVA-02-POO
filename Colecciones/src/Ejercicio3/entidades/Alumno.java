package Ejercicio3.entidades;

import java.util.ArrayList;

public class Alumno {

    private ArrayList<Integer> nota;
    private String nombre;

    public Alumno(String nombre) {
        this.nombre = nombre;
    }
    
    public Alumno() {
        this.nota = new ArrayList();
    }
    
    public ArrayList<Integer> getNota() {
        return nota;
    }
    public void setNota(ArrayList<Integer> nota) {
        this.nota = nota;
    }
    
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

 

}
