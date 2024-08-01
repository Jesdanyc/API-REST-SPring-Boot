package com.jdyc.practica_api_rest.repositories;

import com.jdyc.practica_api_rest.models.AlumnoModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public interface AlumnoRepository extends CrudRepository<AlumnoModel, Long> {
    public abstract ArrayList<AlumnoModel> findByCiclo(Integer ciclo);
}
