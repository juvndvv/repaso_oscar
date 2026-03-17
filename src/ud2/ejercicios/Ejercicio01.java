package ud2.ejercicios;

import java.util.Scanner;

/**
 * Ejercicio 01 — Cajero de supermercado
 *
 * El usuario introduce el precio de un producto y la cantidad.
 * Calcula el total. Si el total supera 50 euros, aplica un 10% de descuento.
 * Muestra el precio final.
 */
public class Ejercicio01 {
    public static void main(String[] args) {
        /*
        1. Precio del producto y la cantidad
        2. Calcular el total, si el total supera 50€ aplicar 10% descuento
        3. Mostrar el precio final
         */
        Scanner sc = new Scanner(System.in);

        // Datos
        // 1. precio
        System.out.println("Introduce el precio del producto: ");
        double precio = sc.nextDouble();

        // 2. cantidad
        System.out.println("Introduce la cantidad: ");
        int cantidad = sc.nextInt();
        double total = precio * cantidad;

        // Que tengo que hacer
        if (total > 50) {
            total = total - (total * 0.1);
        }

        // Que tengo que mostrar
        System.out.println("El total es: " + total);
    }
}
