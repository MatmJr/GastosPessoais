package com.gastos.GastosPessoais.domain.Enum;

public enum ETipoTitulo {

    RECEBER("Receber"),PAGAR("Pagar");

    private String valor;

    private  ETipoTitulo(String valor){
        this.valor = valor;
    }

    public String getValor() {
        return this.valor;
    }
}
