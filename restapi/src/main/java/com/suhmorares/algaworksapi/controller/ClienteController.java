package com.suhmorares.algaworksapi.controller;

import com.suhmorares.algaworksapi.model.Clients;
import com.suhmorares.algaworksapi.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/clients")
public class ClienteController {

    @Autowired
    private ClienteRepository clienteRepository;

    @GetMapping
    public List<Clients> show(){ // --> Listagem de cliente
        return clienteRepository.findAll();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Clients adicionar(@RequestBody Clients clients){
        return clienteRepository.save(clients);
    }
}
