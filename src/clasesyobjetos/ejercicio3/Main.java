package clasesyobjetos.ejercicio3;

/*
 * Ejercicio 3: Crea una clase `GrupoPersonas` que almacene una
 * lista de objetos `Persona` y tenga métodos para agregar personas
 * y listar todos los miembros del grupo
 */
public class Main {
    public static void main(String[] args) {

        Persona persona1 = new Persona("Luis", 18);

        Persona persona2 = new Persona("Maria", 20);

        GrupoPersonas grupo = new GrupoPersonas();

        grupo.agregarPersona(persona1);
        grupo.agregarPersona(persona2);

        grupo.listarMiembrosGrupo();
    }

}