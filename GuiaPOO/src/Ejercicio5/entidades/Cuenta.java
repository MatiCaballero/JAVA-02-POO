
package Ejercicio5.entidades;

public class Cuenta {
    private String nombre;
    private int nCuenta;
    private String dni;
    private int saldoAct;
    
    public Cuenta(String nombre, int nCuenta, String dni, int saldoAct) {
        this.nombre = nombre;
        this.nCuenta = nCuenta;
        this.dni = dni;
        this.saldoAct = saldoAct;
    }

    public Cuenta() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getnCuenta() {
        return nCuenta;
    }

    public void setnCuenta(int nCuenta) {
        this.nCuenta = nCuenta;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public int getSaldoAct() {
        return saldoAct;
    }

    public void setSaldoAct(int saldoAct) {
        this.saldoAct = saldoAct;
    }


 
}


   