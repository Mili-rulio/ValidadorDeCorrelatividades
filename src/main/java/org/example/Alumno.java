package org.example;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class Alumno {
    private Set<Materia> materiasAprobadas;
    private Set<Inscripcion> inscripcionesHistoricas;

    public Alumno(Set<Materia> materiasAprobadas) {
        this.materiasAprobadas = new HashSet<>();
    }

    public boolean tieneMateriaAprobada(String nombre){
        return this.getNombreDeMateriasAprobadas().contains(nombre);

    }

    public Set<String> getNombreDeMateriasAprobadas() {
        return materiasAprobadas.stream().map(materia -> materia.getNombre()).collect(Collectors.toSet());

    }


}
