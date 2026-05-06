package ud8.ejercicios.ejercicio40;

/**
 * Ejercicio 40 - Sistema de zoologico (integrador)
 *
 * Sistema que combina abstraccion, herencia, interfaces, composicion y
 * polimorfismo:
 *   - abstract class AnimalZoo (nombre, edad, abstracto emitirSonido()).
 *   - interface Acuatico con nadar().
 *   - interface Aereo con volar().
 *   - Leon extends AnimalZoo.
 *   - Aguila extends AnimalZoo implements Aereo.
 *   - Tiburon extends AnimalZoo implements Acuatico.
 *   - Pato extends AnimalZoo implements Acuatico, Aereo.
 *   - Clase Zoo con ArrayList<AnimalZoo>, metodos anyadirAnimal,
 *     mostrarTodos, hacerSonar() y mostrarVoladores() (con instanceof).
 *
 * Main crea un Zoo con varios animales y demuestra polimorfismo.
 *
 * Ejemplo de salida:
 *   --- Animales del zoo ---
 *   Leon Simba (5 anyos)
 *   Aguila Aquila (3 anyos)
 *   Tiburon Bruce (10 anyos)
 *   Pato Donald (2 anyos)
 *   --- Sonidos ---
 *   Simba ruge
 *   Aquila chilla
 *   Bruce muerde
 *   Donald hace cuac
 *   --- Voladores ---
 *   Aquila volando alto
 *   Donald volando bajito
 */
public class Ejercicio40 {
    public static void main(String[] args) {
        Zoo zoo = new Zoo();
        zoo.anyadirAnimal(new Leon("Simba", 5));
        zoo.anyadirAnimal(new Aguila("Aquila", 3));
        zoo.anyadirAnimal(new Tiburon("Bruce", 10));
        zoo.anyadirAnimal(new Pato("Donald", 2));

        System.out.println("--- Animales del zoo ---");
        zoo.mostrarTodos();
        System.out.println("--- Sonidos ---");
        zoo.hacerSonar();
        System.out.println("--- Voladores ---");
        zoo.mostrarVoladores();
    }
}
