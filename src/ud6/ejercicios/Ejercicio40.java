package ud6.ejercicios;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;

/**
 * Ejercicio 40 - Gestor de biblioteca
 *
 * Implementa un gestor de biblioteca con menu que utilice:
 *   - ArrayList<String> para libros disponibles.
 *   - HashSet<String> para socios unicos.
 *   - HashMap<String, ArrayList<String>> para prestamos (socio -> libros).
 *
 * Funciones disponibles: anadir libro, alta de socio, prestar libro,
 * devolver libro y mostrar prestamos.
 *
 * Ejemplo de salida:
 *   1. Anadir libro
 *   2. Alta socio
 *   3. Prestar
 *   4. Devolver
 *   5. Mostrar prestamos
 *   6. Salir
 *   Opcion:
 */
public class Ejercicio40 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> libros = new ArrayList<>();
        HashSet<String> socios = new HashSet<>();
        HashMap<String, ArrayList<String>> prestamos = new HashMap<>();
        int opcion;

        do {
            System.out.println("1. Anadir libro");
            System.out.println("2. Alta socio");
            System.out.println("3. Prestar");
            System.out.println("4. Devolver");
            System.out.println("5. Mostrar prestamos");
            System.out.println("6. Salir");
            System.out.print("Opcion: ");
            opcion = Integer.parseInt(sc.nextLine());

            if (opcion == 1) {
                System.out.print("Titulo: ");
                String titulo = sc.nextLine();
                libros.add(titulo);
                System.out.println("Libro anadido.");
            } else if (opcion == 2) {
                System.out.print("Nombre del socio: ");
                String socio = sc.nextLine();
                if (socios.add(socio)) {
                    System.out.println("Socio dado de alta.");
                } else {
                    System.out.println("El socio ya existe.");
                }
            } else if (opcion == 3) {
                System.out.print("Socio: ");
                String socio = sc.nextLine();
                System.out.print("Libro: ");
                String libro = sc.nextLine();
                if (!socios.contains(socio)) {
                    System.out.println("Socio no registrado.");
                } else if (!libros.contains(libro)) {
                    System.out.println("Libro no disponible.");
                } else {
                    libros.remove(libro);
                    if (!prestamos.containsKey(socio)) {
                        prestamos.put(socio, new ArrayList<>());
                    }
                    prestamos.get(socio).add(libro);
                    System.out.println("Prestamo registrado.");
                }
            } else if (opcion == 4) {
                System.out.print("Socio: ");
                String socio = sc.nextLine();
                System.out.print("Libro: ");
                String libro = sc.nextLine();
                if (prestamos.containsKey(socio) && prestamos.get(socio).remove(libro)) {
                    libros.add(libro);
                    System.out.println("Devolucion registrada.");
                } else {
                    System.out.println("El socio no tenia ese libro prestado.");
                }
            } else if (opcion == 5) {
                if (prestamos.isEmpty()) {
                    System.out.println("No hay prestamos.");
                } else {
                    for (Map.Entry<String, ArrayList<String>> entrada : prestamos.entrySet()) {
                        System.out.println(entrada.getKey() + " -> " + entrada.getValue());
                    }
                }
            }
        } while (opcion != 6);

        System.out.println("Hasta luego.");
    }
}
