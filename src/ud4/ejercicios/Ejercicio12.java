package ud4.ejercicios;

/**
 * Ejercicio 12 — Contar pares e impares en una matriz
 *
 * Dada la siguiente matriz, cuenta cuantos numeros son pares
 * y cuantos son impares.
 *
 * Matriz:
 *   { {1, 2, 3, 4},
 *     {5, 6, 7, 8},
 *     {9, 10, 11, 12} }
 *
 * Ejemplo de salida:
 *   Pares: 6
 *   Impares: 6
 */
public class Ejercicio12 {
    public static void main(String[] args) {
        int[][] matriz = {
            {1,  2,  3,  4},
            {5,  6,  7,  8},
            {9,  10, 11, 12}
        };
        int contadorPares = 0;
        int contadorImpares = 0;

        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[i].length; j++){
                if (matriz[i][j] %2 == 0){
                    contadorPares++;
                } else {
                    contadorImpares++;
                }
            }
        }
        System.out.println("Pares: " + contadorPares);
        System.out.println("Impares: " + contadorImpares);

    }
}
