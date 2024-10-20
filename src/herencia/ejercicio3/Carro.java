package herencia.ejercicio3;

public class Carro extends Vehiculo {

    private int puertas;

    public Carro(String marca, String modelo, int año, int puertas) {
        super(marca, modelo, año);
        this.puertas = puertas;
    }

    @Override
    public String toString() {
        return "Carro{" +
                "puertas=" + puertas +
                '}' + super.toString();
    }
}
