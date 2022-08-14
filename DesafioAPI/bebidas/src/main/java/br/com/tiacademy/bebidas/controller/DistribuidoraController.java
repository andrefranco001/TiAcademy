package br.com.tiacademy.bebidas.controller;

import br.com.tiacademy.bebidas.core.crud.CrudController;
import br.com.tiacademy.bebidas.entity.Distribuidora;
import br.com.tiacademy.bebidas.service.DistribuidoraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/distribuidoras")
public class DistribuidoraController extends CrudController<Distribuidora, Long> {

    @Autowired
    public DistribuidoraService service;

    @GetMapping("/nome={name}")
    public ResponseEntity<Object> findByName(@PathVariable("name") String name) {
        try {
            return ResponseEntity.ok(service.findByName(name));
        }
        catch (RuntimeException runtimeException) {
            return ResponseEntity.ok(service.findAll());
        }
    }
}