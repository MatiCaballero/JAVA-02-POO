package Extra3.servicios;

import Extra3.entidades.Raices;
import java.util.Scanner;

public class Servicios {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Raices crear() {
        System.out.println("Ingresar coeficiente a: ");
        int a = leer.nextInt();
        System.out.println("Ingresar coeficiente b: ");
        int b = leer.nextInt();
        System.out.println("Ingresar coeficiente c: ");
        int c = leer.nextInt();
        double discri = 0;
        Raices r = new Raices(a, b, c);
        return r;

    }

    public void Discriminante(Raices d) {
        double discri;

        discri = Math.pow(d.getB(), 2) - 4 * d.getA() * d.getC();

    }

    public void tieneRaices(Raices tr) {

        double discri = Math.pow(tr.getB(), 2) - 4 * tr.getA() * tr.getC();
        boolean tiene = false;
        if (discri>=0){
            tiene = true;
        } else {
        tiene = false;
        }
        System.out.println(""+tiene);
    }
    public void tieneRaiz(Raices tr1) {

        double discri = Math.pow(tr1.getB(), 2) - 4 * tr1.getA() * tr1.getC();
        boolean tiene = false;
        if (discri==0){
            tiene = true;
        } else {
        tiene = false;
        }
        System.out.println(""+tiene);
    }
    
    
    
    

}
