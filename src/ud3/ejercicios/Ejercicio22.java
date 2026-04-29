package ud3.ejercicios;

/**
 * Ejercicio 22 — Suma de filas y columnas de una matriz
 *
 * Dada la matriz:
 *   { {3, 5, 7},
 *     {2, 4, 6},
 *     {1, 8, 9} }
 *
 * Calcula y muestra la suma de cada fila y la suma de cada columna.
 *
 * Ejemplo de salida:
 *   Suma fila 0: 15
 *   Suma fila 1: 12
 *   Suma fila 2: 18
 *   Suma columna 0: 6
 *   Suma columna 1: 17
 *   Suma columna 2: 22
 */
public class Ejercicio22 {
    public static void main(String[] args) {
        int[][] matriz = {
            {3, 5, 7},
            {2, 4, 6},
            {1, 8, 9}
        };
        int filas = matriz.length;
        int columnas = matriz[0].length;

        for (int i = 0; i < filas; i++) {
            int sumaFila = 0;

            for (int j = 0; j < columnas; j++) {
                sumaFila += matriz[i][j];
            }
            System.out.println("Suma fila " + i + ": " + sumaFila);
        }
        for (int j = 0; j < columnas; j++) {
            int sumaColumna = 0;

            for (int i = 0; i < filas; i++) {
                sumaColumna += matriz[i][j];
            }
            System.out.println("Suma columna " + j + ": " + sumaColumna);
        }
    }
}

        // Para cada fila, recorre sus columnas sumando los valores

        // Para cada columna, recorre las filas sumando los valores
