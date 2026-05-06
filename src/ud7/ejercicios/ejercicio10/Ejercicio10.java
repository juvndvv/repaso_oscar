package ud7.ejercicios.ejercicio10;

/**
 * Ejercicio 10 — Clase Termometro
 *
 * Crea una clase Termometro con:
 *   - Atributo privado: double temperatura (en grados Celsius)
 *   - Constructor completo
 *   - Getter y setter
 *   - Metodo subir(double grados)
 *   - Metodo bajar(double grados)
 *   - Metodo enFahrenheit() que devuelva la temperatura en Fahrenheit
 *
 * Demuestra encapsulamiento: el atributo es privado y solo se modifica
 * mediante los metodos publicos.
 *
 * Ejemplo de salida:
 *   Temperatura inicial: 20.0 C
 *   Tras subir 5: 25.0 C
 *   Tras bajar 10: 15.0 C
 *   En Fahrenheit: 59.0 F
 */
public class Ejercicio10 {
    public static void main(String[] args) {
        Termometro t = new Termometro(20.0);
        System.out.println("Temperatura inicial: " + t.getTemperatura() + " C");

        t.subir(5.0);
        System.out.println("Tras subir 5: " + t.getTemperatura() + " C");

        t.bajar(10.0);
        System.out.println("Tras bajar 10: " + t.getTemperatura() + " C");

        System.out.println("En Fahrenheit: " + t.enFahrenheit() + " F");
    }
}
