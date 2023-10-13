package br.com.mauromoura.todolist.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// Primeira Camada de acesso da requisição do user
@RestController
@RequestMapping("/primeiraRota")
public class MinhaPrimeiraController {
    
    /**
     * Métodos de Acesso do HTTP
     * GET - Buscar informação
     * POST - Adicionar um dado/informação
     * PUT - Alterar dado/info
     * DELETE - Remover um dado
     * PATCH - Alterar somente uma parte da info
     */

    //  Método (Funcionalidade) de uma classe
    @GetMapping("/")
    public String primeiraMensagem() {
        return "Funcionou";
    }
}
