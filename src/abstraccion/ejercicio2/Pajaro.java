package abstraccion.ejercicio2;

public class Pajaro implements Volador, Animal{

    @Override
    public void volar() {
        System.out.println("El pájaro está volando");
    }

    @Override
    public void comer() {
        System.out.println("El pájaro está comiendo");
    }
}
