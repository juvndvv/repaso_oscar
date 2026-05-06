package ud8.ejercicios.ejercicio40;

public class Tiburon extends AnimalZoo implements Acuatico {
    public Tiburon(String nombre, int edad) {
        super(nombre, edad);
    }

    @Override
    public void emitirSonido() {
        System.out.println(nombre + " muerde");
    }

    @Override
    public void nadar() {
        System.out.println(nombre + " nadando rapido");
    }
}
