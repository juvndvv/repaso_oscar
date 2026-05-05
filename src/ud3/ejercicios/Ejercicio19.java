package ud3.ejercicios;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Ejercicio 19 — Unir dos arrays
 *
 * Dados dos arrays:
 *   int[] a = {1, 2, 3};
 *   int[] b = {4, 5, 6, 7};
 *
 * Crea un tercer array que contenga los elementos de ambos.
 *
 * Ejemplo de salida:
 *   Array A: [1, 2, 3]
 *   Array B: [4, 5, 6, 7]
 *   Unidos:  [1, 2, 3, 4, 5, 6, 7]
 */
public class Ejercicio19 {
    public static void main(String[] args) {
        int[] a = {1, 2, 3};
        int[] b = {4, 5, 6, 7};

        int[] c = new int[a.length + b.length];

        for (int i = 0; i < a.length; i++){
            c[i] = a[i];
        } for (int j = 0; j < b.length; j++){
            c[a.length + j] = b[j];
        }
        System.out.println("Array A: " + Arrays.toString(a));
        System.out.println("Array B: " + Arrays.toString(b));
        System.out.println("Unidos: " + Arrays.toString(c));

        // Pista: la posicion en "unidos" sera i + a.length

    }
}
