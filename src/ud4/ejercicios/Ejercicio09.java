package ud4.ejercicios;

/**
 * Ejercicio 09 — Comprobar si una matriz es simetrica
 *
 * Una matriz cuadrada es simetrica si es igual a su transpuesta,
 * es decir, si para todo i,j: matriz[i][j] == matriz[j][i].
 *
 * Comprueba si la siguiente matriz es simetrica:
 *   { {1, 2, 3},
 *     {2, 5, 6},
 *     {3, 6, 9} }
 *
 * Ejemplo de salida:
 *   La matriz ES simetrica
 *
 * Prueba tambien con:
 *   { {1, 2, 3},
 *     {4, 5, 6},
 *     {7, 8, 9} }
 * que NO es simetrica.
 */
public class Ejercicio09 {
    public static void main(String[] args) {
        int[][] matriz = {
            {1, 2, 3},
            {2, 5, 6},
            {3, 6, 9}
        };

        boolean simetrica = true;
        for (int i = 0; i < matriz.length && simetrica; i++) {
            for (int j = 0; j < matriz[i].length && simetrica; j++) {
                if (matriz[i][j] != matriz[j][i]) {
                    simetrica = false;
                }
            }
        }

        if (simetrica) {
            System.out.println("La matriz ES simetrica");
        } else {
            System.out.println("La matriz NO es simetrica");
        }
    }
}
