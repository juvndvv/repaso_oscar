package ud8.ejercicios.ejercicio40;

public class Pato extends AnimalZoo implements Acuatico, Aereo {
    public Pato(String nombre, int edad) {
        super(nombre, edad);
    }

    @Override
    public void emitirSonido() {
        System.out.println(nombre + " hace cuac");
    }

    @Override
    public void nadar() {
        System.out.println(nombre + " nadando en el lago");
    }

    @Override
    public void volar() {
        System.out.println(nombre + " volando bajito");
    }
}
