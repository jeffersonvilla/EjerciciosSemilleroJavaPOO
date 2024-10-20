package abstraccion.ejercicio1;

/*
 * Ejercicio 1: Crea una clase abstracta `Figura` con un metodo abstracto `calcularArea`.
 * Luego, crea clases `Circulo` y `Rectangulo` que hereden de `Figura`
 * y sobrescriban el metodo `calcularArea` para calcular el área de cada figura.
 */
public class Main {

    public static void main(String[] args) {

        Figura circulo = new Circulo(2.0);
        Figura rectangulo = new Rectangulo(2.0, 3.0);

        System.out.println("Circulo: " + circulo.calcularArea());
        System.out.println("Rectangulo: " + rectangulo.calcularArea());
    }
}
