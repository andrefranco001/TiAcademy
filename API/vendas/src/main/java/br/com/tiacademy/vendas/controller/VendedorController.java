package br.com.tiacademy.vendas.controller;

import br.com.tiacademy.vendas.core.crud.CrudController;
import br.com.tiacademy.vendas.domain.Vendedor;
import br.com.tiacademy.vendas.dto.VendedorDTO;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/vendedor")
public class VendedorController extends CrudController<Vendedor, VendedorDTO, Long> {}