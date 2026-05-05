package ud4.ejercicios;

/**
 * Ejercicio 11 — Recorrer una matriz al reves
 *
 * Dada la siguiente matriz, muestra sus elementos recorriendola
 * de la ultima fila a la primera, y dentro de cada fila de la ultima
 * columna a la primera.
 *
 * Matriz:
 *   { {1, 2, 3},
 *     {4, 5, 6},
 *     {7, 8, 9} }
 *
 * Ejemplo de salida:
 *   9  8  7
 *   6  5  4
 *   3  2  1
 */
public class Ejercicio11 {
    public static void main(String[] args) {
        int[][] matriz = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9},
            {10, 11, 12}
        };

        for (int i = matriz.length -1 ; i >= 0; i--){
            for (int j = matriz[0].length -1 ; j >= 0; j--){
                System.out.printf("%-4d",matriz[i][j]);

            }
            System.out.println();

        }
    }
}
