package com.gastos.GastosPessoais.domain.exception;

public class ResourceBadRequestException extends RuntimeException{
    public ResourceBadRequestException(String mensagem){
        super(mensagem);
    }
}
