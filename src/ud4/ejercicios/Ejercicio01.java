package ud4.ejercicios;

/**
 * Ejercicio 01 — Declarar, inicializar y mostrar una matriz
 *
 * Crea una matriz de 3x3 enteros con valores a tu eleccion.
 * Recorrela con bucles anidados y muestra cada elemento con su posicion.
 *
 * Ejemplo de salida:
 *   [0][0]=1  [0][1]=2  [0][2]=3
 *   [1][0]=4  [1][1]=5  [1][2]=6
 *   [2][0]=7  [2][1]=8  [2][2]=9
 */
public class Ejercicio01 {
    public static void main(String[] args) {
        int[][] matriz = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.printf("[%d][%d]=%-4d", i, j, matriz[i][j]);
            }
            System.out.println();
        }
    }
}
