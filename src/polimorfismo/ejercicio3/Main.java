package polimorfismo.ejercicio3;

/*
 * Ejercicio 3: Crea una clase `Veterinario` con un metodo `atenderAnimal` que reciba
 * un objeto de tipo `Animal` y utilice polimorfismo para ejecutar el metodo
 * `hacerSonido` sin conocer el tipo específico del animal.
 */
public class Main {

    public static void main(String[] args) {

        Animal perro = new Perro();
        Animal gato = new Gato();

        Veterinario veterinario = new Veterinario();

        veterinario.atenderAnimal(perro);
        veterinario.atenderAnimal(gato);
    }
}
