package com.valrod.spring.backend.apirest.models.dao;

import com.valrod.spring.backend.apirest.models.entities.Cliente;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IClienteDao extends CrudRepository<Cliente,Long> {

}
