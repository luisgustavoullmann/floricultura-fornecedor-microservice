package com.microservice.fornecedor.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Created by Luis Gustavo Ullmann on 26/06/2020
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@Entity
public class InfoFornecedor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String estado;
    private String endereco;

}
