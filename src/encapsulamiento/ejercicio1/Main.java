package encapsulamiento.ejercicio1;

/*
 * Ejercicio 1 (Básico): Crea una clase Persona con
 * atributos privados nombre, edad, y nacionalidad.
 * Agrega métodos get y set para acceder y modificar estos atributos
 */
public class Main {

    public static void main(String[] args) {

        Persona persona = new Persona();

        persona.mostrarInfo();

        persona.setNombre("Pedro");
        persona.setEdad(25);
        persona.setNacionalidad("Colombiano");

        System.out.println("Nombre: " + persona.getNombre());
        System.out.println("Edad: " + persona.getEdad());
        System.out.println("Nacionalidad: " + persona.getNacionalidad());
    }
}
