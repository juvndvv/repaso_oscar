package ud3.ejercicios;

import java.util.Scanner;

/**
 * Ejercicio 24 — Tres en raya: mostrar el tablero
 *
 * Simula un tablero de tres en raya usando una matriz de char 3x3.
 * Inicializa el tablero con espacios en blanco ' '.
 * Pide al usuario fila y columna para colocar una 'X'.
 * Muestra el tablero despues de cada jugada.
 * Permite 3 jugadas.
 *
 * Ejemplo de salida:
 *   Jugada 1 - Fila (0-2): 1
 *   Columna (0-2): 1
 *      |   |
 *   -----------
 *      | X |
 *   -----------
 *      |   |
 */
public class Ejercicio24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Pista: char[][] tablero = new char[3][3];
        // Recorrela con dos bucles y pon tablero[i][j] = ' ';

        // En cada jugada:
        //   1. Pide fila y columna al usuario
        //   2. Coloca una 'X' en esa posicion
        //   3. Muestra el tablero formateado
        //      Pista para mostrar: System.out.printf(" %c | %c | %c %n", tablero[i][0], tablero[i][1], tablero[i][2]);

        sc.close();
    }
}
