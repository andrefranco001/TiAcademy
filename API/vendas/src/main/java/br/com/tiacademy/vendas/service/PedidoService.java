package br.com.tiacademy.vendas.service;

import br.com.tiacademy.vendas.core.crud.CrudService;
import br.com.tiacademy.vendas.domain.Pedido;
import org.springframework.stereotype.Service;

@Service
public class PedidoService extends CrudService<Pedido, Long> {
    @Override
    protected Pedido editarEntidade(Pedido recuperado, Pedido entidade) {
        return null;
    }
}
