package ud3.ejercicios;

import java.util.Scanner;

/**
 * Ejercicio 11 — Contar cuantas veces aparece un valor
 *
 * Dado el array {5, 3, 8, 3, 2, 5, 3, 9, 5, 1}, pide al usuario un numero
 * y cuenta cuantas veces aparece en el array.
 *
 * Ejemplo:
 *   Que numero quieres contar? 3
 *   El numero 3 aparece 3 veces
 *
 *   Que numero quieres contar? 7
 *   El numero 7 no aparece en el array
 */
public class Ejercicio11 {
    public static void main(String[] args) {
        int[] numeros = {5, 3, 8, 3, 2, 5, 3, 9, 5, 1};
        Scanner sc = new Scanner(System.in);

        System.out.println("Dime un numero del 1 al 10: ");
        int numero = sc.nextInt();
        int contador = 0;
        for (int i = 0; i < numeros.length; i++ ){
            if (numero == numeros[i]){
                contador++;
            }
        if (contador > 0){
            System.out.println("El numero: " + numero + " Se repite " + contador + " veces");
            } else {
            System.out.println("El numero: " + numero + " No aparece en el array");
        }
        }
        sc.close();
    }
}
