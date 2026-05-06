package ud8.ejercicios.ejercicio20;

/**
 * Ejercicio 20 - Animal abstracto con sonido polimorfico
 *
 * Clase abstracta Animal con atributo nombre, metodo concreto comer()
 * y metodo abstracto emitirSonido(). Hijas Perro, Gato y Vaca.
 * Main crea un array de Animal y demuestra polimorfismo recorriendolo
 * y llamando a comer() y emitirSonido() en cada uno.
 *
 * Ejemplo de salida:
 *   Toby esta comiendo
 *   Toby dice Guau
 *   Misifu esta comiendo
 *   Misifu dice Miau
 *   Lola esta comiendo
 *   Lola dice Muu
 */
public class Ejercicio20 {
    public static void main(String[] args) {
        Animal[] animales = {
            new Perro("Toby"),
            new Gato("Misifu"),
            new Vaca("Lola")
        };

        for (Animal a : animales) {
            a.comer();
            a.emitirSonido();
        }
    }
}
