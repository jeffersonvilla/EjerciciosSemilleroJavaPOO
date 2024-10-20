package herencia.ejercicio1;

/*
 * Ejercicio 1: Crea una clase Vehiculo con atributos como marca, modelo y año.
 * Luego, crea una clase Carro que herede de Vehiculo y añada un atributo puertas
 */
public class Main {

    public static void main(String[] args) {

        Carro carro = new Carro("Audi", "A1", 2010, 4);

        System.out.println(carro.toString());
    }
}


