package br.com.projetocarro.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.com.projetocarro.entities.Client;

@RestController
@RequestMapping("/client")
public class ClientController
{

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    @ResponseStatus(value = HttpStatus.CREATED)
    public void registerPerson(@RequestBody Client client)
    {
        System.out.println(client.getName() + " " + client.getRegister());
    }
}
