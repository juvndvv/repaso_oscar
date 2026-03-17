package ud1.ejercicios;

/**
 * Ejercicio 36 — 🔴 Overflow en casting a byte
 * ¿Qué imprime este código? Pista: byte va de -128 a 127.
 */
public class Ejercicio36 {
    public static void main(String[] args) {
        // PREDICCIÓN: b = ?

        int a = 300;
        byte b = (byte) a;
        System.out.println(b);

        // TODO: Explica por qué el resultado NO es 300:
        // ¿Qué es 300 en binario?
        // ¿Cuántos bits tiene un byte?
        // ¿Qué bits se conservan tras el casting?
        //
    }
}
