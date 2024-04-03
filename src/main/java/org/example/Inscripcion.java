package org.example;

import java.util.Set;

public class Inscripcion {

    private Set<Materia> materiasInscriptas;



    public boolean validaMateria(Alumno alumno, Materia materia){

        alumno.tieneMateriaAprobada(materia.getNombre());
    }

    public boolean Aprobada(Alumno alumno){
   //materiasInscriptas.stream().allMatch(validaMateria(alumno));

    }
}
