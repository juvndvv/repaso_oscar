package ud3.ejercicios;

/**
 * Ejercicio 05 — Encontrar el maximo de un array
 *
 * Dado el array {33, 7, 91, 12, 58, 3, 44}, encuentra el valor maximo.
 *
 * Ejemplo de salida:
 *   El maximo es: 91
 */
public class Ejercicio05 {
    public static void main(String[] args) {
        int[] numeros = {33, 7, 91, 12, 58, 3, 44};
        int max = numeros[0];
       for (int i = 1 ; i < numeros.length ; i++){
           if (numeros[i] > max){
               max = numeros[i];
           }
       }
        System.out.println("El numero mas grande es: " + max);

        // Si el elemento actual es mayor que max, actualiza max

    }
}
