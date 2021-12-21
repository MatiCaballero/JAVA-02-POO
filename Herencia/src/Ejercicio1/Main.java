package Ejercicio1;

import Ejercicio1.entidades.Animal;
import Ejercicio1.entidades.Caballo;
import Ejercicio1.entidades.Gato;
import Ejercicio1.entidades.Perro;

public class Main {
    

    
    public static void main(String[] args) {
        
        Animal Perro = new Perro("Kyara","Croquetas",1,"Border Collie");
        Perro.mostrarAlimento();
        
        Animal Gato = new Gato ("Athenea","Whyskas",2,"Siames");
        Gato.mostrarAlimento();
        
        Animal Caballo = new Caballo ("Pony","Pasto",14,"Pura Sangre");
        Caballo.mostrarAlimento();
    }
    
}
