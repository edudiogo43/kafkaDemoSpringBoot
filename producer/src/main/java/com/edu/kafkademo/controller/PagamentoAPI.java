package com.edu.kafkademo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.edu.kafkademo.dto.PagamentoDTO;
import com.edu.kafkademo.service.PagamentoService;

@RestController
@RequestMapping("/pagamentos")
public class PagamentoAPI {
    @Autowired private PagamentoService pagamentoService;

    @PostMapping
    public String criar (@RequestBody PagamentoDTO pagamento) {
        return pagamentoService.criar(pagamento);
    }

}