package br.com.tiacademy.bebidas.controller;

import br.com.tiacademy.bebidas.core.crud.CrudController;
import br.com.tiacademy.bebidas.dto.request.RefrigeranteDtoRequest;
import br.com.tiacademy.bebidas.entity.Distribuidora;
import br.com.tiacademy.bebidas.entity.Refrigerante;
import br.com.tiacademy.bebidas.repository.DistribuidoraRepository;
import br.com.tiacademy.bebidas.service.RefrigeranteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.Objects;

@RestController
@RequestMapping("/refrigerantes")
public class RefrigeranteController extends CrudController<Refrigerante, Long> {

    @Autowired
    public RefrigeranteService service;
    @Autowired
    public DistribuidoraRepository distribuidoraRepository;

    @PostMapping("/{distribuidoraId}")
    public ResponseEntity<Object> save(@RequestBody RefrigeranteDtoRequest refrigeranteDto, @PathVariable("distribuidoraId") Long distribuidoraId) {
        Refrigerante refrigerante = new Refrigerante();

        Distribuidora distribuidora = distribuidoraRepository.findById(distribuidoraId).orElse(null);
        if (Objects.isNull(distribuidora)) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("distribuidora informada após /refrigerantes/ não existe, crie a distribuidora ou informe um id de distribuidora válido.");
        }
        refrigerante.setNome(refrigeranteDto.getNome());
        refrigerante.setAlcoolico(refrigerante.getAlcoolico());
        refrigerante.setData(refrigeranteDto.getData());
        refrigerante.setDistribuidora(distribuidora);

        return ResponseEntity.ok(service.save(refrigerante));
    }

    @GetMapping("/nome={name}")
    public ResponseEntity<Object> findByName(@PathVariable("name") String name) {
        try {
            return ResponseEntity.status(HttpStatus.OK).body(service.findByName(name));
        }
        catch (RuntimeException runtimeException) {
            return ResponseEntity.status(HttpStatus.ACCEPTED).body(service.findAll());
        }
    }
}