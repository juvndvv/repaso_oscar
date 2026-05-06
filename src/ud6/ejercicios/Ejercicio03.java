package ud6.ejercicios;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Ejercicio 03 - Leer N nombres por consola
 *
 * Pide al usuario un numero N y a continuacion N nombres.
 * Guardalos en un ArrayList<String> y muestralos al final.
 *
 * Ejemplo de salida:
 *   Cuantos nombres? 3
 *   Nombre 1: Ana
 *   Nombre 2: Luis
 *   Nombre 3: Marta
 *   Lista: [Ana, Luis, Marta]
 */
public class Ejercicio03 {
    private static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int cantidadNombres = pedirCantidadNombres();
        ArrayList<String> nombres = pedirNombres(cantidadNombres);
        sc.close();
        System.out.println(nombres);
    }

    public static int pedirCantidadNombres(){
        System.out.println("Cuantos nombres? ");
        int cantidadNombres = sc.nextInt();
        sc.nextLine();
        return cantidadNombres;
    }

    public static ArrayList<String> pedirNombres(int cantidadNombres){
        ArrayList<String> nombres = new ArrayList<>();
        for (int i = 0; i < cantidadNombres; i++){
            System.out.println("Nombre " + (i + 1));
            nombres.add(sc.nextLine());
        }
        return nombres;
    }
}
