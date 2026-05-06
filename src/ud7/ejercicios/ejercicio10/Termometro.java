package ud7.ejercicios.ejercicio10;

public class Termometro {
    private double temperatura;

    public Termometro(double temperatura) {
        this.temperatura = temperatura;
    }

    public double getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
    }

    public void subir(double grados) {
        if (grados > 0) {
            this.temperatura += grados;
        }
    }

    public void bajar(double grados) {
        if (grados > 0) {
            this.temperatura -= grados;
        }
    }

    public double enFahrenheit() {
        return this.temperatura * 9.0 / 5.0 + 32.0;
    }
}
