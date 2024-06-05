package com.edu.kafkademo.dto;

import java.math.BigDecimal;
import java.util.UUID;

public class PagamentoDTO {
    
    private UUID numero = UUID.randomUUID();
    private String descricao;
    private BigDecimal valor;

    public UUID getNumero() {
        return numero;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public BigDecimal getValor() {
        return valor;
    }
    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }
}