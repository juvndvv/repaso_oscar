package ud4.ejercicios;

/**
 * Ejercicio 06 — Transponer una matriz
 *
 * Dada una matriz de 2x3, calcula su transpuesta (una matriz de 3x2)
 * donde la fila i y columna j de la original pasa a ser fila j y columna i.
 *
 * Matriz original:
 *   { {1, 2, 3},
 *     {4, 5, 6} }
 *
 * Ejemplo de salida:
 *   Original:
 *   1  2  3
 *   4  5  6
 *   Transpuesta:
 *   1  4
 *   2  5
 *   3  6
 */
public class Ejercicio06 {
    public static void main(String[] args) {
        int[][] original = {
            {1, 2, 3},
            {4, 5, 6}
        };

        int filas = original.length;
        int columnas = original[0].length;
        int[][] transpuesta = new int[columnas][filas];

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                transpuesta[j][i] = original[i][j];
            }
        }

        System.out.println("Original:");
        for (int[] fila : original) {
            for (int valor : fila) {
                System.out.printf("%-4d", valor);
            }
            System.out.println();
        }

        System.out.println("Transpuesta:");
        for (int[] fila : transpuesta) {
            for (int valor : fila) {
                System.out.printf("%-4d", valor);
            }
            System.out.println();
        }
    }
}
