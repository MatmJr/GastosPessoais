package com.gastos.GastosPessoais.domain.service;

import java.util.List;

public interface ICRUDService<request, response> {

    List<response> obterTodos();
    response obterPorId(Long id);
    response cadastrar(request dto);
    response atualizar(Long id, request dto);
    void deletar(Long id);
}
