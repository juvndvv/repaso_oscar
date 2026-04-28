package ud4.ejercicios;

/**
 * Ejercicio 03 — Suma de todos los elementos de una matriz
 *
 * Dada la siguiente matriz:
 *   { {1, 2, 3}, {4, 5, 6}, {7, 8, 9} }
 *
 * Recorre todos los elementos y calcula su suma total.
 *
 * Ejemplo de salida:
 *   Suma total: 45
 */
public class Ejercicio03 {
    public static void main(String[] args) {
        int[][] matriz = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int suma = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                suma += matriz[i][j];
            }
        }

        System.out.println("Suma total: " + suma);
    }
}
