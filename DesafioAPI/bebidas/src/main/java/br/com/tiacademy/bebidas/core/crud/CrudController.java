package br.com.tiacademy.bebidas.core.crud;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Objects;

public abstract class CrudController<T, ID> {

    @Autowired
    public CrudService<T, ID> service;

    @GetMapping
    public ResponseEntity<List<T>> findAll() {
        List<T> listarEntidade = service.listAll();
        return ResponseEntity.ok(listarEntidade);
    }

    @GetMapping("/{id}")
    public ResponseEntity<T> findById(@PathVariable("id") ID id) {
        T serviceResponse = service.listById(id);

        if (Objects.isNull(serviceResponse)) {
            return ResponseEntity.notFound().build();
        }
        else {
            return ResponseEntity.ok(serviceResponse);
        }
    }

    @PostMapping
    public ResponseEntity<T> save(@RequestBody T entidade) {
        T salvar = service.save(entidade);
        return ResponseEntity.ok(salvar);
    }

    @PutMapping("/{id}")
        public ResponseEntity<T> editSave(@RequestBody T entidade, @PathVariable("id") ID id) {
        return ResponseEntity.ok(service.editSave(entidade, id));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable("id") ID id) {
         service.delete(id);
        return ResponseEntity.ok().build();
    }
}