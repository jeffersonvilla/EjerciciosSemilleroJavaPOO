package abstraccion.ejercicio2;

import java.util.ArrayList;
import java.util.List;

/*
 * Ejercicio 2: Crea una interfaz `Volador` con el metodo `volar`.
 * Luego, crea clases `Pajaro` y `Avion` que implementen la interfaz `Volador`.
 * En el metodo `volar` de `Pajaro`, imprime "El pájaro está volando", y en `Avion`,
 * imprime "El avión está volando".
 * Crea una lista de objetos `Volador` y ejecuta el metodo `volar` en cada uno.
 */
public class Main {

    public static void main(String[] args) {

        List<Volador> lista = new ArrayList<>();

        lista.add(new Pajaro());
        lista.add(new Avion());

        for(Volador v: lista){
            v.volar();
        }
    }
}
