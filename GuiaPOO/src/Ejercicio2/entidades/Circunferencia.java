package Ejercicio2.entidades;

public class Circunferencia {

    private int radio;

    //Metodo vacio.
    public Circunferencia() {
    }

    //Metodo por parametro
    public Circunferencia(int radio) {
        this.radio = radio;
    }
    // GET AND SETTER  
    public long getRadio() {
        return radio;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }
    
}
