package Ejercicio4.entidades;

public class Pelicula {

    private String titulo;
    private String director;
    private Double hora;

    public Pelicula(String titulo, String director, Double hora) {
        this.titulo = titulo;
        this.director = director;
        this.hora = hora;
    }

    @Override
    public String toString() {
        return "Pelicula{" + "titulo=" + titulo + ", director=" + director + ", hora=" + hora + '}';
    }
    
    public Pelicula (){
        
    }
    
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public Double getHora() {
        return hora;
    }

    public void setHora(Double hora) {
        this.hora = hora;
    }

}
