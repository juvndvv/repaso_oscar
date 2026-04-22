package ud3.ejercicios;

import java.util.Scanner;

/**
 * Ejercicio 08 — Buscar un elemento en un array
 *
 * Dado el array {10, 25, 33, 47, 58, 62, 79}, pide al usuario un numero
 * y dile si esta en el array y en que posicion.
 *
 * Ejemplo:
 *   Que numero buscas? 47
 *   El numero 47 esta en la posicion 3
 *
 *   Que numero buscas? 50
 *   El numero 50 no esta en el array
 */
public class Ejercicio08 {
    public static void main(String[] args) {
        int[] numeros = {10, 25, 33, 47, 58, 62, 79};
        Scanner sc = new Scanner(System.in);

        System.out.print("Que numero buscas? ");
        int num = sc.nextInt();

        // boolean encontrado = false;
        int posicion = -1;

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == num) {
                // encontrado = true;
                posicion = i;
                break;
            }
        }

        // if (encontrado) {
           // System.out.println("El número " + num + " está en la posición " + posicion);
        // } else {
        //    System.out.println("El número " + num + " no está en el array");
        // }


        sc.close();
    }
}
