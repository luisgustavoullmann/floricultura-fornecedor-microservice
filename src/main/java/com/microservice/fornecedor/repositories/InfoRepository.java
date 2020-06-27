package com.microservice.fornecedor.repositories;

import com.microservice.fornecedor.model.InfoFornecedor;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Luis Gustavo Ullmann on 26/06/2020
 */
public interface InfoRepository extends JpaRepository<InfoFornecedor, Long> {
    InfoFornecedor findByEstado(String estado);
}
