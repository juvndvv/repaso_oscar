package ud6.ejercicios;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Ejercicio 20 - Borrado seguro con Iterator
 *
 * Dada una lista de notas, elimina las menores que 5 usando un Iterator y su
 * metodo remove para evitar ConcurrentModificationException.
 *
 * Ejemplo de salida:
 *   Antes:    [4.5, 7.0, 3.2, 8.5, 5.0, 2.0]
 *   Aprobados: [7.0, 8.5, 5.0]
 */
public class Ejercicio20 {
    public static void main(String[] args) {
        ArrayList<Double> notas = new ArrayList<>();
        notas.add(4.5);
        notas.add(7.0);
        notas.add(3.2);
        notas.add(8.5);
        notas.add(5.0);
        notas.add(2.0);

        System.out.println("Antes:    " + notas);

        Iterator<Double> it = notas.iterator();
        while (it.hasNext()) {
            double nota = it.next();
            if (nota < 5) {
                it.remove();
            }
        }

        System.out.println("Aprobados: " + notas);
    }
}
