package ud3.ejercicios;

/**
 * Ejercicio 01 — Declarar, inicializar y mostrar un array
 *
 * Crea un array de 5 enteros con valores a tu eleccion.
 * Recorrelo con un bucle for y muestra cada elemento por pantalla.
 *
 * Ejemplo de salida:
 *   Posicion 0: 10
 *   Posicion 1: 20
 *   Posicion 2: 30
 *   Posicion 3: 40
 *   Posicion 4: 50
 */
public class Ejercicio01 {
    public static void main(String[] args) {
        int[] numeros = {10, 20, 30, 40, 50};

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Posicion " + i + ": " + numeros[i]);
        }
    }
}
