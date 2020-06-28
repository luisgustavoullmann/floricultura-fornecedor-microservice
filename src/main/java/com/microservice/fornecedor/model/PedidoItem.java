package com.microservice.fornecedor.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

/**
 * Created by Luis Gustavo Ullmann on 27/06/2020
 */
@Getter
@Setter
@Entity
public class PedidoItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Integer quantidade;

    @ManyToOne
    @JoinColumn(name="produtoId")
    private Produto produto;
}
