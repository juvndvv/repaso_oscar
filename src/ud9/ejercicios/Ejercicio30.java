package ud9.ejercicios;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

/**
 * Ejercicio 30 — Try-with-resources con Scanner
 *
 * Lee datos.txt usando Scanner dentro de un try-with-resources.
 * Muestra cada linea por consola precedida por su numero.
 * Si el fichero no existe, crealo con datos de ejemplo y vuelve a abrirlo.
 * Captura FileNotFoundException por separado.
 *
 * Ejemplo de salida:
 *   1: linea uno
 *   2: linea dos
 *   3: linea tres
 */
public class Ejercicio30 {
    public static void main(String[] args) throws FileNotFoundException {
        File f = new File("datos.txt");
        if (!f.exists()) {
            PrintStream ps = new PrintStream(f);
            ps.println("linea uno");
            ps.println("linea dos");
            ps.println("linea tres");
            ps.close();
        }
        try (Scanner sc = new Scanner(f)) {
            int n = 1;
            while (sc.hasNextLine()) {
                System.out.println(n + ": " + sc.nextLine());
                n++;
            }
        } catch (FileNotFoundException e) {
            System.out.println("No se ha podido abrir: " + e.getMessage());
        }
    }
}
