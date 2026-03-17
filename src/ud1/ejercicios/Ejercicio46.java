package ud1.ejercicios;

import java.util.Scanner;

/**
 * Ejercicio 46 — 🔴 Problema de Locale con Scanner
 * ¿Qué problema tiene este código y cómo lo arreglas?
 * El usuario escribe "3,14" (con coma).
 */
public class Ejercicio46 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un precio (ej: 3.14): ");
        double precio = sc.nextDouble();
        System.out.println("Precio: " + precio);

        // TODO: Ejecuta el programa e introduce "3,14" (con coma).
        // ¿Compila? →
        // ¿Ejecuta correctamente? →
        // ¿Qué excepción da (si la hay)? →

        // TODO: ¿De qué depende que acepte coma o punto?
        // Pista: investiga qué es el Locale del sistema
        //

        // TODO: Escribe al menos una forma de arreglar el problema para que
        // siempre funcione con punto:
        // Opción 1: sc.useLocale(Locale.US);
        // Opción 2: leer como String y convertir manualmente
        //

        sc.close();
    }
}
