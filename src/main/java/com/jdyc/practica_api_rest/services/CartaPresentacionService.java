package com.jdyc.practica_api_rest.services;

import com.jdyc.practica_api_rest.models.CartaPresentacionModel;
import com.jdyc.practica_api_rest.repositories.CartaPresentacionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class CartaPresentacionService {
    @Autowired
    CartaPresentacionRepository cartaPresentacionRepository;

    //Metodo Obtener Carta
    public ArrayList<CartaPresentacionModel> obtenerCarta(){
        return (ArrayList<CartaPresentacionModel>)cartaPresentacionRepository.findAll();
    }
    //Metodo Guardar Carta
    public CartaPresentacionModel guardarCarta (CartaPresentacionModel carta){
        return cartaPresentacionRepository.save(carta);
    }

}
