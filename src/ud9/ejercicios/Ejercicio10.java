package ud9.ejercicios;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Ejercicio 10 — Validador de entrada
 *
 * Pide al usuario que introduzca 5 numeros enteros y guardalos en un array.
 * Si introduce un valor que no es entero, captura InputMismatchException,
 * muestra un mensaje y vuelve a pedir el mismo numero hasta que sea valido.
 *
 * Ejemplo de salida:
 *   Numero 1: 10
 *   Numero 2: hola
 *   Entrada invalida, introduce un entero
 *   Numero 2: 20
 *   ...
 *   Array final: [10, 20, 30, 40, 50]
 */
public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[5];
        int i = 0;
        while (i < numeros.length) {
            System.out.print("Numero " + (i + 1) + ": ");
            try {
                numeros[i] = sc.nextInt();
                i++;
            } catch (InputMismatchException e) {
                System.out.println("Entrada invalida, introduce un entero");
                sc.next();
            }
        }
        System.out.print("Array final: [");
        for (int j = 0; j < numeros.length; j++) {
            System.out.print(numeros[j]);
            if (j < numeros.length - 1) System.out.print(", ");
        }
        System.out.println("]");
        sc.close();
    }
}
