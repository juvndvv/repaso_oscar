package ud8.ejercicios.ejercicio37;

/**
 * Ejercicio 37 - Patron Composite
 *
 * Crea:
 *   - abstract class Componente con protected String nombre, constructor y
 *     metodo abstracto double precio().
 *   - Clase Producto extends Componente con private double precio,
 *     precio() devuelve precio.
 *   - Clase PaqueteProductos extends Componente con ArrayList<Componente>.
 *     Metodo anyadir(Componente c). precio() devuelve la suma del precio
 *     de todos los componentes (incluso paquetes anidados).
 *
 * En main crea productos sueltos, un paquete que contenga otros productos
 * y otro paquete dentro, y muestra el precio total.
 *
 * Ejemplo de salida:
 *   Precio total del paquete: 75.0
 */
public class Ejercicio37 {
    public static void main(String[] args) {

    }
}
