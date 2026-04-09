package ud3.ejercicios;

/**
 * Ejercicio 07 — Contar pares e impares
 *
 * Dado el array {12, 7, 3, 8, 15, 22, 9, 4, 11, 6}, cuenta cuantos
 * numeros son pares y cuantos son impares.
 *
 * Pista: un numero es par si numero % 2 == 0
 *
 * Ejemplo de salida:
 *   Pares: 5
 *   Impares: 5
 */
public class Ejercicio07 {
    public static void main(String[] args) {
        int[] numeros = {12, 7, 3, 8, 15, 22, 9, 4, 11, 6, 100};
        int pares = 0;
        int impares = 0;

        for (int i=0 ; i < numeros.length ; i++){
            if(numeros[i] % 2 == 0){
                pares++;
            } else {
                impares++;
            }
        }
        System.out.println("Pares: " + pares);
        System.out.println("Impares: " + impares);

    }
}
