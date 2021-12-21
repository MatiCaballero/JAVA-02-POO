
package Ejercicio1.entidades;

public class Persona {
    private String nombrePersona;
    private String apellido;
    private int edadPersona;
    private String documento;
    private String perroPersona;
    private Perro perro;

    

    public Persona(String nombrePersona, String apellido, int edadPersona, String documento, String perroPersona) {
        this.nombrePersona = nombrePersona;
        this.apellido = apellido;
        this.edadPersona = edadPersona;
        this.documento = documento;
        this.perroPersona = perroPersona;
    }

    public Persona(Perro perro) {
        this.perro = perro;
    }
    
    public Persona() {
    }
    
    public String getNombrePersona() {
        return nombrePersona;
    }

    public void setNombrePersona(String nombrePersona) {
        this.nombrePersona = nombrePersona;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdadPersona() {
        return edadPersona;
    }

    public void setEdadPersona(int edadPersona) {
        this.edadPersona = edadPersona;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getPerroPersona() {
        return perroPersona;
    }

    public void setPerroPersona(String perroPersona) {
        this.perroPersona = perroPersona;
    }

    public Perro getPerro() {
        return perro;
    }

    public void setPerro(Perro perro) {
        this.perro = perro;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombrePersona=" + nombrePersona + ", apellido=" + apellido + ", edadPersona=" + edadPersona + ", documento=" + documento + ", perroPersona=" + perroPersona + ", perro=" + perro + '}';
    }

    


    
    
    
    
}
