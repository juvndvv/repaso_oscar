package ud2.ejercicios;

import java.util.Scanner;

/**
 * Ejercicio 05 — Factura de electricidad
 *
 * El usuario introduce los kWh consumidos. Se aplica esta tarifa por tramos:
 *   - De 0 a 100 kWh      -> 0.10 euros/kWh
 *   - De 101 a 300 kWh     -> 0.15 euros/kWh
 *   - Mas de 300 kWh       -> 0.20 euros/kWh
 *
 * IMPORTANTE: los tramos son acumulativos. Por ejemplo, si consume 350 kWh:
 *   - Los primeros 100 kWh se cobran a 0.10
 *   - Los siguientes 200 kWh (de 101 a 300) se cobran a 0.15
 *   - Los 50 kWh restantes se cobran a 0.20
 *
 * Muestra el importe total.
 */
public class Ejercicio05 {
    public static void main(String[] args) {
    }
}
