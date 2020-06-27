package com.microservice.fornecedor.controller;

import com.microservice.fornecedor.model.InfoFornecedor;
import com.microservice.fornecedor.service.InfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Luis Gustavo Ullmann on 26/06/2020
 */
@RestController
@RequestMapping("/info")
public class InfoController {

    @Autowired
    private InfoService infoService;

    @GetMapping("/{estado}")
    public InfoFornecedor getInfoPorEstado(@PathVariable("estado") String estado){
        return infoService.getInfoPorEstado(estado);
    }
}
