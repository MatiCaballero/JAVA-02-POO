package Ejercicio2.entidades;

public class Lavadora extends Electrodomestico {

    protected Double carga;

    public Lavadora() {
    }

    public Lavadora(Double carga, Double precio, String color, String consumoE, Double peso) {
        super(precio, color, consumoE, peso);
        this.carga = carga;
    }

    public Integer getCarga() {
        return carga;
    }

    public void setCarga(Double carga) {
        this.carga = carga;
    }

    public Lavadora crearLavadora() {
        System.out.println("Ingrese la carga de la lavadora: ");
        carga = leer.nextDouble();
        Lavadora la = new Lavadora(carga, precio, color, consumoE, peso);
        la.crearElectrodomestico();
//        la.crearElectrodomestico();
//        la.setCarga(carga);
//        la.setColor(la.getColor());
//        la.setConsumoE(la.getConsumoE());
//        la.setPeso(la.getPeso());
//        la.setPrecio(la.getPrecio());
        System.out.println("El color de la lavadora es: " + la.getColor() + " , el consumo: " + la.getConsumoE() + " , el precio: " + la.getPrecio());

        return la;
    }

    public void precioFinal(Lavadora pf) {
        pf.precioFinal(pf);
        if (pf.getCarga() >= 30) {
            pf.setPrecio(pf.getPrecio() + 500.0);
        }
    }

}
