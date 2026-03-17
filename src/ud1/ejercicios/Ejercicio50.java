package ud1.ejercicios;

import java.util.Scanner;

/**
 * Ejercicio 50 — 🔴 Ejercicio integrador: Factura simple
 *
 * Pide al usuario:
 * - Nombre del producto (String)
 * - Precio unitario (double)
 * - Cantidad (int)
 *
 * Calcula:
 * - Subtotal (precio × cantidad)
 * - IVA (21% del subtotal)
 * - Total (subtotal + IVA)
 *
 * Muestra una factura formateada:
 * --- FACTURA ---
 * Producto : Teclado
 * Cantidad : 3
 * Precio/u : 29.99 €
 * Subtotal : 89.97 €
 * IVA (21%): 18.89 €
 * TOTAL    : 108.86 €
 */
public class Ejercicio50 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // TODO: Pide el nombre del producto (String - usa nextLine())

        // TODO: Pide el precio unitario (double)
        // Pista: ¡cuidado con el bug del salto de línea si usas nextDouble()!

        // TODO: Pide la cantidad (int)

        // TODO: Calcula el subtotal (precio * cantidad)

        // TODO: Calcula el IVA (21% del subtotal)

        // TODO: Calcula el total (subtotal + IVA)

        // TODO: Muestra la factura formateada
        // Usa printf para alinear los valores y mostrar 2 decimales
        // Ejemplo de formato: System.out.printf("Producto : %s%n", producto);
        // Para decimales: System.out.printf("Subtotal : %.2f €%n", subtotal);

        sc.close();
    }
}
