package ud5.ejercicios;

/**
 * Ejercicio 01 — Funcion saludar
 *
 * Define una funcion (procedimiento) saludar() que imprima por pantalla
 * un mensaje de bienvenida. Llamala desde main varias veces para
 * comprobar que el codigo se reutiliza.
 *
 * Conceptos: anatomia de una funcion, procedimiento (void), llamada a funcion.
 *
 * Ejemplo de salida:
 *   Hola, bienvenido al programa
 *   Hola, bienvenido al programa
 */
public class Ejercicio01 {
    public static void main(String[] args) {
        saludar();
        saludar();
    }

    public static void saludar() {
        System.out.println("Hola, bienvenido al programa");
    }
}
