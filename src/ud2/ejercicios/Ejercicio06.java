package ud2.ejercicios;

import java.util.Scanner;

/**
 * Ejercicio 06 — Adivina el numero
 *
 * El programa genera un numero aleatorio del 1 al 10 (con Math.random()).
 * El usuario tiene intentos ilimitados para adivinarlo.
 * Cada vez que falla, el programa dice si el numero secreto es mayor o menor.
 * Cuando acierta, muestra cuantos intentos necesito.
 */
public class Ejercicio06 {
    public static void main(String[] args) {
        // ¿Qué datos tengo?
        // - Un número secreto aleatorio (1 al 10)
        // - Numero introducido por el usuario
        // - Contador de intentos

        // ¿Qué tengo que hacer con ellos?
        // - Comparar el número del usuario con el secreto
        // - Decir si es mayor o menor
        // - Repetir hasta que acierte

        // Resultado final:
        // - Mostrar cuántos intentos ha necesitado

        Scanner sc = new Scanner(System.in);
        int secreto = (int)(Math.random() * 10) + 1;
        int numero = 0;
        int contador = 0;

        do {
            System.out.println("Introduce un numero del 1 al 10: ");
            numero = sc.nextInt();

            if (numero <= 0 || numero > 10) {
                System.out.println("Numero invalido");
            } else {
                contador++;

                if (numero < secreto){
                    System.out.println("El numero es mayor");
                } else if (numero > secreto){
                    System.out.println("El numero es menor");
                } else {
                    System.out.println("Correcto!");
                }
            }
        } while (numero != secreto);

        System.out.println("Has necesitado: " + contador + " intentos");

    }
}
