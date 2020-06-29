package com.microservice.fornecedor.controller;

import com.microservice.fornecedor.model.Pedido;
import com.microservice.fornecedor.model.dto.ItemPedidoDto;
import com.microservice.fornecedor.service.PedidoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Luis Gustavo Ullmann on 27/06/2020
 */
@Slf4j
@RestController
@RequestMapping("/pedido")
public class PedidoController {

    @Autowired
    private PedidoService pedidoService;

    @GetMapping("/{id}")
    public Pedido getPedidoPorId(@PathVariable("id") Long id) {
        return pedidoService.getPedidoPorId(id);
    }

    @PostMapping
    public Pedido realizaPedido(@RequestBody List<ItemPedidoDto> produtos) {
        log.info("Fornecedor já está com o pedido");
        return pedidoService.realizaPedido(produtos);
    }
}
