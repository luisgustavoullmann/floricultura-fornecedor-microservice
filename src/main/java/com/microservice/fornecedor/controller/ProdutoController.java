package com.microservice.fornecedor.controller;

import com.microservice.fornecedor.model.Produto;
import com.microservice.fornecedor.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by Luis Gustavo Ullmann on 27/06/2020
 */
@RestController
@RequestMapping("/produto")
public class ProdutoController {

    @Autowired
    private ProdutoService produtoService;

    @GetMapping("/{estado}")
    public List<Produto> getProdutoPorEstado(@PathVariable("estado") String estado){
        return produtoService.getProdutosPorEstado(estado);
    }
}
