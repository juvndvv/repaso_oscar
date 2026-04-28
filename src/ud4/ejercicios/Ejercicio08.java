package ud4.ejercicios;

/**
 * Ejercicio 08 — Multiplicar una matriz por un escalar
 *
 * Dada la siguiente matriz y el escalar 3, multiplica cada elemento por ese valor.
 *
 * Matriz:
 *   { {1, 2, 3},
 *     {4, 5, 6},
 *     {7, 8, 9} }
 *
 * Ejemplo de salida:
 *   Original:
 *   1  2  3
 *   4  5  6
 *   7  8  9
 *   Multiplicada por 3:
 *   3  6  9
 *   12 15 18
 *   21 24 27
 */
public class Ejercicio08 {
    public static void main(String[] args) {
        int[][] matriz = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        int escalar = 3;

        System.out.println("Original:");
        for (int[] fila : matriz) {
            for (int valor : fila) {
                System.out.printf("%-4d", valor);
            }
            System.out.println();
        }

        System.out.println("Multiplicada por " + escalar + ":");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.printf("%-4d", matriz[i][j] * escalar);
            }
            System.out.println();
        }
    }
}
