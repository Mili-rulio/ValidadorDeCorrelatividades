package org.example;

import java.util.HashSet;
import java.util.Set;
import java.util.HashSet;
import java.util.stream.Collectors;

public class Materia {
    private String nombre;
    private Set<Materia> materiasCorrelativas;


    public Materia(String nombre) { //constructor para inicializar la coleccion
        this.nombre = nombre;
        this.materiasCorrelativas = new HashSet<>();
    }

    public String getNombre() {
        return nombre;
    }

    public Set<String> getNombreDeMateriasCorrelativas() {
        return materiasCorrelativas.stream().map(materia -> materia.getNombre()).collect(Collectors.toSet());

    }


    /*
    public Set<String> getNombreDeMaterias(Set<Materia> materias){
    return materias.stream().map(materia -> materia.getNombre()).collect(Collectors.toSet());

    }
*/
}
