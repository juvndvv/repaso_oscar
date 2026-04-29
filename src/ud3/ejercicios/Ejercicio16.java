package ud3.ejercicios;

import java.util.Arrays;

/**
 * Ejercicio 16 — Ordenar un array (burbuja)
 *
 * Dado el array {64, 34, 25, 12, 22, 11, 90}, ordenalo de menor a mayor
 * usando el algoritmo de la burbuja (bubble sort).
 *
 * Como funciona la burbuja:
 * - Compara cada par de elementos adyacentes
 * - Si el primero es mayor que el segundo, los intercambia
 * - Repite el proceso hasta que no haya intercambios
 *
 * Muestra el array antes y despues de ordenar.
 *
 * Ejemplo de salida:
 *   Original: [64, 34, 25, 12, 22, 11, 90]
 *   Ordenado: [11, 12, 22, 25, 34, 64, 90]
 */
public class Ejercicio16 {
    public static void main(String[] args) {
        int[] numeros = {64, 34, 25, 12, 22, 11, 90};

        System.out.println("Original: " + Arrays.toString(numeros));

        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros.length - 1 - i; j++) {
                if (numeros[j] > numeros[j + 1]) {
                    int temporal = numeros[j];
                    numeros[j] = numeros[j + 1];
                    numeros[j + 1] = temporal;
                }
            }
        }
        System.out.println("Ordenado: " + Arrays.toString(numeros));
    }
}
