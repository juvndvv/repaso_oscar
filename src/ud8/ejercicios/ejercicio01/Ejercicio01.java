package ud8.ejercicios.ejercicio01;

/**
 * Ejercicio 01 - Composicion Persona-Direccion
 *
 * Crea una clase Direccion con calle y ciudad. Crea una clase Persona
 * que TIENE-UNA Direccion como atributo. Persona delega la impresion
 * de la direccion al objeto Direccion mediante el metodo mostrar().
 *
 * Ejemplo de salida:
 *   Persona: Ana
 *   Vive en Calle Mayor 5, Madrid
 */
public class Ejercicio01 {
    public static void main(String[] args) {
        Direccion d = new Direccion("Calle Mayor 5", "Madrid");
        Persona p = new Persona("Ana", d);
        p.presentarse();
    }
}
