package br.com.tiacademy.bebidas.core.crud;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Objects;

public abstract class CrudController<T, ID> {

    @Autowired
    public CrudService<T, ID> service;

    @GetMapping
    public ResponseEntity<List<T>> findAll() {
        List<T> listarEntidade = service.findAll();
        return ResponseEntity.status(HttpStatus.OK).body(listarEntidade);
    }

    @GetMapping("/{id}")
    public ResponseEntity<T> findById(@PathVariable("id") ID id) {
        T serviceResponse = service.findById(id);

        if (Objects.isNull(serviceResponse)) {
            return ResponseEntity.notFound().build();
        }
        else {
            return ResponseEntity.ok(serviceResponse);
        }
    }

    @PostMapping
    public ResponseEntity<T> save(@RequestBody T entity) {
        return ResponseEntity.ok(service.save(entity));
    }

    @PutMapping("/{id}")
        public ResponseEntity<T> editSave(@RequestBody T entidade, @PathVariable("id") ID id) {
        return ResponseEntity.ok(service.editSave(entidade, id));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteById(@PathVariable("id") ID id) {
         service.deleteById(id);
        return ResponseEntity.ok().build();
    }
}