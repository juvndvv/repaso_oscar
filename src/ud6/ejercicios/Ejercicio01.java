package ud6.ejercicios;

import java.util.ArrayList;

/**
 * Ejercicio 01 - Crear y recorrer un ArrayList
 *
 * Crea un ArrayList<String> con 5 ciudades y recorrelo con for-each.
 *
 * Ejemplo de salida:
 *   Madrid
 *   Barcelona
 *   Valencia
 *   Sevilla
 *   Bilbao
 */
public class Ejercicio01 {
    public static void main(String[] args) {
        ArrayList<String> ciudades = new ArrayList<>();
        ciudades.add("Madrid");
        ciudades.add("Barcelona");
        ciudades.add("Valencia");
        ciudades.add("Sevilla");
        ciudades.add("Bilbao");

        for (String ciudad : ciudades) {
            System.out.println(ciudad);
        }
    }
}
