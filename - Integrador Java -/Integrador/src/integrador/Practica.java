package integrador;

import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class Practica {

//    La función recibirá un numero x y deberá determinar si es capicúa o no. 
//    Este deberá devolver verdadero(true) si es capicúa y falso(false) si no lo es. 
//    Además deberemos contemplar los siguientes escenarios: 
//    Contemplar que el numero que llega puede ser negativo. 
//    Contemplar que el numero que llega puede ser de un digito, si es así debe devolver true. 
//    Contemplar que el numero que llega puede ser null, si es así debe devolver false.
//    @param num
//    @return esPalindromo
    public Boolean numeroCapicua(Integer num) {
        boolean resultado = false;

        String tamaño;
        int invertido, x;
        invertido = 0;
        tamaño = String.valueOf(num);

        try {

            if (tamaño.length() == 1) {
                resultado = true;
            }

            if (tamaño.length() > 1 || tamaño.length() < 1) {

                int auxiliar = num;

                while (auxiliar != 0) {

                    x = auxiliar % 10;
                    invertido = invertido * 10 + x;
                    auxiliar = auxiliar / 10;
                }

                if (num == invertido) {
                    resultado = true;
                } else {
                    resultado = false;
                }
            }
        } catch (Exception e) {
            resultado = false;
        }
        return resultado;
    }

//    Estamos en caramelolandia, donde estan los peores ladrones de dulces. 
//    Una vez al mes, se sienta una n cantidad de presos en ronda, contemplando 
//    al preso que inicia la ronda, como el preso 0. 
//    A los presos se les da una m cantidad de caramelos, estos caramelos se repartirán de uno en uno a cada preso, 
//    contemplando que se comenzaran a repartir los caramelos desde el primer preso (inicio). 
//    Se repartirán los caramelos hasta que no queden más y el ultimo caramelo en repartirse estará podrido, 
//    determinar a que preso, según su posición en la ronda le tocara el caramelo podrido.
//     @param inicio
//     @param cantidadCaramelos
//     @param cantidadLadrones
//     @return ladronQueLeTocoElCarameloPodrido
    public int prisioneroDulce(int inicio, int cantidadCaramelos, int cantidadLadrones) {
        //Aca escribir la logica necesaria
        int n = cantidadLadrones;
        int m = cantidadCaramelos;
        int ini = inicio;

        int presoInfectado = 0;

        for (int i = ini; ini < n; i++) {
            m--;
            if (m == 0) {
                presoInfectado = i;
                break;
            }
            if (i == n) {
                i = 0;
            }

        }
        return presoInfectado;

    }

//    En un universo paralelo, donde los habitantes son medias, existe un crucero de medias donde se sube una lista de medias. 
//    Esta lista de tripulantes del crucero es una Collection de letras. 
//    Lo que se deberá hacer, es filtrar la lista de medias que se suben al crucero y 
//    retornar una lista que contenga los grupos de medias que si tenían pares. 
//    Esta lista final de medias pares se mostraran ordenadas de menor a mayor.
//    A continuación un ejemplo: 
//    List de medias que llegan : A,B,A,B,C,A,F,Z,C,H. A,B y C tiene pares, mientras que F,Z y H no. 
//    Entonces la List que se debería retornar sería: A,B,C.
//   @param pasajeros
//   @return mediasAmigas
    public List<String> mediasAmigas(List<String> pasajeros) {

        int tamaño = pasajeros.size();
        int cantidad;
        
        HashSet<String> resultadoFinal = new HashSet();
        for (int i = 0; i < tamaño; i++) {
            cantidad = Collections.frequency(pasajeros, pasajeros.get(i));
            if (cantidad >= 2) {
                resultadoFinal.add(pasajeros.get(i));
            }
        }
        return (List<String>) resultadoFinal;

    }
}
