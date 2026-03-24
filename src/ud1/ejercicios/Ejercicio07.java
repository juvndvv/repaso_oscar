package ud1.ejercicios;

/**
 * Ejercicio 07 — 🟡 Promoción de char a int
 * Dado char letra = 'A', ¿qué imprime System.out.println(letra + 1)?
 * ¿Por qué? ¿Cómo lo arreglarías para imprimir 'B'?
 */
public class Ejercicio07 {
    public static void main(String[] args) {
        char letra = 'A';

        // ¿Qué imprime esta línea? ¿Por qué?
        System.out.println(letra + 1); // Imprime 66 porque 'A' = 65 en ASCII/Unicode, y 65 + 1 = 66

        // TODO: ¿Qué tipo de dato resulta de (char + int)?
        // int

        // TODO: Arregla la siguiente línea para que imprima 'B' (el carácter, no el número)
        // System.out.println( ??? );
        System.out.println((char)(letra + 1));
    }
}
