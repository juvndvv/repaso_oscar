package ud3.ejercicios;

/**
 * Ejercicio 21 — Declarar y mostrar una matriz
 *
 * Declara una matriz (array bidimensional) de 3 filas y 4 columnas con estos valores:
 *   { {1, 2, 3, 4},
 *     {5, 6, 7, 8},
 *     {9, 10, 11, 12} }
 *
 * Recorrela con dos bucles for anidados y muestrala en forma de tabla.
 *
 * Ejemplo de salida:
 *    1   2   3   4
 *    5   6   7   8
 *    9  10  11  12
 */
public class Ejercicio21 {
    public static void main(String[] args) {
int[][] matriz = {
        {1, 2, 3, 4},
        {5, 6, 7, 8},
        {9, 10, 11, 12}
};
for (int i = 0; i < matriz.length; i++){
    for (int j = 0; j < matriz[i].length; j++){
        System.out.printf("%4d", matriz[i][j]);
    }
    System.out.println();
}
        // Bucle externo: filas (matriz.length)
        // Bucle interno: columnas (matriz[i].length)
        // Usa System.out.printf("%4d", matriz[i][j]) para alinear los numeros
        // Despues de cada fila, haz un System.out.println()
    }
}
