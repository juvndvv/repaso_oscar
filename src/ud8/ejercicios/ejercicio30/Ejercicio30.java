package ud8.ejercicios.ejercicio30;

import java.util.ArrayList;

/**
 * Ejercicio 30 - Lista polimorfica de figuras
 *
 * Clase abstracta Figura con metodo abstracto area(). Hijas Cuadrado,
 * Circulo y Triangulo. Crea ArrayList<Figura> con varias figuras,
 * recorre llamando a area() (polimorfismo) y suma el area total.
 *
 * Ejemplo de salida:
 *   Cuadrado area: 25.0
 *   Circulo area: 28.274333882308138
 *   Triangulo area: 6.0
 *   Area total: 59.27433388230814
 */
public class Ejercicio30 {
    public static void main(String[] args) {
        ArrayList<Figura> figuras = new ArrayList<>();
        figuras.add(new Cuadrado(5));
        figuras.add(new Circulo(3));
        figuras.add(new Triangulo(4, 3));

        double total = 0;
        for (Figura f : figuras) {
            System.out.println(f.getClass().getSimpleName() + " area: " + f.area());
            total += f.area();
        }
        System.out.println("Area total: " + total);
    }
}
