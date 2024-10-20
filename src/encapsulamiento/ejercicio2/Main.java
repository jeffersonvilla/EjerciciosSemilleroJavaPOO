package encapsulamiento.ejercicio2;

/*
 * Ejercicio 2: Valida en los setters que la edad no pueda ser menor que 0.
 * Si el valor es incorrecto, imprime un mensaje de error
 */
public class Main {

    public static void main(String[] args) {

        Persona persona = new Persona();

        persona.setEdad(12);

        System.out.println("Edad: " + persona.getEdad());
    }
}
