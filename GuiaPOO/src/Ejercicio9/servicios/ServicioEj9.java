package Ejercicio9.servicios;

import Ejercicio9.entidades.Matematica;

public class ServicioEj9 {

    public Matematica crearObjeto() {
        double n1 = Math.random() * 100 - 1;
        double n2 = Math.random() * 100 - 1;
        Matematica m = new Matematica(n1, n2);
        System.out.println("El numero 1 es: " + n1);
        System.out.println("El  numero 2 es: " + n2);
        return m;
    }

    public void devolverMayor(Matematica dm) {
        if (dm.getN1() > dm.getN2()) {
            System.out.println("El numero mayor es: " + dm.getN1());
        } else {
            System.out.println("El numero mayor es: " + dm.getN2());
        }
    }

    public void calcularPotencia(Matematica cp) {
        cp.setN1((int) cp.getN1());
        cp.setN2((int) cp.getN2());
        double potencia;
        if (cp.getN1() > cp.getN2()) {
            potencia = Math.pow(cp.getN1(), cp.getN2());
            System.out.println("El numero elevado es " + potencia);

        } else {
            potencia = Math.pow(cp.getN2(), cp.getN1());

            System.out.println("El numero elevado es " + potencia);
        }
    }
    
    public void calculaRaiz(Matematica cr){
            if (cr.getN1() > cr.getN2()) {
                double raiz = Math.sqrt(cr.getN2());
                System.out.println("La raiz cuadrada de "+cr.getN2()+" es: "+raiz);
            } else {
             double raiz = Math.sqrt(cr.getN1());
                System.out.println("La raiz cuadrada de "+cr.getN1()+" es: "+raiz);
            }
    }

}
