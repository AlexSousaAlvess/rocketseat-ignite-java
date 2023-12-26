package br.com.alexsousa.controller;

import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;


@RestController
@RequestMapping("/primeiraController")
public class PrimeiraController {
    @GetMapping("/primeiroMetodo/{id}")    
    public String primeiroMetodo(@PathVariable String id){
        return "O parametro é " + id;
    }
    @GetMapping("/metodoComQueryParams")
    public String metodoComQueryParams(@RequestParam String id){
        return "O paramétro com metodoComQueryParams é " + id;
    }
    @GetMapping("/metodoComQueryParams2")
    public String metodoComQueryParams2(@RequestParam Map<String, String> allParams){
        return "O paramétro com metodoComQueryParams é " + allParams.entrySet();
    }
    @PostMapping("/metodoComBodyParams")
    public String metodoComBodyParams(@RequestBody Usuario usuario) {
        return "metodoComBodyParams " + usuario.username;
    }
    @PostMapping("/metodoComHeaders")
    public String metodoComHeaders(@RequestHeader("name") String name){
        return "MetodoComHeaders " + name;
    }
    @PostMapping("/metodoComListHeaders")
    public String metodoComListHeaders(@RequestHeader Map<String, String> headers){
        return "MetodoComHeaders " + headers.entrySet();
    }
    @GetMapping("/metodoComResponseEntity/{id}")
    public ResponseEntity<Object> metodoResponseEntity(@PathVariable Long id){
        var usuario = new Usuario("Alexsousa");
        if(id>5){
            return ResponseEntity.status(HttpStatus.OK).body(usuario);
        }
        return ResponseEntity.badRequest().body("Número menor que 5");
    }

    /**
     * Usuario
     */
    public record Usuario(String username) {
    }
    
}
