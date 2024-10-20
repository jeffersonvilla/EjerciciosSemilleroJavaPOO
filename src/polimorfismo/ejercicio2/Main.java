package polimorfismo.ejercicio2;

import java.util.ArrayList;
import java.util.List;

/*
 * Ejercicio 2: Crea una lista de `Animal` que contenga objetos de tipo `Perro` y `Gato`,
 * y ejecuta el metodo `hacerSonido` en cada objeto.
 */
public class Main {

    public static void main(String[] args) {

        Animal perro = new Perro();
        Animal gato = new Gato();

        List<Animal> animales = new ArrayList<>();

        animales.add(perro);
        animales.add(gato);

        for(Animal animal: animales){
            animal.hacerSonido();
        }
    }
}
