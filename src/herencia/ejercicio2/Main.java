package herencia.ejercicio2;

/*
 * Ejercicio 2: Crea una clase `Moto` que herede de `Vehiculo` y añade un atributo `cilindrada`.
 * Implementa un metodo para imprimir las características específicas de cada tipo de vehículo
 */
public class Main {

    public static void main(String[] args) {

        Carro carro = new Carro("Audi", "A1", 2010, 4);

        System.out.println(carro.toString());

        Moto moto = new Moto("BMW", "F 900 R", 2025, 900);

        System.out.println(moto.toString());
    }
}
