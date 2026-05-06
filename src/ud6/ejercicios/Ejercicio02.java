package ud6.ejercicios;

import java.util.ArrayList;

/**
 * Ejercicio 02 - Suma de elementos
 *
 * Crea un ArrayList<Integer> con 10 numeros y muestra su suma total.
 *
 * Ejemplo de salida:
 *   Suma total: 55
 */
public class Ejercicio02 {
    public static void main(String[] args) {
        ArrayList<Integer> suma = new ArrayList<>();

        suma.add(1);
        suma.add(1);
        suma.add(1);
        suma.add(1);
        suma.add(1);
        suma.add(1);
        suma.add(1);
        suma.add(1);
        suma.add(1);
        suma.add(1);

        int sumaTotal = 0;

        for (int numero : suma) {
            sumaTotal += numero;
        } System.out.println("Suma total " + sumaTotal);
    }

}
