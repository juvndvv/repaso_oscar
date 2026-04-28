package ud4.ejercicios;

import java.util.Scanner;

/**
 * Ejercicio 02 — Rellenar una matriz desde teclado
 *
 * Pide al usuario el numero de filas y columnas.
 * Crea la matriz y rellena cada celda con valores introducidos por teclado.
 * Muestra la matriz al final.
 *
 * Ejemplo:
 *   Filas: 2
 *   Columnas: 3
 *   [0][0]: 1
 *   [0][1]: 2
 *   [0][2]: 3
 *   [1][0]: 4
 *   [1][1]: 5
 *   [1][2]: 6
 *   1  2  3
 *   4  5  6
 */
public class Ejercicio02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Filas: ");
        int filas = sc.nextInt();
        System.out.print("Columnas: ");
        int columnas = sc.nextInt();

        int[][] matriz = new int[filas][columnas];

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.printf("[%d][%d]: ", i, j);
                matriz[i][j] = sc.nextInt();
            }
        }

        System.out.println();
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.printf("%-4d", matriz[i][j]);
            }
            System.out.println();
        }

        sc.close();
    }
}
