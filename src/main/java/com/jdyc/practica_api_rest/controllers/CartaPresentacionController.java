package com.jdyc.practica_api_rest.controllers;

import com.jdyc.practica_api_rest.models.AlumnoModel;
import com.jdyc.practica_api_rest.models.CartaPresentacionModel;
import com.jdyc.practica_api_rest.services.AlumnoService;
import com.jdyc.practica_api_rest.services.CartaPresentacionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.ArrayList;

@RestController
@RequestMapping("/cartapresentacion")
public class CartaPresentacionController {
    @Autowired//falto primero hacer el service de cp
    CartaPresentacionService cartaPresentacionService;
    @Autowired
    AlumnoService alumnoService;

    @GetMapping()
    public ArrayList<CartaPresentacionModel> obtenerCarta(){
        return cartaPresentacionService.obtenerCarta();
    }
/*
    @PostMapping()
    public CartaPresentacionModel guardarCarta(@RequestBody CartaPresentacionModel carta){
        return this.cartaPresentacionService.guardarCarta(carta);
    }
*/
    @PostMapping()
    public CartaPresentacionModel guardarCarta(@RequestBody CartaPresentacionModel carta) {
        // 1. Obtener el ID del alumno del cuerpo de la solicitud:
        Long cod_univer = carta.getDtalumno().getCod_univer();

        // 2. Buscar el AlumnoModel usando la instancia de alumnoService:
        AlumnoModel alumno = alumnoService.obtenerPorId(cod_univer) // Llamada correcta
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Alumno no encontrado"));

        // 3. Establecer el AlumnoModel en el CartaPresentacionModel:
        carta.setDtalumno(alumno);

        // 4. Guardar el CartaPresentacionModel:
        return cartaPresentacionService.guardarCarta(carta);
    }
}//quedamos en la relacion de carta con alumno, si guardo como esperaba pero no la parte visual del Json
