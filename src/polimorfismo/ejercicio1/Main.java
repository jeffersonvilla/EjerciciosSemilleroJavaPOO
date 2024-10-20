package polimorfismo.ejercicio1;

/*
 * Ejercicio 1: Crea una clase `Animal` con un metodo `hacerSonido`.
 * Luego, crea clases `Perro` y `Gato` que hereden de `Animal` y
 * sobrescriban el metodo `hacerSonido`
 */
public class Main {

    public static void main(String[] args) {

        Animal perro = new Perro();
        Animal gato = new Gato();

        perro.hacerSonido();
        gato.hacerSonido();
    }
}
