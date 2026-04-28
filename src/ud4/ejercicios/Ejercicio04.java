package ud4.ejercicios;

/**
 * Ejercicio 04 — Maximo y minimo de una matriz
 *
 * Dada la siguiente matriz:
 *   { {3, 7, 1}, {9, 2, 8}, {4, 6, 5} }
 *
 * Encuentra el valor maximo y el minimo de toda la matriz,
 * e indica en que posicion [fila][columna] se encuentran.
 *
 * Ejemplo de salida:
 *   Maximo: 9 en posicion [1][0]
 *   Minimo: 1 en posicion [0][2]
 */
public class Ejercicio04 {
    public static void main(String[] args) {
        int[][] matriz = {
            {3, 7, 1},
            {9, 2, 8},
            {4, 6, 5}
        };

        int max = matriz[0][0];
        int min = matriz[0][0];
        int maxFila = 0, maxCol = 0;
        int minFila = 0, minCol = 0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] > max) {
                    max = matriz[i][j];
                    maxFila = i;
                    maxCol = j;
                }
                if (matriz[i][j] < min) {
                    min = matriz[i][j];
                    minFila = i;
                    minCol = j;
                }
            }
        }

        System.out.println("Maximo: " + max + " en posicion [" + maxFila + "][" + maxCol + "]");
        System.out.println("Minimo: " + min + " en posicion [" + minFila + "][" + minCol + "]");
    }
}
