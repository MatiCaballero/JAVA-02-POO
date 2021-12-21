package Ejercicio2.entidades;

public class Revolver {

    private int posicionActual;
    private int posicionAgua;

    public Revolver(int posicionActual, int posicionAgua) {
        this.posicionActual = posicionActual;
        this.posicionAgua = posicionAgua;
    }

    public Revolver() {
    }

    public int getPosicionActual() {
        return posicionActual;
    }

    public void setPosicionActual(int posicionActual) {
        this.posicionActual = posicionActual;
    }

    public int getPosicionAgua() {
        return posicionAgua;
    }

    public void setPosicionAgua(int posicionAgua) {
        this.posicionAgua = posicionAgua;
    }

    @Override
    public String toString() {
        return "Revolver{" + "posicionActual=" + posicionActual + ", posicionAgua=" + posicionAgua + '}';
    }

    public void llenarRevolver(Revolver lr) {

        int posicionActual = ((int) (Math.random() * 6));
        int posicionAgua = ((int) (Math.random() * 6));
        lr.setPosicionActual(posicionActual);
        lr.setPosicionAgua(posicionAgua);

      // System.out.println("La posicion actual es: " + lr.getPosicionActual());
        System.out.println("");
        System.out.println("..............................");
        System.out.println("La posicion del agua es: " + lr.posicionAgua);
        System.out.println("..............................");
        System.out.println("");
    }

    public boolean mojar(Revolver m) {
        boolean op = false;

        if (m.getPosicionActual() == m.getPosicionAgua()) {
            op = true;
        }
       // System.out.println(op);
        return op;
    }
    
    public void siguienteChorro(Revolver sc){
        
        int posicionActual = ((int) (Math.random()*6));
                sc.setPosicionActual(posicionActual);
                System.out.println("La posicion del disparo es: "+sc.getPosicionActual()+"");
    }
    
    public void muestraPosiciones (Revolver mp){
        System.out.println("La posicion actual es: "+mp.getPosicionActual());
        System.out.println("La posicion del agua es: "+mp.getPosicionAgua());
    
    }
}
