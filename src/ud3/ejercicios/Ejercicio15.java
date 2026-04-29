package ud3.ejercicios;

import java.util.Arrays;

/**
 * Ejercicio 15 — Separar positivos y negativos
 *
 * Dado el array {-3, 7, -1, 4, -8, 2, 0, -5, 9, 6}, separa los numeros
 * positivos y negativos en dos arrays distintos y muestra cada uno.
 * El 0 se considera positivo.
 *
 * Pista: primero recorre el array contando cuantos positivos y negativos hay
 * para saber el tamano de cada array. Luego recorre de nuevo para rellenarlos.
 *
 * Ejemplo de salida:
 *   Positivos: [7, 4, 2, 0, 9, 6]
 *   Negativos: [-3, -1, -8, -5]
 */
public class Ejercicio15 {
    public static void main(String[] args) {
        int[] numeros = {-3, 7, -1, 4, -8, 2, 0, -5, 9, 6};

        int contadorPositivos = 0;
        int contadorNegativos = 0;

        for (int i = 0; i < numeros.length; i++){
            if (numeros[i] >= 0){
                contadorPositivos++;
            } else {
                contadorNegativos++;
            }
        }

        int [] positivos = new int[contadorPositivos];
        int [] negativos = new int[contadorNegativos];

        int numPos = 0;
        int numNeg = 0;

        for (int i = 0; i < numeros.length; i++){
            if (numeros[i] >= 0){
                positivos[numPos++] = numeros[i];
            } else {
                negativos[numNeg++] = numeros[i];
            }
        }

        System.out.println("Positivos: " + Arrays.toString(positivos));
        System.out.println("Negativos: " + Arrays.toString(negativos));

    }
}
