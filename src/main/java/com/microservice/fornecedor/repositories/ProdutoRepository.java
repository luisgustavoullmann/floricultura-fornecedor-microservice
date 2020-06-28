package com.microservice.fornecedor.repositories;

import com.microservice.fornecedor.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by Luis Gustavo Ullmann on 27/06/2020
 */
public interface ProdutoRepository extends JpaRepository<Produto, Long> {
    List<Produto> findByIdIn(List<Long> idsProdutos);

    List<Produto> findByEstado(String estado);
}
