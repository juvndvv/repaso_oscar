package ud8.ejercicios.ejercicio40;

public class Aguila extends AnimalZoo implements Aereo {
    public Aguila(String nombre, int edad) {
        super(nombre, edad);
    }

    @Override
    public void emitirSonido() {
        System.out.println(nombre + " chilla");
    }

    @Override
    public void volar() {
        System.out.println(nombre + " volando alto");
    }
}
