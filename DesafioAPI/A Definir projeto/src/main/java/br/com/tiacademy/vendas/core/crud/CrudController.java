package br.com.tiacademy.vendas.core.crud;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Objects;

public abstract class CrudController<T, ID> {

    @Autowired
    protected CrudService<T, ID> service;

    @GetMapping
    public ResponseEntity<List<T>> listar() {
        List<T> listaEntidade = service.listar();
        return ResponseEntity.ok(listaEntidade);
    }

    @GetMapping("/{id}")
    public ResponseEntity<T> porId(@PathVariable("id") ID id) {
        T resultado = service.porId(id);

        if (Objects.isNull(resultado)) {
            return ResponseEntity.notFound().build();
        } else {
            return ResponseEntity.ok(resultado);
        }
    }

    @PostMapping
    public ResponseEntity<T> salvar(@RequestBody T entidade) {
        T salvar = service.criar(entidade);
        return ResponseEntity.ok(salvar);
    }

    @PutMapping("/{id}")
    public ResponseEntity<T> editar(@PathVariable("id") ID id, @RequestBody T entidade){
        return ResponseEntity.ok(service.editar(id, entidade));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> excluir(@PathVariable("id") ID id) {
        service.excluir(id);
        return ResponseEntity.ok().build();
    }
}
