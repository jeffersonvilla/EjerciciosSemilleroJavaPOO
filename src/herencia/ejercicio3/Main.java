package herencia.ejercicio3;

/*
 * Ejercicio 3: Crea una clase `Garaje` que pueda almacenar una lista de objetos `Vehiculo`.
 * Añade métodos para agregar vehículos y contar cuántos son de cada tipo (carros, motos)
 */
public class Main {

    public static void main(String[] args) {

        Carro carro1 = new Carro("Audi", "A1", 2010, 4);

        Carro carro2 = new Carro("Audi", "A1", 2010, 4);

        Moto moto = new Moto("BMW", "F 900 R", 2025, 900);

        Garaje garaje = new Garaje();

        garaje.agregarVehiculo(carro1);
        garaje.agregarVehiculo(carro2);
        garaje.agregarVehiculo(moto);

        garaje.contarVehiculosPorTipo();
    }
}
