package ud4.ejercicios;

/**
 * Ejercicio 10 — Multiplicacion de dos matrices
 *
 * Multiplica dos matrices. Para que sea posible, el numero de columnas de A
 * debe ser igual al numero de filas de B.
 * El elemento resultado[i][j] = suma de A[i][k] * B[k][j] para todo k.
 *
 * Matriz A (2x3):          Matriz B (3x2):
 *   { {1, 2, 3},             { {7, 8},
 *     {4, 5, 6} }               {9, 10},
 *                               {11, 12} }
 *
 * Ejemplo de salida:
 *   Resultado (2x2):
 *   58  64
 *   139 154
 */
public class Ejercicio10 {
    public static void main(String[] args) {
        int[][] a = {
            {1, 2, 3},
            {4, 5, 6}
        };
        int[][] b = {
            {7,  8},
            {9,  10},
            {11, 12}
        };

        int filasA = a.length;
        int columnasA = a[0].length;
        int columnasB = b[0].length;
        int[][] resultado = new int[filasA][columnasB];

        for (int i = 0; i < filasA; i++) {
            for (int j = 0; j < columnasB; j++) {
                for (int k = 0; k < columnasA; k++) {
                    resultado[i][j] += a[i][k] * b[k][j];
                }
            }
        }

        System.out.println("Resultado (" + filasA + "x" + columnasB + "):");
        for (int[] fila : resultado) {
            for (int valor : fila) {
                System.out.printf("%-6d", valor);
            }
            System.out.println();
        }
    }
}
