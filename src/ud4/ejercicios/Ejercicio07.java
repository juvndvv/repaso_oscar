package ud4.ejercicios;

/**
 * Ejercicio 07 — Suma de dos matrices
 *
 * Dadas dos matrices del mismo tamano, calcula y muestra su suma elemento a elemento.
 *
 * Matriz A:              Matriz B:
 *   { {1, 2, 3},          { {7, 8, 9},
 *     {4, 5, 6} }           {1, 2, 3} }
 *
 * Ejemplo de salida:
 *   Resultado:
 *   8  10  12
 *   5  7   9
 */
public class Ejercicio07 {
    public static void main(String[] args) {
        int[][] a = {
            {1, 2, 3},
            {4, 5, 6}
        };
        int[][] b = {
            {7, 8, 9},
            {1, 2, 3}
        };

        int filas = a.length;
        int columnas = a[0].length;
        int[][] resultado = new int[filas][columnas];

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                resultado[i][j] = a[i][j] + b[i][j];
            }
        }

        System.out.println("Resultado:");
        for (int[] fila : resultado) {
            for (int valor : fila) {
                System.out.printf("%-4d", valor);
            }
            System.out.println();
        }
    }
}
