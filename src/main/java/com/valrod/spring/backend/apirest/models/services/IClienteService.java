package com.valrod.spring.backend.apirest.models.services;

import com.valrod.spring.backend.apirest.models.entities.Cliente;

import java.util.List;

public interface IClienteService {

    List<Cliente> findAll();

    Cliente findById(Long id);

    Cliente save(Cliente cliente);

    void delete(Long id);

}
