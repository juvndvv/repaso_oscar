package ud8.ejercicios.ejercicio39;

/**
 * Ejercicio 39 - Abstracta + interface + composicion
 *
 * Crea:
 *   - abstract class Vehiculo con protected String marca, constructor y
 *     metodo abstracto void arrancar().
 *   - interface Electrico con metodo void cargar().
 *   - Coche extends Vehiculo: arrancar() imprime "Coche X arrancando".
 *   - CocheElectrico extends Coche implements Electrico: cargar() imprime
 *     "Cargando bateria del coche X".
 *
 * En main crea un CocheElectrico, llama a arrancar() (heredado) y cargar()
 * (de la interface).
 *
 * Ejemplo de salida:
 *   Coche Tesla arrancando
 *   Cargando bateria del coche Tesla
 */
public class Ejercicio39 {
    public static void main(String[] args) {

    }
}
