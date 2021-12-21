package Ejercicio1.entidades;

public class Animal {

    protected String nombre;
    protected String Alimento;
    protected Integer edad;
    protected String Raza;

    public Animal() {
    }

    public Animal(String nombre, String Alimento, Integer edad, String Raza) {
        this.nombre = nombre;
        this.Alimento = Alimento;
        this.edad = edad;
        this.Raza = Raza;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAlimento() {
        return Alimento;
    }

    public void setAlimento(String Alimento) {
        this.Alimento = Alimento;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public String getRaza() {
        return Raza;
    }

    public void setRaza(String Raza) {
        this.Raza = Raza;
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String toString() {
        return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone(); //To change body of generated methods, choose Tools | Templates.
    }


    @Override
    public int hashCode() {
        return super.hashCode(); //To change body of generated methods, choose Tools | Templates.
    }

    
    public void mostrarAlimento(){
        System.out.println("El animal se alimenta de: "+Alimento);
    }

}
