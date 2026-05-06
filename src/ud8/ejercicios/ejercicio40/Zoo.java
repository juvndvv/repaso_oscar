package ud8.ejercicios.ejercicio40;

import java.util.ArrayList;

public class Zoo {
    private ArrayList<AnimalZoo> animales;

    public Zoo() {
        this.animales = new ArrayList<>();
    }

    public void anyadirAnimal(AnimalZoo a) {
        if (a != null) {
            animales.add(a);
        }
    }

    public void mostrarTodos() {
        for (AnimalZoo a : animales) {
            a.mostrar();
        }
    }

    public void hacerSonar() {
        for (AnimalZoo a : animales) {
            a.emitirSonido();
        }
    }

    public void mostrarVoladores() {
        for (AnimalZoo a : animales) {
            if (a instanceof Aereo) {
                ((Aereo) a).volar();
            }
        }
    }
}
