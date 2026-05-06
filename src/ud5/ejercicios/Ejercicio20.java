package ud5.ejercicios;

import java.util.Scanner;

/**
 * Ejercicio 20 — Invertir cadena
 *
 * Crea una funcion invertirCadena(String s) que devuelva la cadena al
 * reves recorriendola caracter a caracter (sin usar StringBuilder.reverse).
 *
 * Pide al usuario una palabra y muestra la palabra invertida.
 *
 * Conceptos: funcion que devuelve String, recorrido con bucle, ambito
 * de variable local.
 *
 * Ejemplo de salida:
 *   Introduce una palabra: hola
 *   Invertida: aloh
 */
public class Ejercicio20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce una palabra: ");
        String palabra = sc.nextLine();

        String resultado = invertirCadena(palabra);
        System.out.println("Invertida: " + resultado);

        sc.close();
    }

    public static String invertirCadena(String s) {
        String invertida = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            invertida += s.charAt(i);
        }
        return invertida;
    }
}
