package clasesyobjetos.ejercicio2;

/*
 * Ejercicio 2: Añade un atributo `nacionalidad` y
 * define un metodo `actualizarEdad` que permita cambiar la edad de la persona.
 */
public class Main {

    public static void main(String[] args) {

        Persona persona1 = new Persona("Luis", 18);

        persona1.mostrarInfo();

        Persona persona2 = new Persona("Maria", 20);

        persona2.mostrarInfo();

        System.out.println("Se actualiza la edad del segundo objeto");

        persona2.actualizarEdad(25);

        persona2.mostrarInfo();
    }
}
