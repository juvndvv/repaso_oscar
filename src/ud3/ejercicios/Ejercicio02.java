package ud3.ejercicios;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Ejercicio 02 — Rellenar un array desde teclado
 *
 * Pide al usuario cuantos numeros quiere introducir.
 * Crea un array de ese tamano y rellena cada posicion con valores del teclado.
 * Muestra el array completo al final.
 *
 * Ejemplo:
 *   Cuantos numeros? 3
 *   Introduce el numero 1: 7
 *   Introduce el numero 2: 14
 *   Introduce el numero 3: 21
 *   Array: [7, 14, 21]
 */
public class Ejercicio02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Pedir el tamaño del array
        System.out.println("Introduce el tamaño del array: ");
        int tamano = sc.nextInt();

        int[] numeros = new int[tamano];

        for (int i=0; i < numeros.length; i++) {
            System.out.println("Introduce el numero " + (i+1) + ": ");
            numeros[i] = sc.nextInt();
        }

        System.out.println(Arrays.toString(numeros)); // [1, 2, 3]

        sc.close();
    }
}
