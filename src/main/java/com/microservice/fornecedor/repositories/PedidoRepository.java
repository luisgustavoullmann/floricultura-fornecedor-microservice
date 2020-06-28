package com.microservice.fornecedor.repositories;

import com.microservice.fornecedor.model.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Luis Gustavo Ullmann on 27/06/2020
 */
public interface PedidoRepository extends JpaRepository<Pedido, Long> {
}
