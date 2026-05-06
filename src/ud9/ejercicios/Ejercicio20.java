package ud9.ejercicios;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Ejercicio 20 — Cargar lista de personas desde fichero
 *
 * Lee personas.txt donde cada linea tiene formato:
 *   nombre;edad
 * Carga los datos en un ArrayList de String[] (o de objetos sencillos)
 * y muestralos por consola.
 * Si el fichero no existe, lo crea con datos de ejemplo y vuelve a leerlo.
 * Captura FileNotFoundException con mensaje claro.
 *
 * Ejemplo de salida:
 *   Personas cargadas:
 *   - Ana (25)
 *   - Luis (32)
 *   - Maria (19)
 */
public class Ejercicio20 {
    public static void main(String[] args) throws FileNotFoundException {
        File f = new File("personas.txt");
        if (!f.exists()) {
            PrintStream ps = new PrintStream(f);
            ps.println("Ana;25");
            ps.println("Luis;32");
            ps.println("Maria;19");
            ps.close();
        }
        ArrayList<String[]> personas = new ArrayList<>();
        try {
            Scanner sc = new Scanner(f);
            while (sc.hasNextLine()) {
                String linea = sc.nextLine();
                String[] partes = linea.split(";");
                if (partes.length == 2) {
                    personas.add(partes);
                }
            }
            sc.close();
        } catch (FileNotFoundException e) {
            System.out.println("No se pudo abrir el fichero: " + e.getMessage());
            return;
        }
        System.out.println("Personas cargadas:");
        for (String[] p : personas) {
            System.out.println("- " + p[0] + " (" + p[1] + ")");
        }
    }
}
