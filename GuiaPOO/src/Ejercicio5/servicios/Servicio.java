package Ejercicio5.servicios;

import Ejercicio5.entidades.Cuenta;
import java.util.Scanner;

public class Servicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Cuenta crearCuenta() {
        System.out.println("Ingrese su nombre: ");
        String nombre = leer.next();
        System.out.println("Ingrese su DNI:");
        String dni = leer.next();
        System.out.println("Ingrese el saldo actual de su cuenta: ");
        double saldoAct = leer.nextInt();
        int nCuenta = (int) (Math.random() * 200 - 1);
        System.out.println("Bienvenido " + nombre + ", su cuenta se genero correctamente. El numero de cuenta es: " + nCuenta);
        System.out.println("Su saldo actual es de: " + saldoAct);
        Cuenta c = new Cuenta(nombre, nCuenta, dni, (int) saldoAct);
        return c;
    }

    public void ingreso(Cuenta s) {
        System.out.println("Ingrese la cantidad de dinero a depositar: ");
        int ing = leer.nextInt();
        System.out.println("Saldo 1 :" + s.getSaldoAct());
        s.setSaldoAct(s.getSaldoAct() + ing);
        System.out.println("Saldo 2 :" + s.getSaldoAct());
    }

    public void retiro(Cuenta r) {
        System.out.println("Ingrese la cantidad de dinero que quiere retirar:");
        int ret = leer.nextInt();
        if (ret < r.getSaldoAct()) {
            r.setSaldoAct(r.getSaldoAct() - ret);
        } else {
            r.setSaldoAct(r.getSaldoAct() - r.getSaldoAct());
            System.out.println("No posee tanto dinero para retirar. El saldo actual es de 0");
        }
        System.out.println("El saldo final es: " + r.getSaldoAct());
    }

    public void extraccionRapida(Cuenta er) {
        System.out.println("Con extraccion rapida solo puede retirar el 20% del saldo.");
        System.out.println("Ingrese el monto que desea extraer:");
        int extr = leer.nextInt();
        if (extr < (er.getSaldoAct() * 0.2)){
            er.setSaldoAct(er.getSaldoAct()-extr);
            System.out.println("Saldo actual: "+er.getSaldoAct());
        }else{
            System.out.println("El monto de extraccion rapida supera el 20%. No puede retirar.");
        }
    }
    
    public void consultarSaldo(Cuenta cs){
        System.out.println("El saldo de la cuenta es:"+cs.getSaldoAct()) ;
    }
    public void datos(Cuenta d){
        System.out.println("Nombre: "+d.getNombre());
        System.out.println("DNI: "+d.getDni());
        System.out.println("Numero de  cuenta: "+d.getnCuenta());

    }
}
