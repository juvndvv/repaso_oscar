package ud4.ejercicios;

import java.util.Scanner;

/**
 * Ejercicio 29 — Buscar un valor en una matriz
 *
 * Pide al usuario un valor entero y busca si existe en la siguiente matriz.
 * Si existe, indica en que posiciones aparece. Si no existe, informalo.
 *
 * Matriz:
 *   { {3,  7,  2,  5},
 *     {8,  2,  9,  1},
 *     {4,  6,  2,  7} }
 *
 * Ejemplo (buscando 2):
 *   Introduce el valor a buscar: 2
 *   Encontrado en [0][2]
 *   Encontrado en [1][1]
 *   Encontrado en [2][2]
 *   Total apariciones: 3
 *
 * Ejemplo (buscando 99):
 *   Introduce el valor a buscar: 99
 *   El valor 99 no se encuentra en la matriz
 */
public class Ejercicio29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matriz = {
            {3, 7, 2, 5},
            {8, 2, 9, 1},
            {4, 6, 2, 7}
        };

        sc.close();
    }
}
