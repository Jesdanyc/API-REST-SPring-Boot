package com.jdyc.practica_api_rest.repositories;

import com.jdyc.practica_api_rest.models.CartaPresentacionModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CartaPresentacionRepository extends CrudRepository<CartaPresentacionModel,Long>{

}
