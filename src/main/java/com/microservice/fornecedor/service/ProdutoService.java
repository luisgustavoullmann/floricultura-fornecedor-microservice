package com.microservice.fornecedor.service;

import com.microservice.fornecedor.model.Produto;
import com.microservice.fornecedor.repositories.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Luis Gustavo Ullmann on 27/06/2020
 */
@Service
public class ProdutoService {

    @Autowired
    private ProdutoRepository produtoRepository;

    public List<Produto> getProdutosPorEstado(String estado) {
        return produtoRepository.findByEstado(estado);
    }
}
