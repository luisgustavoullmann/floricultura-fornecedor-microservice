package com.microservice.fornecedor.service;

import com.microservice.fornecedor.model.InfoFornecedor;
import com.microservice.fornecedor.repositories.InfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Luis Gustavo Ullmann on 26/06/2020
 */
@Service
public class InfoService {

    @Autowired
    private InfoRepository infoRepository;

    public InfoFornecedor getInfoPorEstado(String estado) {
       return infoRepository.findByEstado(estado);
    }
}
