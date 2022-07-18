package br.com.tiacademy.vendas.controller;

import br.com.tiacademy.vendas.domain.Vendedor;
import br.com.tiacademy.vendas.service.VendedorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Objects;

@RestController
@RequestMapping("/vendedor")
public class VendedorController {

    @Autowired
    private VendedorService vendedorService;

    @GetMapping
    public ResponseEntity<List<Vendedor>> listar() {
        List<Vendedor> vendedores = vendedorService.Listar();
        return ResponseEntity.ok(vendedores);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Vendedor> porId(@PathVariable("id") Long id){
        Vendedor resultado = vendedorService.porId(id);

        if (Objects.isNull(resultado)) {
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.ok(resultado);
    }

    @PostMapping
    public ResponseEntity<Vendedor> salvar(@RequestBody Vendedor vendedor) {
        Vendedor salvar = vendedorService.criar(vendedor);
        return ResponseEntity.ok(salvar);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Vendedor> editar(@PathVariable("id") Long id, @RequestBody Vendedor vendedor) {
        return ResponseEntity.ok(vendedorService.editar(id, vendedor));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> excluir(@PathVariable("id") Long id) {
        vendedorService.excluir(id);
        return ResponseEntity.ok().build();
    }
}