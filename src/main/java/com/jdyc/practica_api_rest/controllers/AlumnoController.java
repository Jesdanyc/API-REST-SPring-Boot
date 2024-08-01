package com.jdyc.practica_api_rest.controllers;

import com.jdyc.practica_api_rest.models.AlumnoModel;
import com.jdyc.practica_api_rest.services.AlumnoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@RestController
@RequestMapping("/alumno")
public class AlumnoController {
    @Autowired
    AlumnoService alumnoService;

    @GetMapping()
    public ArrayList<AlumnoModel> obtenerAlumno(){
        return alumnoService.obtenerAlumno();
    }

    @PostMapping()
    public AlumnoModel guardarAlumno(@RequestBody AlumnoModel alumno){
        return this.alumnoService.guardarAlumno(alumno);
    }

    @GetMapping( path = "/{id}")
    public Optional<AlumnoModel> obtenerAlumnoPorId(@PathVariable("id") long id){
        return this.alumnoService.obtenerPorId(id);
    }

    @GetMapping("/query")
    public ArrayList<AlumnoModel> obtenerAlumnoPorCiclo(@RequestParam("ciclo") Integer ciclo){
        return this.alumnoService.obtenerPorCiclo(ciclo);
    }

    @DeleteMapping(path = "/{id}")
    public String eliminarPorId(@PathVariable("id")long id){
        boolean ok=this.alumnoService.eliminarAlumno(id);
        if(ok){
            return "Se elimino satisfactoriamente"+id;
        }else {
            return "No se pudo eliminar el alumno"+id;
        }
    }
}
