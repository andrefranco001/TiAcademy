package br.com.tiacademy.vendas.controller;

import br.com.tiacademy.vendas.core.crud.CrudController;
import br.com.tiacademy.vendas.domain.Pedido;
import br.com.tiacademy.vendas.dto.PedidoDTO;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pedido")
public class PedidoController extends CrudController<Pedido, PedidoDTO, Long> {}
