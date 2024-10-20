package clasesyobjetos.ejercicio3;

import java.util.ArrayList;
import java.util.List;

public class GrupoPersonas {

    private List<Persona> listaPersonas = new ArrayList<>();

    public void agregarPersona(Persona persona){
        listaPersonas.add(persona);
    }

    public void listarMiembrosGrupo(){
        for(Persona persona : listaPersonas){
            persona.mostrarInfo();
        }
    }
}
