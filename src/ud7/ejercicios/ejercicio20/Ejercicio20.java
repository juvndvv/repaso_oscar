package ud7.ejercicios.ejercicio20;

/**
 * Ejercicio 20 — Persona con sobrecarga de constructores
 *
 * Crea una clase Persona con:
 *   - Atributos privados: String nombre, int edad
 *   - Constructor vacio (asigna nombre "Desconocido" y edad 0)
 *   - Constructor completo Persona(String nombre, int edad)
 *   - Constructor de copia Persona(Persona otra)
 *   - Getter y setter para nombre
 *   - Getter y setter para edad con validacion (entre 0 y 120)
 *   - Metodo presentarse() que imprima nombre y edad.
 *
 * Ejemplo de salida:
 *   Hola, me llamo Desconocido y tengo 0 anyos
 *   Hola, me llamo Ana y tengo 25 anyos
 *   Hola, me llamo Ana y tengo 25 anyos
 *   Tras setEdad(-10) la edad sigue siendo: 25
 *   Tras setEdad(200) la edad sigue siendo: 25
 */
public class Ejercicio20 {
    public static void main(String[] args) {
        Persona p1 = new Persona();
        p1.presentarse();

        Persona p2 = new Persona("Ana", 25);
        p2.presentarse();

        Persona copia = new Persona(p2);
        copia.presentarse();

        p2.setEdad(-10);
        System.out.println("Tras setEdad(-10) la edad sigue siendo: " + p2.getEdad());

        p2.setEdad(200);
        System.out.println("Tras setEdad(200) la edad sigue siendo: " + p2.getEdad());
    }
}
