package com.jdyc.practica_api_rest.services;

import com.jdyc.practica_api_rest.models.AlumnoModel;
import com.jdyc.practica_api_rest.repositories.AlumnoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class AlumnoService {
    @Autowired
    AlumnoRepository alumnoRepository;

    //Metodo Obtener alumno
    public ArrayList<AlumnoModel> obtenerAlumno(){
        return(ArrayList<AlumnoModel>) alumnoRepository.findAll();
    }
    //Metodo Guardar alumno
    public AlumnoModel guardarAlumno(AlumnoModel alumno){
        return alumnoRepository.save(alumno);
    }
    //Metodo Busqueda por ID
    public Optional<AlumnoModel> obtenerPorId(Long id){//metodo optional para que no lance error caso no ecuentre
        return alumnoRepository.findById(id);
    }
    //Metodo Busqueda por CicloAcademico
    public ArrayList<AlumnoModel> obtenerPorCiclo(Integer ciclo){
        return alumnoRepository.findByCiclo(ciclo);
    }
    //Eliminar Usuario
    public boolean eliminarAlumno(long id){
        try {
            alumnoRepository.deleteById(id);
            return true;
        }catch (Exception err){//excepcion para que no haga ningun error
            return false;
        }
    }
}
