package ud8.ejercicios.ejercicio40;

public class Leon extends AnimalZoo {
    public Leon(String nombre, int edad) {
        super(nombre, edad);
    }

    @Override
    public void emitirSonido() {
        System.out.println(nombre + " ruge");
    }
}
