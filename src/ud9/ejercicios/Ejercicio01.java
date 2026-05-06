package ud9.ejercicios;

import java.io.File;
import java.io.IOException;

/**
 * Ejercicio 01 — Inspeccion de un fichero
 *
 * Crea un objeto File apuntando a datos.txt en el directorio actual.
 * Muestra si existe, si es fichero, su tamano y su ruta absoluta.
 * Si no existe, crealo vacio con createNewFile().
 *
 * Ejemplo de salida:
 *   Existe: false
 *   Creando datos.txt...
 *   Existe: true
 *   Es fichero: true
 *   Tamano: 0 bytes
 *   Ruta: /home/user/datos.txt
 */
public class Ejercicio01 {
    public static void main(String[] args) throws IOException {
        File f = new File("datos.txt");
        System.out.println("Existe: " + f.exists());
        if (!f.exists()) {
            System.out.println("Creando datos.txt...");
            f.createNewFile();
        }
        System.out.println("Existe: " + f.exists());
        System.out.println("Es fichero: " + f.isFile());
        System.out.println("Es directorio: " + f.isDirectory());
        System.out.println("Tamano: " + f.length() + " bytes");
        System.out.println("Nombre: " + f.getName());
        System.out.println("Ruta: " + f.getAbsolutePath());
    }
}
