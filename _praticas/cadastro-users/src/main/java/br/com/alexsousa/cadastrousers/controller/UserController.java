package br.com.alexsousa.cadastrousers.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cadastro")
public class UserController {
    @GetMapping("/users")
    public String listaUser(){
        return "Lista de usuários";
    }
}
