package clasesyobjetos.ejercicio1;

/*
 * Ejercicio 1: Crea una clase `Persona` con atributos `nombre` y `edad`.
 * Define un constructor que permita inicializar estos atributos
 * y un metodo `mostrarInfo`para imprimir los datos.
 */
public class Main {

    public static void main(String[] args) {
        Persona persona1 = new Persona("Luis", 18);

        persona1.mostrarInfo();

        Persona persona2 = new Persona("Maria", 20);

        persona2.mostrarInfo();
    }
}
