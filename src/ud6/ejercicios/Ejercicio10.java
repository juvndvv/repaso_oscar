package ud6.ejercicios;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Ejercicio 10 - Lista de la compra
 *
 * Crea un menu con las opciones: anadir producto, mostrar productos,
 * eliminar producto y salir. Usa un ArrayList<String> como almacen.
 *
 * Ejemplo de salida:
 *   1. Anadir
 *   2. Mostrar
 *   3. Eliminar
 *   4. Salir
 *   Opcion: 1
 *   Producto: pan
 *   Anadido.
 */
public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> compra = new ArrayList<>();
        int opcion;

        do {
            System.out.println("1. Anadir");
            System.out.println("2. Mostrar");
            System.out.println("3. Eliminar");
            System.out.println("4. Salir");
            System.out.print("Opcion: ");
            opcion = Integer.parseInt(sc.nextLine());

            if (opcion == 1) {
                System.out.print("Producto: ");
                String producto = sc.nextLine();
                compra.add(producto);
                System.out.println("Anadido.");
            } else if (opcion == 2) {
                if (compra.isEmpty()) {
                    System.out.println("Lista vacia.");
                } else {
                    for (String p : compra) {
                        System.out.println("- " + p);
                    }
                }
            } else if (opcion == 3) {
                System.out.print("Producto a eliminar: ");
                String producto = sc.nextLine();
                if (compra.remove(producto)) {
                    System.out.println("Eliminado.");
                } else {
                    System.out.println("No estaba en la lista.");
                }
            }
        } while (opcion != 4);

        System.out.println("Hasta luego.");
    }
}
