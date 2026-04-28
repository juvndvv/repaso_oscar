package ud4.ejercicios;

/**
 * Ejercicio 05 — Diagonal principal de una matriz cuadrada
 *
 * Dada una matriz cuadrada 4x4, muestra los elementos de su diagonal principal
 * (los elementos donde fila == columna) y calcula su suma.
 *
 * Matriz:
 *   { {1,  2,  3,  4},
 *     {5,  6,  7,  8},
 *     {9,  10, 11, 12},
 *     {13, 14, 15, 16} }
 *
 * Ejemplo de salida:
 *   Diagonal: 1 6 11 16
 *   Suma diagonal: 34
 */
public class Ejercicio05 {
    public static void main(String[] args) {
        int[][] matriz = {
            {1,  2,  3,  4},
            {5,  6,  7,  8},
            {9,  10, 11, 12},
            {13, 14, 15, 16}
        };

        int suma = 0;
        System.out.print("Diagonal: ");
        for (int i = 0; i < matriz.length; i++) {
            System.out.print(matriz[i][i] + " ");
            suma += matriz[i][i];
        }
        System.out.println();
        System.out.println("Suma diagonal: " + suma);
    }
}
